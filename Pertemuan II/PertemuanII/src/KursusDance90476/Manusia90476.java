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
public class Manusia90476 {
    
    protected String nama90476,noTelp90476,alamat90476;
    
    public Manusia90476(String nama90476, String noTelp90476, String alamat90476){
        this.nama90476 = nama90476;
        this.noTelp90476 = noTelp90476;
        this.alamat90476 = alamat90476;
    }
    
    public String getNama90476(){
        return nama90476;
    }
    
    public void setNama90476(String nama){
        this.nama90476 = nama;
    }
    
    public String getNoTelp90476(){
       return noTelp90476;
    }
    public void setNoTelp90476(String noTelp){
        this.noTelp90476 = noTelp;
    }
    public String getAlamat90476(){
       return alamat90476;
    }
    public void setAlamat90476(String alamat){
        this.alamat90476 = alamat;
    }
}
