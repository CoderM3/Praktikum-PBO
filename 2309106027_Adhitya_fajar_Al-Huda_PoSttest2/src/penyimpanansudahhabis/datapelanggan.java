package penyimpanansudahhabis;

import alomani.Mobil;
import alomani.Pelanggan;
import java.util.ArrayList;
import java.util.Scanner;
import process.pelangganadmint;

public class datapelanggan {
    static ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    private pelangganadmint admin;

    public datapelanggan() {
        this.admin = new pelangganadmint(this);
    }

    public ArrayList<Pelanggan> getListPelanggan() {
        return listPelanggan;
    }

    private Pelanggan inputDataPelanggan() {
        System.out.println("Masukkan NIK: ");
        String NIK = input.nextLine();
        System.out.println("Masukkan Username: ");
        String sandi = input.nextLine();
        System.out.println("Masukkan Sandi: ");
        String username = input.nextLine();
        System.out.println("Masukkan No Telp: ");
        String no_telp = input.nextLine();

        return new Pelanggan(NIK, sandi, username, no_telp);
    }

    public void addPelanggan() {
        Pelanggan pelangganbaru = inputDataPelanggan();
        admin.tambahPelanggan(pelangganbaru.getNIK(), pelangganbaru.getUsername(), pelangganbaru.getSandi(), pelangganbaru.getNoTelp());

        System.out.println("Mobil" + pelangganbaru.getNIK() + " berhasil ditambah");
    }

    public void lihatPelanggan() {
        if (listPelanggan.isEmpty()) {
            System.out.println("Tidak ada pelanggan yang tersedia");
        } else {
            for (Pelanggan pelanggan : listPelanggan) {
                pelanggan.printDetailPelanggan();
            }
        }
    }

    public Pelanggan cariPelanggan(String NIK) {
        for (Pelanggan pelanggan : listPelanggan) {
            if (pelanggan.getNIK() != null && pelanggan.getNIK().equals(NIK)) {
                return pelanggan;
            }
        }
        return null;
    }

//    public void editPelanggan(String NIK) {
//        Pelanggan pelanggan = cariPelanggan(NIK);
//        if (pelanggan != null) {
//            listPelanggan.remove(NIK);
//            System.out.println("Pelanggan ditemukan. Pilih atribut yang ingin diedit:");
//            System.out.println("1. Sandi");
//            System.out.println("2. Username");
//            System.out.println("3. No. Telp");
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
//                default:
//                    System.out.println("Pilihan tidak valid.");
//            }
//            System.out.println("Pelanggan berhasil diperbarui!");
//        } else {
//            System.out.println("Pelanggan dengan NIK " + NIK + " tidak ditemukan.");
//        }
//    }

    public void hapusPelanggan(String NIK) {
        Pelanggan pelanggan = cariPelanggan(NIK);
        if (pelanggan != null) {
            listPelanggan.remove(pelanggan);
            System.out.println("Pelanggan berhasil dihapus!");
        } else {
            System.out.println("Pelanggan tidak ditemukan");
        }
    }
}
