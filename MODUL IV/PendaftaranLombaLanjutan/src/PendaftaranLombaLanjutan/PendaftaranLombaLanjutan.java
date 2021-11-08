/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PendaftaranLombaLanjutan;

import Process.*;
import Entity.LombaEntity;
import java.util.Scanner;
public class PendaftaranLombaLanjutan {
    private static Scanner input = new Scanner(System.in);
    private static PanitiaProcess prosesPanitia = new PanitiaProcess();
    private static PesertaProcess prosesPeserta = new PesertaProcess();
    private static int pilLomba;
    private static int cekPanitia;
    
    public static void main(String[] args) {
        dataPanitia();
        int pil;
        do{
            System.out.println("Jumlah Peserta : "+PesertaProcess.jumPeserta);
            System.out.println("1. Login Panitia");
            System.out.println("2. Lihat Peserta Terdaftar");
            System.out.println("3. Biodata Panitia");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    loginPanitia();
                    break;
                case 2 :
                    prosesPeserta.view();
                    break;
                case 3:
                    prosesPanitia.view();
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
    static int dataPanitia() {
        String namaPanitia[] = {"Agam", "Adit", "Dian", "Aji", "Rakha"};
        String passPanitia[] = {"01", "02", "03", "04", "05"};
        String noTelpPanitia[] = {"081","082","083","084","085","086","087"};
        String alamatPanitia[] = {"jl.","jl.","jl.","jl.","jl."};
        for (int i=0;i<namaPanitia.length;i++){
            prosesPanitia.insert(passPanitia, namaPanitia, noTelpPanitia, alamatPanitia);
        }
        return namaPanitia.length;
    }

    /**
    *method loginPanitia ini berfungsi menyimpan input untuk Nama dan Password 
    * yang nantinya akan di cek, setelah itu menampilkan pilihan-pilihan yang 
    * dapat dilakukan oleh Panitia
    */
    
    static void loginPanitia() {
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Password : ");
        String password = input.next();
        cekPanitia = prosesPanitia.cekData(nama,password);
        System.out.println("Selamat Datang " + prosesPanitia.getPanitia()[cekPanitia].getNama());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " + prosesPeserta.jumPeserta);
            System.out.println("1. Daftarkan Peserta");
            System.out.println("2. Ubah Data Peserta");
            System.out.println("3. Lihat Peserta Terdaftar");
            System.out.println("4. Hapus Peserta");
            System.out.println("0. Log Out");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    insertPeserta();
                    break;
                case 2:
                    prosesPeserta.update();
                    break;
                case 3:
                    prosesPeserta.view();
                    break;
                case 4:
                    prosesPeserta.delete();
                    break;
            }
        }while(pil != 0);
    }
    
    /**
     * method insertPeserta berfungsi untuk memasukkan data ke dalam 
     * pesertaEntity sesuai dengan inputan yang dimasukkan oleh user
     */
    
    static void insertPeserta(){
        System.out.println("Input Nama : ");
        String nama = input.nextLine();
        System.out.println("Imput Umur : ");
        String umur = input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.println("Input No. Telp : ");
        String noTelp = input.nextLine();
        prosesPeserta.insert(nama, umur, alamat, noTelp);
        insertLomba();
    }
    
    
    /**
     * method insertLomba berfungsi untuk memasukkan data ke dalam 
     * pesertaTerdaftarEntity dan menambah indikator indikator jumPeserta 
     * setelah mendapat inputan dari user beripa pilihan Lomba
     */
    
    static void insertLomba(){
        System.out.println("Lomba : ");
        for(int i = 0;i <LombaEntity.lomba.length;i++){
            System.out.println(i + ". " + LombaEntity.lomba[i]);
        }
            System.out.println("Pilih Lomba : ");
            pilLomba = input.nextInt();
            System.out.println("Input Kode Peserta : ");
            String kodePeserta = input.next();
            prosesPeserta.insert(prosesPeserta.getPeserta()[prosesPeserta.jumPeserta], pilLomba, kodePeserta);
    }
}
