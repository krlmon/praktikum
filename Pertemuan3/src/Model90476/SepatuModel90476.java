/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model90476;
import Entity90476.SepatuEntity90476;
import Config90476.KoneksiDb90476;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author GENESIS
 */
public class SepatuModel90476 {
 private String Sql;
 public Connection conn = KoneksiDb90476.getConnection90476();
 
 public ArrayList<SepatuEntity90476> getSepatuEntity90476(){
     ArrayList<SepatuEntity90476> arrayLisSepatu = new ArrayList<>();
     try{
         Statement stat = conn.createStatement();
         Sql = "SELECT * FROM m_sepatu";
         ResultSet rs = stat.executeQuery(Sql);
         while(rs.next()){
             SepatuEntity90476 sepatuEntity = new SepatuEntity90476();
             sepatuEntity.setId90476(rs.getInt("ID"));
             sepatuEntity.setMerk90476(rs.getString("MERK"));
             sepatuEntity.setUkuran90476(rs.getString("UKURAN"));
             sepatuEntity.setStok90476(rs.getInt("STOK"));
             arrayLisSepatu.add(sepatuEntity);
         }
     }catch(SQLException e){
                 System.out.println(e);
         }
     return arrayLisSepatu;
 }
 
 public void insertSepatuEntity90476(SepatuEntity90476 sepatuEntity90476){
     try{
         
         Sql = "INSERT INTO m_sepatu (MERK, UKURAN, STOK) VALUES (?,?,?)";
         PreparedStatement stat = conn.prepareStatement(Sql);
         stat.setString(1,sepatuEntity90476.getMerk90476());
         stat.setString(2, sepatuEntity90476.getUkuran90476());
         stat.setInt(3, sepatuEntity90476.getStok90476());
         stat.executeUpdate();
    }catch(SQLException e){
            System.out.println("GAGAL INPUT");
          System.out.println(e);
   }
 }
 
 public void upadateSepatuEntity90476(SepatuEntity90476 sepatuEntity90476){
     try{
         Sql = "Update m_sepatu  SET MERK = ?, UKURAN = ?, STOK = ? WHERE ID = ? ";
         PreparedStatement stat = conn.prepareStatement(Sql);
         stat.setString(1,sepatuEntity90476.getMerk90476());
         stat.setString(2, sepatuEntity90476.getUkuran90476());
         stat.setInt(3, sepatuEntity90476.getStok90476());
         stat.setInt(4,sepatuEntity90476.getId90476());
         stat.executeUpdate();
    }catch(SQLException e){
            System.out.println("GAGAL MERUBAH DATA");
          System.out.println(e);
   }
 }
 
 
 public void deleteSepatuEntity90476(int id){
     try{
         Sql = "DELETE FROM m_sepatu WHERE ID = ? ";
         PreparedStatement stat = conn.prepareStatement(Sql);
         stat.setInt(1,id);
         stat.executeUpdate();
    }catch(SQLException e){
            System.out.println("GAGAL MENGHAPUS");
          System.out.println(e);
   }
 }
}
