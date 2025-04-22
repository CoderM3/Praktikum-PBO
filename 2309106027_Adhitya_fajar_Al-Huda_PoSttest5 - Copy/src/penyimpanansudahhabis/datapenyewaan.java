package penyimpanansudahhabis;

import alomani.Mobil;
import alomani.Pelanggan;
import java.util.ArrayList;
import java.util.Scanner;

import alomani.Penyewaan;
import process.penyewaanadmint;

public class datapenyewaan {
    static ArrayList<Penyewaan> listPenyewaan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    private penyewaanadmint admin;

    public datapenyewaan() {
        this.admin = new penyewaanadmint(this);
    }

    public ArrayList<Penyewaan> getListPenyewaan() {
        return listPenyewaan;
    }

    private String generateId() {
        return "SWA" + (listPenyewaan.size() + 1); // Auto ID
    }

    private Penyewaan inputDataPenyewaan(Pelanggan pelanggan) {
        System.out.println("=== Daftar Mobil Tersedia ===");
        showroommobil showroom = new showroommobil();
        ArrayList<Mobil> listMobil = showroom.getListMobil();

        if (listMobil.isEmpty()) {
            System.out.println("Tidak ada mobil tersedia.");
            return null;
        }

        for (Mobil mobil : listMobil) {
            mobil.printdetailmobil();
        }

        System.out.print("Masukkan ID Mobil yang ingin disewa: ");
        String idMobil = input.nextLine();
        Mobil mobilDipilih = showroom.cariMobil(idMobil);

        if (mobilDipilih == null) {
            System.out.println("Mobil dengan ID tersebut tidak ditemukan.");
            return null;
        }

        System.out.println("Masukkan tgl_mulai ");
        String tgl_mulai = input.nextLine();
        System.out.println("Masukkan tgl_selesai ");
        String tgl_selesai = input.nextLine();
        String status = "sedang disewa";

        admin.tambahPenyewaan(generateId(), tgl_mulai, tgl_selesai, "Sedang Disewa", mobilDipilih, pelanggan);
        return null;
    }

    public void addPenyewaan(Pelanggan pelanggan) {
        Penyewaan penyewaanBaru = inputDataPenyewaan(pelanggan);
        listPenyewaan.add(penyewaanBaru);
        System.out.println("Penyewaan berhasil ditambahkan untuk " + pelanggan.getUsername());
    }

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
}