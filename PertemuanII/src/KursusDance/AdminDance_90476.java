/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KursusDance;

/**
 *
 * @author GENESIS
 */
public class AdminDance_90476 extends Manusia_90476{
     private String Password;
   
public AdminDance_90476(String password, String nama, String noTelp, String alamat){
    super(nama,noTelp,alamat);
    this.Password = password;
}
public String getPassword_90476(){
    return Password;
}
public void setPassword_90476(String password){
    this.Password = password;
}
}
