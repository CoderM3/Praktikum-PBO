package process;

import alomani.Pelanggan;
import penyimpanansudahhabis.datapelanggan;

public class pelangganadmint {
    private datapelanggan dataPelanggan;

    public pelangganadmint(datapelanggan dataPelanggan) {
        this.dataPelanggan = dataPelanggan;
    }

        public void tambahPelanggan(String NIK, String sandi, String username, String no_telp) {
            Pelanggan pelangganBaru = new Pelanggan(NIK, sandi, username, no_telp);
            dataPelanggan.getListPelanggan().add(pelangganBaru);
        }
}
