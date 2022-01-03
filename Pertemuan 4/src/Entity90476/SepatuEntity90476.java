/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity90476;

/**
 *
 * @author GENESIS
 */
public class SepatuEntity90476 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    private int Id;
    private String Merk, Ukuran,Stok;
    
    public SepatuEntity90476(){
    }
    public SepatuEntity90476(int id, String merk, String ukuran, String stok){
        this.Id = id;
        this.Merk = merk;
        this.Ukuran = ukuran;
        this.Stok = stok;
    }
    
    public void setId90476(int id){
        this.Id = id;
    }
    public int getId90476(){
        return this.Id;
    }
    
    public String getMerk90476(){
        return this.Merk;
    }
    public void setMerk90476(String merk){
        this.Merk = merk;
    }
    
    public String getUkuran90476(){
        return this.Ukuran;
    }
    public void setUkuran90476(String ukuran){
        this.Ukuran = ukuran;
    }
    
    public String getStok90476(){            
        return this.Stok;
    }
    public void setStok90476(String stok){
        this.Stok = stok;
    }

}
