/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller90476;

import Model90476.AllObjectModel90476;
import java.util.ArrayList;
import Entity90476.SepatuEntity90476;
import javax.swing.table.DefaultTableModel;

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
    
    public void insertSepatu90476(int id, String merk, String ukuran, String stok){
        AllObjectModel90476.sepatuModel.insertSepatuEntity90476(new SepatuEntity90476(id, merk, ukuran, stok));
    }
    
    public void updateSepatu90476(int id, String merk, String ukuran, String stok){
        AllObjectModel90476.sepatuModel.upadateSepatuEntity90476(new SepatuEntity90476(id, merk, ukuran, stok));
    }
    
    public void deleteSepatu90476(int id){
        AllObjectModel90476.sepatuModel.deleteSepatuEntity90476(id);
    }
    
    public DefaultTableModel daftarSepatu90476(){
        DefaultTableModel dataSepatu = new DefaultTableModel();
        Object[] kolom = {"ID", "MERK", "UKURAN", "STOK"};
        dataSepatu.setColumnIdentifiers(kolom);
        int size = getDataSepatu90476().size();
        for(int i = 0; i < size; i++){
            Object[] data = new Object[5];
            data[0] = AllObjectModel90476.sepatuModel.getSepatuEntity90476().get(i).getId90476();
            data[1] = AllObjectModel90476.sepatuModel.getSepatuEntity90476().get(i).getMerk90476();
            data[2] = AllObjectModel90476.sepatuModel.getSepatuEntity90476().get(i).getUkuran90476();
            data[3] = AllObjectModel90476.sepatuModel.getSepatuEntity90476().get(i).getStok90476();
            dataSepatu.addRow(data);
        }
        return dataSepatu;
    }
}
