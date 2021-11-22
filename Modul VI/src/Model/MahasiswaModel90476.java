/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.MahasiswaEntity90476;
import Helper.KoneksiDB90476;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author GENESIS
 */
public class MahasiswaModel90476 {
 private String Sql;
 public Connection conn = KoneksiDB90476.getConnection90476();
 
 public ArrayList<MahasiswaEntity90476> getMahasiswaEntity90476(){
     ArrayList<MahasiswaEntity90476> arrayListMahasisa90476 = new ArrayList<>();
     try{
         Statement stat = conn.createStatement();
         Sql = "SELECT * FROM mahasiswa";
         ResultSet rs = stat.executeQuery(Sql);
         while(rs.next()){
             MahasiswaEntity90476 mahasiswaEntity90476 = new MahasiswaEntity90476();
             mahasiswaEntity90476.setId90476(rs.getInt("id"));
             mahasiswaEntity90476.setNama90476(rs.getString("nama"));
             mahasiswaEntity90476.setNpm90476(rs.getString("npm"));
             mahasiswaEntity90476.setPassword90476(rs.getString("password"));
             mahasiswaEntity90476.setNoTelp90476(rs.getString("noTelp"));
             mahasiswaEntity90476.setStatus(rs.getInt("status"));
             arrayListMahasisa90476.add(mahasiswaEntity90476);
         }
     }catch(SQLException e){
                 System.out.println(e);
         }
     return arrayListMahasisa90476;
 }
}
