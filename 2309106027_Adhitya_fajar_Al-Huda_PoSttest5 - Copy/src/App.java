import java.util.Scanner;
import penyimpanansudahhabis.showroommobil;
import process.mobiladmint;
import process.pelangganadmint;
import penyimpanansudahhabis.datapelanggan;
import alomani.Pelanggan;

//class final
final class Stuff {
    //final attribute
    protected final String message = "Stop Judol";

    //final method
    protected final void obligatoryMessage() {
        System.out.println(message);
    }
}

abstract class User {
    public abstract void showMenu();
}

class AdminUser extends User {
    Scanner input = new Scanner(System.in);
    showroommobil showroom = new showroommobil();
    datapelanggan dataPelanggan = new datapelanggan();
    Stuff dis = new Stuff(); // Replacing the undefined class `letmesleeppls` with `Stuff`

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Selamat datang Admint");
            System.out.println("Sudahkah anda memberi kasih sayang terhadap member anda?");
            dis.obligatoryMessage();  // Calling the final method
            System.out.println("1. Cek Data Pelanggan");
            System.out.println("2. Cek Data Mobil");
            System.out.println("3. Keluar");
            System.out.println("===============================================================");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    viewPelanggan();
                    break;
                case 2:
                    viewMobil();
                    break;
                case 3:
                    System.out.println("Cya.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    public void viewMobil() {
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Serect ur curr");
            System.out.println("1. Lihat Mobil");
            System.out.println("2. Lihat Mobil berdasarkan Model");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Tambah");
            System.out.println("6. Keluar");
            System.out.println("===============================================================");
            int menu2 = input.nextInt();
            input.nextLine();

            switch (menu2) {
                case 1:
                    showroom.lihatMobil();
                    break;
                case 2:
                    System.out.println("Masukkan model mobil yang ingin dicari: ");
                    String model = input.nextLine();
                    showroom.lihatMobil(model);
                    break;
                case 3:
                    System.out.println("Masukkan merk mobil yang ingin dicari: ");
                    String merk = input.nextLine();
                    showroom.lihatMobilByMerk(merk);
                    break;
                case 4:
                    System.out.println("Ketik ID Mobil Disini: ");
                    String idmobil = input.nextLine();
                    showroom.editMobil(idmobil);
                    break;
                case 5:
                    System.out.println("Ketik ID Mobil Disini: ");
                    idmobil = input.nextLine();
                    showroom.hapusMobil(idmobil);
                    break;
                case 6:
                    showroom.addMobil();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    public void viewPelanggan() {
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Atur Pelanggan");
            System.out.println("1. Lihat");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Add");
            System.out.println("5. Exit");
            System.out.println("===============================================================");
            int menu2 = input.nextInt();
            input.nextLine();

            switch (menu2) {
                case 1:
                    dataPelanggan.lihatPelanggan();
                    break;
                case 4:
                    dataPelanggan.addPelanggan();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Fitur belum diimplementasikan.");
            }
        }
    }
}

class PelangganUser extends User {
    Scanner input = new Scanner(System.in);
    showroommobil showMobil = new showroommobil();
    Pelanggan loggedInUser;
    datapelanggan dataPelanggan;

    PelangganUser(Pelanggan user, datapelanggan dataPelanggan) {
        this.loggedInUser = user;
        this.dataPelanggan = dataPelanggan;
    }

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Selamat datang, " + loggedInUser.getUsername());
            System.out.println("Apa yang ingin Anda lakukan?");
            System.out.println("1. Lihat Mobil Tersedia");
            System.out.println("2. Sewa Mobil");
            System.out.println("3. Cek Riwayat Penyewaan");
            System.out.println("4. Keluar");
            System.out.println("===============================================================");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    showMobil.lihatMobil();
                    break;
                case 2:
                    rentMobil();
                    break;
                case 3:
                    viewRentalHistory();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    public void rentMobil() {
        System.out.println("Masukkan ID Mobil yang ingin disewa: ");
        String idMobil = input.nextLine();
        System.out.println("Mobil dengan ID " + idMobil + " berhasil disewa!");
    }

    public void viewRentalHistory() {
        System.out.println("Menampilkan riwayat penyewaan...");
    }
}

// Parent class that is now abstract and uses abstract method
public abstract class App {
    static Scanner input = new Scanner(System.in);
    static showroommobil showroom = new showroommobil();
    static mobiladmint admin = new mobiladmint(showroom);
    static datapelanggan dataPelanggan = new datapelanggan();

    public static void main(String[] args) throws Exception {
        System.out.println("\033\143");

        while (true) {
            User user = login();
            if (user != null) {
                user.showMenu();
            } else {
                // Removed the "Login gagal" here.
            }
        }
    }

    public static User login() {
        System.out.println("===== LOGIN =====");
        System.out.println("Pilih tipe login:");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Pelanggan");
        System.out.println("3. Register Pelanggan");
        System.out.print("Pilih opsi: ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                if (adminLogin()) {
                    return new AdminUser();
                }
                break;
            case 2:
                Pelanggan user = pelangganLogin();
                if (user != null) {
                    return new PelangganUser(user, dataPelanggan);
                }
                break;
            case 3:
                pelangganRegis();
                return null; // No login failure message, just exit the loop for retry.
            default:
                System.out.println("Pilihan tidak valid.");
        }

        return null;
    }

    public static boolean adminLogin() {
        String adminUsername = "admin123";
        String adminPassword = "password123";

        System.out.println("===== ADMIN LOGIN =====");
        System.out.print("Masukkan Username: ");
        String usernameInput = input.next();
        System.out.print("Masukkan Password: ");
        String passwordInput = input.next();

        return usernameInput.equals(adminUsername) && passwordInput.equals(adminPassword);
    }

    public static Pelanggan pelangganLogin() {
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan sandi: ");
        String sandi = input.nextLine();

        for (Pelanggan p : dataPelanggan.getListPelanggan()) {
            if (p.getNIK().equals(nik) && p.getSandi().equals(sandi)) {
                return p;
            }
        }

        return null;
    }

    public static void pelangganRegis() {
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan sandi: ");
        String sandi = input.nextLine();
        System.out.print("Masukkan Nomor Telpon: ");
        String no_telp = input.nextLine();

        Pelanggan pelangganBaru = new Pelanggan(nik, username, sandi, no_telp);
        dataPelanggan.tambahPelanggan(pelangganBaru);
        System.out.println("Pendaftaran berhasil! Silakan login.");
    }
}