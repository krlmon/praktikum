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
public class PesertaTerdaftarEntity_90476 {
    private PesertaLombaEntity_90476 PesertaEntity;
    private int IndexLomba;
    private String KodePeserta;
    
    public PesertaTerdaftarEntity_90476(PesertaLombaEntity_90476 pesertaEntity, 
    int indexLomba, String kodePeserta){
        this.PesertaEntity = pesertaEntity;
        this.IndexLomba = indexLomba;
        this.KodePeserta = kodePeserta;
    }
    
    public PesertaLombaEntity_90476 getPesertaEntity_90476(){
        return PesertaEntity;
    }
    public void setPesertaEntity_90476(PesertaLombaEntity_90476 pesertaEntity){
        this.PesertaEntity = pesertaEntity;
    }
    
    public int getIndexLomba_90476(){
        return IndexLomba;
    }
    public void setIndexLomba_90476(int indexLomba){
        this.IndexLomba = indexLomba;
    }
    
    public String getKodePeserta_90476(){
        return KodePeserta;
    }
    public void setKodePeserta_90476(String kodePeserta){
        this.KodePeserta = kodePeserta;
    }
}
