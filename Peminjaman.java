package tubes_pbo_kelompok_17;

public class Peminjaman {
    private Barang[] pinjaman;
    private Anggota peminjam;
    private int statusPinjam = 0; // sudah dikembalikan 1, belum dikembalikan 0
    private String tglPinjam;
    private String tglKembali;
    private String tglTelat;
    private int denda = 0;
    private int idPinjam;

    public Peminjaman(int idPinjam) {
        this.idPinjam = idPinjam;
    }

    public Peminjaman(Barang[] pinjaman, Anggota peminjam) {
        this.pinjaman = pinjaman;
        this.peminjam = peminjam;
    }

    public Peminjaman(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public Barang[] getPinjaman() {
        return pinjaman;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public int getStatusPinjam() {
        return statusPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public String getTglTelat() {
        return tglTelat;
    }

    public int getDenda() {
        return denda;
    }

    public int getIdPinjam() {
        return idPinjam;
    }

    public void setPinjaman(Barang[] pinjaman) {
        this.pinjaman = pinjaman;
    }

    public void setPeminjam(Anggota peminjam) {
        this.peminjam = peminjam;
    }

    public void setStatusPinjam(int statusPinjam) {
        this.statusPinjam = statusPinjam;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public void setTglTelat(String tglTelat) {
        this.tglTelat = tglTelat;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public void setIdPinjam(int idPinjam) {
        this.idPinjam = idPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    
}
