package penyimpanansudahhabis;

import alomani.Mobil;
import java.util.ArrayList;
import java.util.Scanner;
import process.mobiladmint;

public class showroommobil {
    @SuppressWarnings("FieldMayBeFinal")
    static ArrayList<Mobil> listMobil = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    @SuppressWarnings("FieldMayBeFinal")
    private mobiladmint admin;

    public showroommobil() {
        this.admin = new mobiladmint(this);
    }

    public ArrayList<Mobil> getListMobil() {
        return listMobil;
    }

    private Mobil inputDataMobil() {
        System.out.println("Masukkan ID Mobil: ");
        String IDMOB = input.nextLine();
        System.out.println("Masukkan Merk Mobil: ");
        String Merk = input.nextLine();
        System.out.println("Masukkan Model Mobil: ");
        String Model = input.nextLine();
        System.out.println("Masukkan Deskripsi Mobil: ");
        String Deskripsi = input.nextLine();
        System.out.println("Masukkan Harga Mobil: ");
        String Harga = input.nextLine();
        System.out.println("Masukkan Gambar Mobil: ");
        String Gambar = input.nextLine();
        System.out.println("Masukkan Status Mobil: ");
        String Status = input.nextLine();

        return new Mobil(IDMOB, Deskripsi, Model, Merk, Harga, Gambar, Status);
    }

    public void addMobil() {
        Mobil mobilbaru = inputDataMobil();
        admin.tambahMobil(mobilbaru.getIDMOB(), mobilbaru.getDeskripsi(), mobilbaru.getModel(), mobilbaru.getMerk(), mobilbaru.getHarga(), mobilbaru.getGambar(), mobilbaru.getStatus());

        System.out.println("Mobil" + mobilbaru.getIDMOB() + " berhasil ditambah");
    }

    public void lihatMobil() {
        if (listMobil.isEmpty()) {
            System.out.println("Mobil tidak tersedia");
        } else {
            for (Mobil mobil : listMobil) {
                mobil.printdetailmobil();
            }
        }
    }

    public Mobil cariMobil(String id) {
        for (Mobil mobil : listMobil) {
            if (mobil.getIDMOB().equals(id)) {
                return mobil;
            }
        }
        return null;
    }

    public void editMobil(String IDMOB) {
        Mobil mobil = cariMobil(IDMOB);
        if (mobil != null) {
            listMobil.remove(IDMOB);
            System.out.println("Mobil ditemukan. Pilih atribut yang ingin diedit:");
            System.out.println("1. Deskripsi");
            System.out.println("2. Model");
            System.out.println("3. Merk");
            System.out.println("4. Harga");
            System.out.println("5. Gambar");
            System.out.println("6. Status");
            System.out.print("Pilihan: ");
            int menuedit = input.nextInt();
            input.nextLine(); // Consume newline

            System.out.print("Masukkan nilai baru: ");
            String valueBaru = input.nextLine();

            switch (menuedit) {
                case 1:
                    mobil.setDeskripsi(valueBaru);
                    break;
                case 2:
                    mobil.setModel(valueBaru);
                    break;
                case 3:
                    mobil.setMerk(valueBaru);
                    break;
                case 4:
                    mobil.setHarga(valueBaru);
                    break;
                case 5:
                    mobil.setGambar(valueBaru);
                    break;
                case 6:
                    mobil.setStatus(valueBaru);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println("Mobil berhasil diperbarui!");
        } else {
            System.out.println("Mobil dengan ID " + IDMOB + " tidak ditemukan.");
        }
    }

    public void hapusMobil(String IDMOB) {
        Mobil mobil = cariMobil(IDMOB);
        if (mobil != null) {
            listMobil.remove(IDMOB);
            System.out.println("Mobil berhasil diperbarui!");

        } else {
            System.out.println("Mobil tidak ditemukan");
        }
    }

}