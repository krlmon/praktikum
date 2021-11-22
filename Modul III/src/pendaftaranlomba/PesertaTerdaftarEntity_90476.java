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
public class PesertaTerdaftarEntity_90476 {
    private PesertaLombaEntity_90476 pesertaEntity;
    private int indexLomba;
    private String kodePeserta;
    
    public PesertaTerdaftarEntity_90476(PesertaLombaEntity_90476 pesertaEntity, 
    int indexLomba, String kodePeserta){
        this.pesertaEntity = pesertaEntity;
        this.indexLomba = indexLomba;
        this.kodePeserta = kodePeserta;
    }
    
    public PesertaLombaEntity_90476 getPesertaEntity_90476(){
        return pesertaEntity;
    }
    public void setPesertaEntity_90476(PesertaLombaEntity_90476 pesertaEntity){
        this.pesertaEntity = pesertaEntity;
    }
    
    public int getIndexLomba_90476(){
        return indexLomba;
    }
    public void setIndexLomba_90476(int indexLomba){
        this.indexLomba = indexLomba;
    }
    
    public String getKodePeserta_90476(){
        return kodePeserta;
    }
    public void setKodePeserta_90476(String kodePeserta){
        this.kodePeserta = kodePeserta;
    }
}
