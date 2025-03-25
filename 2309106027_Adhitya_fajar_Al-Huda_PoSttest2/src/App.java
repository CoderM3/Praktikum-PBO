import java.util.Scanner;
import penyimpanansudahhabis.showroommobil;
import process.mobiladmint;
import process.pelangganadmint;
import penyimpanansudahhabis.datapelanggan;
import alomani.Pelanggan;

class Stuff {
    protected String message = "Stop Judol";
    protected void obligatoryMessage(){System.out.println(message);}
}

class letmesleeppls extends Stuff{
    void displayiklan() {
        obligatoryMessage();
    }
}

class App{
    static Scanner input = new Scanner(System.in);
    static showroommobil showroom = new showroommobil();
    static mobiladmint admin = new mobiladmint(showroom);
    static letmesleeppls dis = new letmesleeppls();
    public static void main(String[] args) throws Exception {
        System.out.println("\033\143");

        if (!adminLogin()) {
            System.out.println("Login gagal. Program keluar.");
            return;
        }

        while (true) { 
            System.out.println("===============================================================");
            System.out.println("Selamat datang Admint");
            System.out.println("Sudahkah anda memberi kasih sayang terhadap member anda?");
            dis.obligatoryMessage();
            System.out.println("1.Cek Data Pelanggan");
            System.out.println("2.Cek Data Mobil");
            System.out.println("3.Cek Data Penyewaan");
            System.out.println("4.Cek Box Laporan");
            System.out.println("6.Keluar");
            System.out.println("===============================================================");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    viewPelanggan();
                    break;
                case 2:
                    viewMobil();
                    break;
                case 6:
                    System.out.println("Cya.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        }
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

    public static void viewMobil(){
        showroommobil showMobil = new showroommobil();
        while (true){
            System.out.println("===============================================================");
            System.out.println("Serect ur curr");
            System.out.println("1.Lihat Mobil");
            System.out.println("2.Edit");
            System.out.println("3.Delete");
            System.out.println("4.Tambah");
            System.out.println("6.Keluar");
            System.out.println("===============================================================");
            int menu2 = input.nextInt();
            input.nextLine();

            switch (menu2) {
                case 1:
                    showMobil.lihatMobil();
                    break;
                case 2:
                    System.out.println("Ketik ID Mobil Disini: ");
                    String idmobil = input.nextLine();
                    showMobil.editMobil(idmobil);
                    break;
                case 3:
                    System.out.println("Ketik ID Mobil Disini: ");
                    idmobil = input.nextLine();
                    showMobil.hapusMobil(idmobil);
                    break;
                case 4:
                    showMobil.addMobil();
                    break;
                case 6:
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void viewPelanggan() {
        datapelanggan dataPelanggan = new datapelanggan();
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
                case 2:
//                    System.out.println("Enter Customer NIK: ");
//                    String nik = input.nextLine();
//                    dataPelanggan.editPelanggan(nik);
                    break;
                case 3:
//                    System.out.println("Enter Customer NIK: ");
//                    NI = input.nextLine();
//                    dataPelanggan.hapusPelanggan(nik);
                    break;
                case 4:
                    dataPelanggan.addPelanggan();
                    break;
                case 5:
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }

}
