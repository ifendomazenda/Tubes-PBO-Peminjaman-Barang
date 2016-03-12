
package tubes_pbo_kelompok_17;

public class Barang {
    private String namabarang;
    private int idBarang;
    private int statusBarang; //sedang dipinjam = 1, sedang tidak dipinjam = 0
    private String kondisi; // layak, tidak layak, setengah layak
    private String jenis;

    public Barang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public int getStatusBarang() {
        return statusBarang;
    }

    public String getKondisi() {
        return kondisi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public void setStatusBarang(int statusBarang) {
        this.statusBarang = statusBarang;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

