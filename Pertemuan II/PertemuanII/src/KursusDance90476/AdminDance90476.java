/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KursusDance90476;

/**
 *
 * @author GENESIS
 */
public class AdminDance90476 extends Manusia90476{
     private String password90476;
   
public AdminDance90476(String password90476, String nama90476, String noTelp90476, String alamat90476){
    super(nama90476,noTelp90476,alamat90476);
    this.password90476 = password90476;
}
public String getPassword90476(){
    return password90476;
}
public void setPassword90476(String password90476){
    this.password90476 = password90476;
}
}
