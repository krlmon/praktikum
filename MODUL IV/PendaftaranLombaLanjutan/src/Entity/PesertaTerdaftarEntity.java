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
public class PesertaTerdaftarEntity {
    private PesertaLombaEntity pesertaEntity;
    private int indexLomba;
    private String kodePeserta;
    
    public PesertaTerdaftarEntity(PesertaLombaEntity pesertaEntity, 
    int indexLomba, String kodePeserta){
        this.pesertaEntity = pesertaEntity;
        this.indexLomba = indexLomba;
        this.kodePeserta = kodePeserta;
    }
    
    public PesertaLombaEntity getPesertaEntity(){
        return pesertaEntity;
    }
    public void setPesertaEntity(PesertaLombaEntity pesertaEntity){
        this.pesertaEntity = pesertaEntity;
    }
    
    public int getIndexLomba(){
        return indexLomba;
    }
    public void setIndexLomba(int indexLomba){
        this.indexLomba = indexLomba;
    }
    
    public String getKodePeserta(){
        return kodePeserta;
    }
    public void setKodePeserta(String kodePeserta){
        this.kodePeserta = kodePeserta;
    }
}
