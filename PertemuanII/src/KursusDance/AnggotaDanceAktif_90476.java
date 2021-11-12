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
    
public class AnggotaDanceAktif_90476 {
    private AnggotaDance_90476 AnggotaDance;
    private int IndexDance;
    private String IdAnggota;
    
    public AnggotaDanceAktif_90476(AnggotaDance_90476 anggotaDance, 
    int indexDance, String idAnggota){
        this.AnggotaDance = anggotaDance;
        this.IndexDance = indexDance;
        this.IdAnggota = idAnggota;
    }
    
    public AnggotaDance_90476 getAnggotaDance_90476(){
        return this.AnggotaDance;
    }
    public void setAnggotaDance_90476(AnggotaDance_90476 anggotaDance){
        this.AnggotaDance = anggotaDance;
    }
    
    public int getIndexDance_90476(){
        return IndexDance;
    }
    public void setIndexDance_90476(int indexDance){
        this.IndexDance = indexDance;
    }
    
    public String getIdAnggota_90476(){
        return IdAnggota;
    }
    public void setIdAnggota_9076(String idAnggota){
        this.IdAnggota = idAnggota;
    }
}
