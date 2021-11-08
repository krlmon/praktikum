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
public class BiodataLombaEntity {
    protected String nama, noTelp,alamat;
    
    public BiodataLombaEntity(String nama, String noTelp, String alamat){
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }
    
    /**
     * function-function dibawah ini merupakan function getter dan setter (accessor)
     * yang digunakan untuk mengakses variabel yang terenkapsulasi (dalam kasus
     * ini protected)
     */
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNoTelp(){
        return noTelp;
    }
    
    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
