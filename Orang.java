package tubes_pbo_kelompok_17;

public class Orang {
    private String nama;
    private int idOrang;
    private String tlahir;
    private String alamat;
    private String noTelp;
    private String statusOrang;

    public Orang(int idOrang) {
        this.idOrang = idOrang;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdOrang(int idOrang) {
        this.idOrang = idOrang;
    }

    public void setTlahir(String tlahir) {
        this.tlahir = tlahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setId(int idOrang) {
        this.idOrang = idOrang;
    }

    public void setStatusOrang(String statusOrang) {
        this.statusOrang = statusOrang;
    }

    public String getNama() {
        return nama;
    }

    public int getIdOrang() {
        return idOrang;
    }

    public String getTlahir() {
        return tlahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public int getId() {
        return idOrang;
    }

    public String getStatusOrang() {
        return statusOrang;
    }
}
