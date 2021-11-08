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
public class PesertaLombaEntity extends BiodataLombaEntity{
    private String umur;
    
    public PesertaLombaEntity(String umur, 
    String nama, String noTelp,String alamat){
        super(nama,noTelp,alamat);
        this.umur = umur;
    }
    
    public String getUmur(){
        return umur;
    }
    
    public void setUmur(String umur){
        this.umur = umur;
    }
}
