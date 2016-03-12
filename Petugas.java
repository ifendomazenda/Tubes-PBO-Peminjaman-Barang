package tubes_pbo_kelompok_17;

public class Petugas extends Orang{
    private String userPetugas;
    private String passPetugas;
    
    public Petugas(int idOrang) {
        super(idOrang);
    }

    public void setUserPetugas(String userPetugas){
        this.userPetugas = userPetugas;
    }

    public void setPassPetugas(String passPetugas) {
        this.passPetugas = passPetugas;
    }

    public String getUserPetugas() {
        return userPetugas;
    }

    public String getPassPetugas() {
        return passPetugas;
    }
    
    public int getIdPetugas(){
        return super.getIdOrang();
    }
    
    public boolean cekPetugas(String user, String pass){
        if (this.userPetugas.equals(user)){
            if (this.passPetugas.equals(pass)){
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

