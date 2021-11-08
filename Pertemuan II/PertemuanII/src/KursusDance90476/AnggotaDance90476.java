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
public class AnggotaDance90476 extends Manusia90476{
    private String umur90476;
    
    public AnggotaDance90476(String umur90476, 
    String nama90476, String noTelp90476,String alamat90476){
        super(nama90476,noTelp90476,alamat90476);
        this.umur90476 = umur90476;
    }
    
    public String getUmur90476(){
        return umur90476;
    }
    
    public void setUmur(String umur90476){
        this.umur90476 = umur90476;
    }
    
}
