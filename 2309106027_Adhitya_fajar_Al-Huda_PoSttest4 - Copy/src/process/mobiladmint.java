package process;

import alomani.Mobil;
import penyimpanansudahhabis.showroommobil;

public class mobiladmint {
    @SuppressWarnings("FieldMayBeFinal")
    private showroommobil showroom;
    public mobiladmint (showroommobil showroom){
        this.showroom = showroom;
    }
    public void tambahMobil(String IDMOB, String deskripsi, String model, String merk, String harga, String gambar, String status){
        Mobil mobilbaru = new Mobil(IDMOB, deskripsi, model, merk, harga, gambar, status);
        showroom.getListMobil().add(mobilbaru);
    }
     public void ubahMobil(Mobil mobil){

     }
}
