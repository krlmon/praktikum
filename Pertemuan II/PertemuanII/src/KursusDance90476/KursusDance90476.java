/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KursusDance90476;

import java.util.Date;
import java.util.Scanner;

public class KursusDance90476 {
    private static Scanner input = new Scanner(System.in);
    private static AnggotaDance90476[] anggotaDance90476 = 
        new AnggotaDance90476[100];
    private static AdminDance90476[] adminDance90476 = 
        new AdminDance90476[100];
    private static AnggotaDanceAktif90476[] anggotaDanceAktif90476 = 
        new AnggotaDanceAktif90476[100];
    private static int pilDance90476;
    private static int jumAnggota90476=0;
    private static int cekAdmin90476;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dataAdmin90476();
        int pil;
        do{
            System.out.println("Jumlah Anggota : "+jumAnggota90476);
            System.out.println("1. Login Admin");
            System.out.println("2. Lihat Anggota Aktif");
            System.out.println("3. Biodata Admin");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    loginAdmin90476();
                    break;
                case 2 :
                    viewAnggota90476();
                    break;
                case 3:
                    viewAdmin90476();
                    break;
            }
            
        }while(pil != 0);
        
    }

    
    static int dataAdmin90476() {
        String namaPanitia[] = {"Agam", "Adit", "Dian", "Aji", "Rakha"};
        String passPanitia[] = {"01", "02", "03", "04", "05"};
        String noTelpPanitia[] = {"081","082","083","084","085","086","087"};
        String alamatPanitia[] = {"jl.","jl.","jl.","jl.","jl."};
        for (int i=0;i<namaPanitia.length;i++){
            adminDance90476[i] = new AdminDance90476(passPanitia[i], namaPanitia[i], noTelpPanitia[i], alamatPanitia[i]);
        }
        return namaPanitia.length;
    }

    
    static void loginAdmin90476() {
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Password : ");
        String password = input.next();
        cekAdmin90476 = login90476(nama,password);
        System.out.println("Selamat Datang " + adminDance90476[cekAdmin90476].getNama90476());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " + jumAnggota90476);
            System.out.println("1. Daftarkan Anggota");
            System.out.println("2. Ubah Data Anggota");
            System.out.println("3. Lihat Anggota Aktif");
            System.out.println("4. Hapus Anggota");
            System.out.println("0. Log Out");
            pil = input.nextInt();
            input.nextLine();
            switch(pil){
                case 1:
                    insertAnggota90476();
                    break;
                case 2:
                    updateAnggota90476();
                    break;
                case 3:
                    viewAnggota90476();
                    break;
                case 4:
                    deleteAnggota90476();
                    break;
            }
        }while(pil != 0);
    }

    
    static int login90476(String nama, String password){
        int loop = 0;
        for(int i=0; i <= dataAdmin90476(); i++){
            if(adminDance90476[i].getNama90476().equals(nama) && adminDance90476[i].getPassword90476().equals(password)){
                break;
            }else{
                    loop++;
                    }
        }
        return loop;
    }
    
    
    static void insertAnggota90476(){
        System.out.println("Input Nama : ");
        String nama = input.nextLine();
        System.out.println("Imput Umur : ");
        String umur = input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.println("Input No. Telp : ");
        String noTelp = input.nextLine();
        anggotaDance90476[jumAnggota90476] = new AnggotaDance90476(umur, nama, noTelp, alamat);
        insertDance90476();
    }
    
    static void insertDance90476(){
        System.out.println("Dance : ");
        for(int i = 0;i <DaftarDance90476.dance90476.length;i++){
            System.out.println(i + ". " + DaftarDance90476.dance90476[i]);
        }
            System.out.println("Pilih Dance : ");
            pilDance90476 = input.nextInt();
            System.out.println("Input ID Anggota : ");
            String kodePeserta = input.next();
            anggotaDanceAktif90476[jumAnggota90476] = new AnggotaDanceAktif90476(anggotaDance90476[jumAnggota90476], pilDance90476, kodePeserta);
            jumAnggota90476 = jumAnggota90476 + 1;
    }
    
    
    static void updateAnggota90476(){
        System.out.println("Masukkan ID Anggota yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;
        do{
            if (cari == jumAnggota90476){
                System.err.println("Tidak Ada Data");
                break;
            }else if(anggotaDanceAktif90476[cari].getIdAnggota90476().equals(search)){
                int pilEdit;
                do{
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");
                    System.out.println("4. No. Telp");
                    System.out.println("5. Umur");
                    System.out.println("6. Lomba");
                    System.out.println("0. Exit");
                    pilEdit = input.nextInt();
                   input.nextLine();
                    if(pilEdit == 1){
                        System.out.println("=======================================");
                        System.out.println("ID Anggota : " + anggotaDanceAktif90476[cari].getIdAnggota90476());
                        System.out.println("=======================================");
                        System.out.println("Nama : " + anggotaDance90476[cari].getNama90476() 
                            + "\n Umur : " + anggotaDance90476[cari].getUmur90476()
                            + "\n Alamat : " + anggotaDance90476[cari].getAlamat90476()
                            + "\n No. Telp : " + anggotaDance90476[cari].getNoTelp90476()
                            + "\n Lomba : " + DaftarDance90476.dance90476[anggotaDanceAktif90476[cari].getIndexDance90476()]);
                        System.out.println("=======================================");
                    }else if(pilEdit == 2){
                        System.out.println(" Ubah Nama : ");
                        String editNama = input.nextLine();
                        anggotaDance90476[cari].setNama90476(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = input.nextLine();
                        anggotaDance90476[cari].setAlamat90476(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah No. Telp :");
                        String editNotelp = input.nextLine();
                        anggotaDance90476[cari].setNoTelp90476(editNotelp);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = input.nextLine();
                        anggotaDance90476[cari].setUmur(editUmur);
                    }else if(pilEdit == 6){
                        System.out.println("Pilih Lomba : ");
                        for(int i=0; i < DaftarDance90476.dance90476.length;i++){
                            System.out.println(i + ". " + DaftarDance90476.dance90476[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editLomba = input.nextInt();
                        anggotaDanceAktif90476[cari].setIndexDance90476(editLomba);
                    }
                }while(pilEdit != 0);
                break;
            }else{
                cari = cari = 1;
            }
        }while (true);
    }
    
    
    static void viewAnggota90476() {
        if(jumAnggota90476 == 0){
            System.out.println("Belum ada perserta terdaftar");
        }else{
            for(int i = 0; i < jumAnggota90476; i++){
                System.out.println("=======================================");
                System.out.println("ID Anggota : " + anggotaDanceAktif90476[i].getIdAnggota90476());
                System.out.println("=======================================");
                System.out.println("Nama : " + anggotaDance90476[i].getNama90476() 
                    + "\n Umur : " + anggotaDance90476[i].getUmur90476()
                    + "\n Alamat : " + anggotaDance90476[i].getAlamat90476()
                    + "\n No. Telp : " + anggotaDance90476[i].getNoTelp90476()
                    + "\n Lomba : " + DaftarDance90476.dance90476[anggotaDanceAktif90476[i].getIndexDance90476()]);
                System.out.println("=======================================");
            }
        }
    }
    
    static void viewAdmin90476() {
        for(int i = 0; i < dataAdmin90476(); i++){
                System.out.println("=======================================");
                System.out.println("Nama : " + adminDance90476[i].getNama90476() 
                    + "\n No. Telp : " + adminDance90476[i].getNoTelp90476()
                    + "\n Alamat : " + adminDance90476[i].getAlamat90476());
                System.out.println("=======================================");
        }
    }
    
    
    static void deleteAnggota90476(){
        System.out.println("masukkan ID Anggota yang akan di HAPUS : ");
        String search = input.nextLine();
        input.nextLine();
        int cari = 0;
        do{
            if(cari == jumAnggota90476){
                System.out.println("Tidak Ada Data!");
                break;
            }else if(anggotaDanceAktif90476[cari].getIdAnggota90476().equals(search)){
                if(cari == jumAnggota90476 - 1){
                    jumAnggota90476 = jumAnggota90476 = 1;
                }else{
                    for(int i=cari;i<jumAnggota90476;i++){
                        anggotaDanceAktif90476[i] = anggotaDanceAktif90476[i + 1];
                        anggotaDance90476[i] = anggotaDance90476[i + 1];
                    }
                    jumAnggota90476 = jumAnggota90476 - 1;
                }
                break;
            }else{
                cari = cari + 1;
            }
        }while(true);
    }
    }
