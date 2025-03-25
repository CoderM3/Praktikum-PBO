//import penyimpanansudahhabis.datapelanggan;
//import penyimpanansudahhabis.showroommobil;
//import process.pelangganadmint;
//import alomani.Pelanggan;
//
//import java.util.Scanner;
//
//public class AppPelanggan {
//    static Scanner input = new Scanner(System.in);
//    static datapelanggan dataPelanggan = new datapelanggan();
//    static showroommobil showMobil = new showroommobil();
//
//    public static void main(String[] args) throws Exception {
//        System.out.println("\033\143");
//
//        while (true) {
//            datapelanggan dataPelanggan = new datapelanggan();
//            System.out.println("===== SELAMAT DATANG =====");
//            System.out.println("1. Register");
//            System.out.println("2. Login");
//            System.out.println("3. Keluar");
//            System.out.print("Pilih opsi: ");
//            int pilihan = input.nextInt();
//            input.nextLine();
//
//            switch (pilihan) {
//                case 1:
//                    dataPelanggan.addPelanggan();
//                    break;
//                case 2:
//                    if (!pelangganLogin()) {
//                        System.out.println("Login gagal. Silakan coba lagi.");
//                        continue; // Kembali ke menu utama
//                    }
//                    MenuPelanggan();
//                    return;
//                case 3:
//                    System.out.println("Terima kasih telah menggunakan layanan kami.");
//                    return;
//                default:
//                    System.out.println("Pilihan tidak valid, coba lagi.");
//            }
//        }
//    }
//
//    public static void MenuPelanggan() {
//        while (true) {
//            System.out.println("===============================================================");
//            System.out.println("Selamat datang Pelanggan");
//            System.out.println("Apa yang ingin Anda lakukan?");
//            System.out.println("1. Lihat Mobil Tersedia");
//            System.out.println("2. Sewa Mobil");
//            System.out.println("3. Cek Riwayat Penyewaan");
//            System.out.println("5. debug");
//            System.out.println("4. Keluar");
//            System.out.println("===============================================================");
//            int menu = input.nextInt();
//            input.nextLine();
//
//            switch (menu) {
//                case 1:
//                    viewMobil();
//                    break;
//                case 2:
//                    rentMobil();
//                    break;
//                case 3:
//                    viewRentalHistory();
//                    break;
//                case 4:
//                    System.out.println("Terima kasih telah menggunakan layanan kami.");
//                    return;
//                case 5:
//                    dataPelanggan.lihatPelanggan();
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid");
//                    break;
//            }
//        }
//    }
//
//
//    public static boolean pelangganLogin() {
//        System.out.println("===== PELANGGAN LOGIN =====");
//        System.out.print("Masukkan NIK Anda: ");
//        String nikInput = input.next();
//        return dataPelanggan.cariPelanggan(nikInput) != null;
//    }
//
//    public static void viewMobil() {
//        showMobil.lihatMobil();
//    }
//
//    public static void rentMobil() {
//        System.out.println("Masukkan ID Mobil yang ingin disewa: ");
//        String idMobil = input.nextLine();
//        System.out.println("Mobil dengan ID " + idMobil + " berhasil disewa!");
//    }
//
//    public static void viewRentalHistory() {
//        System.out.println("Menampilkan riwayat penyewaan...");
//    }
//}
//
