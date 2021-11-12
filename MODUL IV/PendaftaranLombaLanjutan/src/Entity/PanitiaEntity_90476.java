/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Administrator
 */
public class PanitiaEntity_90476 extends BiodataLombaEntity_90476 {
    private String password;
   
public PanitiaEntity_90476(String password, String nama, String noTelp, String alamat){
    super(nama,noTelp,alamat);
    this.password = password;
}
public String getPassword_90476(){
    return password;
}
public void setPassword_90476(String password){
    this.password = password;
}

}
