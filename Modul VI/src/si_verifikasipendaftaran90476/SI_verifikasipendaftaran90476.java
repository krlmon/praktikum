/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_verifikasipendaftaran90476;
import Controller.MahasiswaController90476;
import Entity.MahasiswaEntity90476;
/**
 *
 * @author GENESIS
 */
public class SI_verifikasipendaftaran90476 {
public static MahasiswaController90476 Mahasiswa = new MahasiswaController90476();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showData90476();
    }
    
    static void showData90476(){
        for(MahasiswaEntity90476 mahasiswaEntity90476 : Mahasiswa.getDataMahasiswa90476()){
            System.out.println("=============================================");
            System.out.println("id = " + mahasiswaEntity90476.getId90476());
            System.out.println("nama = " + mahasiswaEntity90476.getNama90476());
            System.out.println("npm = " + mahasiswaEntity90476.getNpm90476());
            System.out.println("pass = " + mahasiswaEntity90476.getPassword90476());
            System.out.println("no telp = " + mahasiswaEntity90476.getNotTelp90476());
            System.out.print("status = ");
            if(mahasiswaEntity90476.getStatus90476() == 0){
                System.out.println("Unverified");
            }else{
                System.out.println("Verified");
            }
        }
    }
}
