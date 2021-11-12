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
public class AnggotaDance_90476 extends Manusia_90476{
    private String Umur;
    
    public AnggotaDance_90476(String umur, 
    String nama, String noTelp,String alamat){
        super(nama,noTelp,alamat);
        this.Umur = umur;
    }
    
    public String getUmur_90476(){
        return Umur;
    }
    
    public void setUmur_90476(String umur){
        this.Umur = umur;
    }
    
}
