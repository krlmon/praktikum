/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranlomba;

/**
 *
 * @author Administrator
 */
public class PanitiaEntity_90476 extends BiodataLombaEntity_90476 {
    private String Password;
   
public PanitiaEntity_90476(String password, String nama, String noTelp, String alamat){
    super(nama,noTelp,alamat);
    this.Password = password;
}
public String getPassword(){
    return Password;
}
public void setPassword(String password){
    this.Password = password;
}

}
