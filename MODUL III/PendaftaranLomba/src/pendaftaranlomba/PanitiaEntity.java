package pendaftaranlomba;

public class PanitiaEntity extends BiodataLombaEntity {
    private String password;
   
public PanitiaEntity(String password, String nama, String noTelp, String alamat){
    super(nama,noTelp,alamat);
    this.password = password;
}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password = password;
}

}
