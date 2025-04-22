package alomani;

public class Mobil {
    private String IDMOB;
    private String deskripsi;
    private String model;
    private String merk;
    private String harga;
    private String gambar;
    private String status;

    public Mobil(String IDMOB, String deskripsi, String model, String merk, String harga, String gambar, String status){
        this.IDMOB = IDMOB;
        this.deskripsi = deskripsi;
        this.model = model;
        this.merk = merk;
        this.harga = harga;
        this.gambar = gambar;
        this.status = status;
    }

    //getter
    public String getIDMOB(){
        return IDMOB;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public String getModel(){
        return model;
    }

    public String getMerk(){
        return merk;
    }

    public String getHarga(){
        return harga;
    }

    public String getGambar(){
        return gambar;
    }

    public String getStatus(){
        return status;
    }
    
    //setter

    public void setIDMOB(String IDMOB) {
        this.IDMOB = IDMOB;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printdetailmobil() {
        System.out.println("==============================");
        System.out.println("ID\t\t: " + this.IDMOB);
        System.out.println("Merk\t\t: " + this.merk);
        System.out.println("Model\t: " + this.model);
        System.out.println("Deskripsi\t: " + this.deskripsi);
        System.out.println("Terisi\t\t: " + this.harga);
        System.out.println("Gambar\t\t: " + this.gambar);
        System.out.println("Status\t\t: " + this.status);
        System.out.println("==============================");
    }
}
