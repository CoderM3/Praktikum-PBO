import java.util.Scanner;
import penyimpanansudahhabis.showroommobil;
import process.mobiladmint;
import process.pelangganadmint;
import penyimpanansudahhabis.datapelanggan;
import alomani.Pelanggan;

class Stuff {
    protected String message = "Stop Judol";
    protected void obligatoryMessage() {
        System.out.println(message);
    }
}

class letmesleeppls extends Stuff {
    void displayiklan() {
        obligatoryMessage();
    }
}

abstract class User {
    abstract void showMenu();
}

class AdminUser extends User {
    Scanner input = new Scanner(System.in);
    showroommobil showroom = new showroommobil();
    datapelanggan dataPelanggan = new datapelanggan();
    letmesleeppls dis = new letmesleeppls();

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Selamat datang Admint");
            System.out.println("Sudahkah anda memberi kasih sayang terhadap member anda?");
            dis.obligatoryMessage();
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
                    showroom.lihatMobil(model);  // View cars by model (overloaded method)
                    break;
                case 3:
                    System.out.println("Masukkan merk mobil yang ingin dicari: ");
                    String merk = input.nextLine();
                    showroom.lihatMobilByMerk(merk);  // View cars by merk (overloaded method)
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
    datapelanggan dataPelanggan = new datapelanggan();
    Pelanggan loggedInUser;

    PelangganUser(Pelanggan user) {
        this.loggedInUser = user;
    }

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("===============================================================");
            System.out.println("Selamat datang");
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

public class App {
    static Scanner input = new Scanner(System.in);
    static showroommobil showroom = new showroommobil();
    static mobiladmint admin = new mobiladmint(showroom);
    static datapelanggan dataPelanggan = new datapelanggan();

    public static void main(String[] args) throws Exception {
        System.out.println("\033\143");

        User user = login();
        if (user == null) {
            System.out.println("Login gagal. Program keluar.");
            return;
        }

        user.showMenu();
    }

    public static User login() {
        System.out.println("===== LOGIN =====");
        System.out.println("Pilih tipe login:");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Pelanggan");
        System.out.print("Pilih opsi: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            if (adminLogin()) {
                return new AdminUser();
            }
        } else if (pilihan == 2) {
            Pelanggan user = pelangganLogin();
            if (user != null) {
                return new PelangganUser(user);
            }
        } else {
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

        System.out.println("Login gagal. NIK atau sandi salah.");
        return null;
    }
}
