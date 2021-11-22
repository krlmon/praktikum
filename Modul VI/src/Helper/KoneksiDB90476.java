/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author GENESIS
 */
public class KoneksiDB90476 {
    public static Connection getConnection90476(){
        Connection conn = null;
        String driver90476 = "com.mysql.cj.jdbc.Driver";
        String url90476 = "jdbc:mysql://localhost:3306/db_verifikasipendaftaran";
        String user90476 = "root";
        String pass90476 = "";
        try{
            Class.forName(driver90476);
            conn = DriverManager.getConnection(url90476, user90476, pass90476);
            System.out.println("Berhasil Koneksi Database");
        }catch(Exception e){
            System.err.println("Gagal Koneksi Database");
            e.printStackTrace();
        }
        return conn;
    }
}
