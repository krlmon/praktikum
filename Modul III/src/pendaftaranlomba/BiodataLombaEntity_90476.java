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
public class BiodataLombaEntity_90476 {
    protected String Nama,NoTelp,Alamat;
    
    public BiodataLombaEntity_90476(String nama, String noTelp, String alamat){
        this.Nama = nama;
        this.NoTelp = noTelp;
        this.Alamat = alamat;
    }
    
    public String getNama_90476(){
        return Nama;
    }
    
    public void setNama_90476(String nama){
        this.Nama = nama;
    }
    
    public String getNoTelp_90476(){
       return NoTelp;
    }
    public void setNoTelp_90476(String noTelp){
        this.NoTelp = noTelp;
    }
    public String getAlamat_90476(){
       return Alamat;
    }
    public void setAlamat_90476(String alamat){
        this.Alamat = alamat;
    }
}