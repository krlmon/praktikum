
package pendaftaranlomba;

public class PesertaLombaEntity extends BiodataLombaEntity{
    private String umur90476;
    
    public PesertaLombaEntity(String umur90476, 
    String nama90476, String noTelp90476,String alamat90476){
        super(nama90476,noTelp90476,alamat90476);
        this.umur90476 = umur90476;
    }
    
    public String getUmur(){
        return umur90476;
    }
    
    public void setUmur(String umur90476){
        this.umur90476 = umur90476;
    }
}
