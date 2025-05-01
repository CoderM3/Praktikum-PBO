package process;
import alomani.Pelanggan;
import penyimpanansudahhabis.datapelanggan;

public interface ILogin {
    // Static method for admin login
    static boolean adminLogin(String username, String password) {
        String adminUsername = "admin123";
        String adminPassword = "password123";

        return username.equals(adminUsername) && password.equals(adminPassword);
    }

    // Static method for customer login (accept datapelanggan as argument)
    static boolean pelangganLogin(String nik, String sandi, datapelanggan dataPelanggan) {
        // Now we can access getListPelanggan() properly with the instance
        for (Pelanggan p : dataPelanggan.getListPelanggan()) {
            if (p.getNIK().equals(nik) && p.getSandi().equals(sandi)) {
                return true;
            }
        }
        return false;
    }
}