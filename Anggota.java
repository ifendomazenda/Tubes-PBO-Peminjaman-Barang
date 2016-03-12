package tubes_pbo_kelompok_17;

public class Anggota extends Orang{
    private String userAnggota;
    private String passAnggota;

    public Anggota(int id) {
        super(id);
    }

    public void setUserAnggota(String userAnggota) {
        this.userAnggota = userAnggota;
    }

    public void setPassAnggota(String passAnggota) {
        this.passAnggota = passAnggota;
    }

    public String getPassAnggota() {
        return passAnggota;
    }

    public String getUserAnggota() {
        return userAnggota;
    }            
    
    public int getIdAnggota(){
        return super.getIdOrang();
    }
    
    public boolean cekAnggota(String user, String pass){
        if (this.userAnggota.equals(user)){
            if (this.passAnggota.equals(pass)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}


