package tubes_pbo_kelompok_17;

public class Orang {
    private String nama;
    private int idOrang;
    private String tlahir;
    private String alamat;
    private long noTelp;
    private int id;
    private String statusOrang;

    public Orang(int id) {
        this.id = id;
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

    public void setNoTelp(long noTelp) {
        this.noTelp = noTelp;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getNoTelp() {
        return noTelp;
    }

    public int getId() {
        return id;
    }

    public String getStatusOrang() {
        return statusOrang;
    }
}

