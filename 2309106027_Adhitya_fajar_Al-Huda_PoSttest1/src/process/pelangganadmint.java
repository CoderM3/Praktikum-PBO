package process;

import alomani.Pelanggan;
import penyimpanansudahhabis.datapelanggan;

public class pelangganadmint {
    private datapelanggan dataPelanggan;

    public pelangganadmint(datapelanggan dataPelanggan) {
        this.dataPelanggan = dataPelanggan;
    }

    public void tambahPelanggan(String NIK, String sandi, String username, String noTelp, String status) {
        Pelanggan pelangganBaru = new Pelanggan(NIK, sandi, username, noTelp, status);
        dataPelanggan.getListPelanggan().add(pelangganBaru);
    }

    public void ubahPelanggan(Pelanggan pelanggan) {
        // Implement functionality to modify a customer's details
    }
}
