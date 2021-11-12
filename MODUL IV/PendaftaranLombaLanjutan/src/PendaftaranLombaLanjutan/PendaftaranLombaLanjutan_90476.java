/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PendaftaranLombaLanjutan;

import Process.*;
import Entity.LombaEntity_90476;
import java.util.Scanner;
public class PendaftaranLombaLanjutan_90476 {
    private static Scanner Input = new Scanner(System.in);
    private static PanitiaProcess_90476 ProsesPanitia = new PanitiaProcess_90476();
    private static PesertaProcess_90476 ProsesPeserta = new PesertaProcess_90476();
    private static int PilLomba;
    private static int CekPanitia;
    
    public static void main(String[] args) {
        dataPanitia_90476();
        int pil;
        do{
            System.out.println("Jumlah Peserta : "+PesertaProcess_90476.JumPeserta);
            System.out.println("1. Login Panitia");
            System.out.println("2. Lihat Peserta Terdaftar");
            System.out.println("3. Biodata Panitia");
            pil = Input.nextInt();
            Input.nextLine();
            switch(pil){
                case 1:
                    loginPanitia_90476();
                    break;
                case 2 :
                    ProsesPeserta.view();
                    break;
                case 3:
                    ProsesPanitia.view();
                    break;
            }
            
        }while(pil != 0);
    }
    
    
    /**
    *method dataPanitia berfungsi untuk memasukkan data-data Panitia ke 
    * panitiaEntity
    * @return mengembalikan nilai dari total jumlah data yang telah 
    * dimasukkan dalam panitiaEntiry
    */
    static int dataPanitia_90476() {
        String namaPanitia[] = {"Agam", "Adit", "Dian", "Aji", "Rakha"};
        String passPanitia[] = {"01", "02", "03", "04", "05"};
        String noTelpPanitia[] = {"081","082","083","084","085","086","087"};
        String alamatPanitia[] = {"jl.","jl.","jl.","jl.","jl."};
        for (int i=0;i<namaPanitia.length;i++){
            ProsesPanitia.insert_90476(passPanitia, namaPanitia, noTelpPanitia, alamatPanitia);
        }
        return namaPanitia.length;
    }

    /**
    *method loginPanitia ini berfungsi menyimpan input untuk Nama dan Password 
    * yang nantinya akan di cek, setelah itu menampilkan pilihan-pilihan yang 
    * dapat dilakukan oleh Panitia
    */
    
    static void loginPanitia_90476() {
        System.out.println("Nama : ");
        String nama = Input.next();
        System.out.println("Password : ");
        String password = Input.next();
        CekPanitia = ProsesPanitia.cekData_90476(nama,password);
        System.out.println("Selamat Datang " + ProsesPanitia.getPanitia_90476()[CekPanitia].getNama_90476());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " + ProsesPeserta.JumPeserta);
            System.out.println("1. Daftarkan Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Lihat Peserta Terdaftar");
            System.out.println("4. Hapus Peserta");
            System.out.println("0. Log Out");
            pil = Input.nextInt();
            Input.nextLine();
            switch(pil){
                case 1:
                    insertPeserta_90476();
                    break;
                case 2:
                    ProsesPeserta.update_90476();
                    break;
                case 3:
                    ProsesPeserta.view();
                    break;
                case 4:
                    ProsesPeserta.delete_90476();
                    break;
            }
        }while(pil != 0);
    }
    
    /**
     * method insertPeserta berfungsi untuk memasukkan data ke dalam 
     * pesertaEntity sesuai dengan inputan yang dimasukkan oleh user
     */
    
    static void insertPeserta_90476(){
        System.out.println("Input Nama : ");
        String nama = Input.nextLine();
        System.out.println("Imput Umur : ");
        String umur = Input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = Input.nextLine();
        System.out.println("Input No. Telp : ");
        String noTelp = Input.nextLine();
        ProsesPeserta.insert_90476(nama, umur, alamat, noTelp);
        insertLomba_90476();
    }
    
    
    /**
     * method insertLomba berfungsi untuk memasukkan data ke dalam 
     * pesertaTerdaftarEntity dan menambah indikator indikator jumPeserta 
     * setelah mendapat inputan dari user beripa pilihan Lomba
     */
    
    static void insertLomba_90476(){
        System.out.println("Lomba : ");
        for(int i = 0;i <LombaEntity_90476.Lomba.length;i++){
            System.out.println(i + ". " + LombaEntity_90476.Lomba[i]);
        }
            System.out.println("Pilih Lomba : ");
            PilLomba = Input.nextInt();
            System.out.println("Input Kode Peserta : ");
            String kodePeserta = Input.next();
            ProsesPeserta.insert_90476(ProsesPeserta.getPeserta_90476()[ProsesPeserta.JumPeserta], PilLomba, kodePeserta);
    }
}
