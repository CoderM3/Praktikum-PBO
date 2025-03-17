package alomani;

public class Pelanggan {
    private String NIK;
    private String sandi;
    private String username;
    private String no_telp;
    private String status;

    public Pelanggan() {}

    public Pelanggan(String NIK, String sandi, String username, String no_telp, String status) {
        this.NIK = NIK;
        this.sandi = sandi;
        this.username = username;
        this.no_telp = no_telp;
        this.status = status;
    }

    public String getNIK() {
        return NIK;
    }

    public String getSandi() {
        return sandi;
    }

    public String getUsername() {
        return username;
    }

    public String getNoTelp() {
        return no_telp;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setSandi(String sandi) {
        this.sandi = sandi;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNoTelp(String no_telp) {
        this.no_telp = no_telp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printDetailPelanggan() {
        System.out.println("==============================");
        System.out.println("NIK\t\t: " + this.NIK);
        System.out.println("Username\t: " + this.username);
        System.out.println("No. Telp\t: " + this.no_telp);
        System.out.println("Status\t\t: " + this.status);
        System.out.println("==============================");
    }
}
