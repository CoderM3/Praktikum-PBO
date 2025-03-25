//package penyimpanansudahhabis;
//
//package penyimpanansudahhabis;
//
//import alomani.Pelanggan;
//import java.util.ArrayList;
//import java.util.Scanner;
//import process.pelangganadmint;
//
//public class datapenyewaan {
//    static ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
//    static Scanner input = new Scanner(System.in);
//    private pelangganadmint admin;
//
//    public datapelanggan() {
//        this.admin = new pelangganadmint(this);
//    }
//
//    public ArrayList<Pelanggan> getListPelanggan() {
//        return listPelanggan;
//    }
//
//    private Pelanggan inputDataPelanggan() {
//        System.out.println("Masukkan NIK: ");
//        String NIK = input.nextLine();
//        System.out.println("Masukkan Username: ");
//        String Username = input.nextLine();
//        System.out.println("Masukkan Sandi: ");
//        String Sandi = input.nextLine();
//        System.out.println("Masukkan No. Telp: ");
//        String NoTelp = input.nextLine();
//        System.out.println("Masukkan Status: ");
//        String Status = input.nextLine();
//
//        return new Pelanggan(NIK, Sandi, Username, NoTelp, Status);
//    }
//
//    public void addPelanggan() {
//        Pelanggan pelangganBaru = inputDataPelanggan();
//        admin.tambahPelanggan(pelangganBaru.getNIK(), pelangganBaru.getSandi(), pelangganBaru.getUsername(), pelangganBaru.getNoTelp(), pelangganBaru.getStatus());
//
//        System.out.println("Pelanggan " + pelangganBaru.getNIK() + " berhasil ditambah");
//    }
//
//    public void lihatPelanggan() {
//        if (listPelanggan.isEmpty()) {
//            System.out.println("Tidak ada pelanggan yang tersedia");
//        } else {
//            for (Pelanggan pelanggan : listPelanggan) {
//                pelanggan.printDetailPelanggan();
//            }
//        }
//    }
//
//    public Pelanggan cariPelanggan(String NIK) {
//        for (Pelanggan pelanggan : listPelanggan) {
//            if (pelanggan.getNIK().equals(NIK)) {
//                return pelanggan;
//            }
//        }
//        return null;
//    }
//
//    public void editPelanggan(String NIK) {
//        Pelanggan pelanggan = cariPelanggan(NIK);
//        if (pelanggan != null) {
//            listPelanggan.remove(NIK);
//            System.out.println("Pelanggan ditemukan. Pilih atribut yang ingin diedit:");
//            System.out.println("1. Sandi");
//            System.out.println("2. Username");
//            System.out.println("3. No. Telp");
//            System.out.println("4. Status");
//            System.out.print("Pilihan: ");
//            int menuedit = input.nextInt();
//            input.nextLine(); // Consume newline
//
//            System.out.print("Masukkan nilai baru: ");
//            String valueBaru = input.nextLine();
//
//            switch (menuedit) {
//                case 1:
//                    pelanggan.setSandi(valueBaru);
//                    break;
//                case 2:
//                    pelanggan.setUsername(valueBaru);
//                    break;
//                case 3:
//                    pelanggan.setNoTelp(valueBaru);
//                    break;
//                case 4:
//                    pelanggan.setStatus(valueBaru);
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid.");
//            }
//            System.out.println("Pelanggan berhasil diperbarui!");
//        } else {
//            System.out.println("Pelanggan dengan NIK " + NIK + " tidak ditemukan.");
//        }
//    }
//
//    public void hapusPelanggan(String NIK) {
//        Pelanggan pelanggan = cariPelanggan(NIK);
//        if (pelanggan != null) {
//            listPelanggan.remove(pelanggan);
//            System.out.println("Pelanggan berhasil dihapus!");
//        } else {
//            System.out.println("Pelanggan tidak ditemukan");
//        }
//    }
//}
//
//WIP, NEXT PATCH WILL BE IMPLEMENTED
