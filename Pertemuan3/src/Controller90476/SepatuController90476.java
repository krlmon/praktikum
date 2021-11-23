/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller90476;

import java.util.ArrayList;
import Entity90476.SepatuEntity90476;

/**
 *
 * @author GENESIS
 */
public class SepatuController90476 {
    
/**
 *
 * @author GENESIS
 */
    public ArrayList<SepatuEntity90476> getDataSepatu90476(){
        return AllObjectModel90476.sepatuModel.getSepatuEntity90476();
    }
    
    public void insertSepatu90476(int id, String merk, String ukuran, int stok){
        AllObjectModel90476.sepatuModel.insertSepatuEntity90476(new SepatuEntity90476(id, merk, ukuran, stok));
    }
    
    public void updateSepatu90476(int id, String merk, String ukuran, int stok){
        AllObjectModel90476.sepatuModel.upadateSepatuEntity90476(new SepatuEntity90476(id, merk, ukuran, stok));
    }
    
    public void deleteSepatu90476(int id){
        AllObjectModel90476.sepatuModel.deleteSepatuEntity90476(id);
    }
}
