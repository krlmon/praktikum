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
    
public class AnggotaDanceAktif90476 {
    private AnggotaDance90476 anggotaDance90476;
    private int indexDance90476;
    private String idAnggota90476;
    
    public AnggotaDanceAktif90476(AnggotaDance90476 anggotaDance90476, 
    int indexDance90476, String idAnggota90476){
        this.anggotaDance90476 = anggotaDance90476;
        this.indexDance90476 = indexDance90476;
        this.idAnggota90476 = idAnggota90476;
    }
    
    public AnggotaDance90476 getAnggotaDance90476(){
        return this.anggotaDance90476;
    }
    public void setAnggotaDance90476(AnggotaDance90476 anggotaDance90476){
        this.anggotaDance90476 = anggotaDance90476;
    }
    
    public int getIndexDance90476(){
        return indexDance90476;
    }
    public void setIndexDance90476(int indexDance90476){
        this.indexDance90476 = indexDance90476;
    }
    
    public String getIdAnggota90476(){
        return idAnggota90476;
    }
    public void setIdAnggota9076(String idAnggota90476){
        this.idAnggota90476 = idAnggota90476;
    }
}
