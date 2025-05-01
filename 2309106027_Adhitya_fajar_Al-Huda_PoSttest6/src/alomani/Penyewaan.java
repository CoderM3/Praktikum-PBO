package alomani;

public class Penyewaan {
    private String id_penyewaan;
    private String tgl_mulai;
    private String tgl_selesai;
    private String status;
    private Mobil mobil;
    private Pelanggan pelanggan;

    public Penyewaan() {}

    public Penyewaan(String id_penyewaan, String tgl_mulai, String tgl_selesai, String status, Mobil mobil, Pelanggan pelanggan) {
        this.id_penyewaan = id_penyewaan;
        this.tgl_mulai = tgl_mulai;
        this.tgl_selesai = tgl_selesai;
        this.status = status;
        this.mobil = mobil;
        this.pelanggan = pelanggan;
    }

    // Getters
    public String getId_penyewaan() {
        return id_penyewaan;
    }

    public String getTgl_mulai() {
        return tgl_mulai;
    }

    public String getTgl_selesai(){
        return tgl_selesai;
    }

    public String getStatus() {
        return status;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    // Setters
    public void setId_penyewaan(String id_penyewaan) {
        this.id_penyewaan = id_penyewaan;
    }

    public void setTgl_mulai(String tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public void setTgl_selesai(String tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
}
