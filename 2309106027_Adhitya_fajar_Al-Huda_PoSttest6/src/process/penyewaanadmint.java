package process;
import alomani.Mobil;
import alomani.Pelanggan;
import alomani.Penyewaan;
import penyimpanansudahhabis.datapenyewaan;

public class penyewaanadmint {
    private datapenyewaan dataPenyewaan;

    public penyewaanadmint(datapenyewaan dataPenyewaan) {
        this.dataPenyewaan = dataPenyewaan;
    }

    public void tambahPenyewaan(String id_penyewaan, String tgl_mulai, String tgl_selesai, String status, Mobil mobil, Pelanggan pelanggan) {
        Penyewaan penyewaanBaru = new Penyewaan(id_penyewaan, tgl_mulai, tgl_selesai, status, mobil, pelanggan);
        dataPenyewaan.getListPenyewaan().add(penyewaanBaru);
    }
}