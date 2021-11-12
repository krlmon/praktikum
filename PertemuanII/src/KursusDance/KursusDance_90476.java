/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KursusDance;

import java.util.Date;
import java.util.Scanner;

public class KursusDance_90476 {
    private static Scanner Input = new Scanner(System.in);
    private static AnggotaDance_90476[] AnggotaDance = 
        new AnggotaDance_90476[100];
    private static AdminDance_90476[] AdminDance = 
        new AdminDance_90476[100];
    private static AnggotaDanceAktif_90476[] AnggotaDanceAktif = 
        new AnggotaDanceAktif_90476[100];
    private static int PilDance;
    private static int JumAnggota=0;
    private static int CekAdmin;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dataAdmin_90476();
        int pil;
        do{
            System.out.println("Jumlah Anggota : "+JumAnggota);
            System.out.println("1. Login Admin");
            System.out.println("2. Lihat Anggota Aktif");
            System.out.println("3. Biodata Admin");
            System.out.print("Masukkan Pilihan : ");
            pil = Input.nextInt();
            Input.nextLine();
            switch(pil){
                case 1:
                    loginAdmin_90476();
                    break;
                case 2 :
                    viewAnggota_90476();
                    break;
                case 3:
                    viewAdmin_90476();
                    break;
            }
            
        }while(pil != 0);
        
    }

    
    static int dataAdmin_90476() {
        String[] namaAdmin = {"Agam", "Adit", "Dian", "Aji", "Rakha"};
        String[] passAdmin = {"01", "02", "03", "04", "05"};
        String[] noTelpAdmin = {"081","082","083","084","085","086","087"};
        String[] alamatAdmin = {"jl.","jl.","jl.","jl.","jl."};
        for (int i=0;i<namaAdmin.length;i++){
            AdminDance[i] = new AdminDance_90476(passAdmin[i], namaAdmin[i], noTelpAdmin[i], alamatAdmin[i]);
        }
        return namaAdmin.length;
    }

    
    static void loginAdmin_90476() {
        System.out.println("Nama : ");
        String nama = Input.next();
        System.out.println("Password : ");
        String password = Input.next();
        CekAdmin = login_90476(nama,password);
        System.out.println("Selamat Datang " + AdminDance[CekAdmin].getNama_90476());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " + JumAnggota);
            System.out.println("1. Daftarkan Anggota");
            System.out.println("2. Ubah Data Anggota");
            System.out.println("3. Lihat Anggota Aktif");
            System.out.println("4. Hapus Anggota");
            System.out.println("0. Log Out");
            pil = Input.nextInt();
            Input.nextLine();
            switch(pil){
                case 1:
                    insertAnggota_90476();
                    break;
                case 2:
                    updateAnggota_90476();
                    break;
                case 3:
                    viewAnggota_90476();
                    break;
                case 4:
                    deleteAnggota_90476();
                    break;
            }
        }while(pil != 0);
    }

    
    static int login_90476(String nama, String password){
        int Loop = 0;
        for(int i=0; i <= dataAdmin_90476(); i++){
            if(AdminDance[i].getNama_90476().equals(nama) && AdminDance[i].getPassword_90476().equals(password)){
                break;
            }else{
                    Loop++;
                    }
        }
        return Loop;
    }
    
    
    static void insertAnggota_90476(){
        System.out.println("Input Nama : ");
        String nama = Input.nextLine();
        System.out.println("Imput Umur : ");
        String umur = Input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = Input.nextLine();
        System.out.println("Input No. Telp : ");
        String noTelp = Input.nextLine();
        AnggotaDance[JumAnggota] = new AnggotaDance_90476(umur, nama, noTelp, alamat);
        insertDance90476();
    }
    
    static void insertDance90476(){
        System.out.println("Pilihan Dance : ");
        for(int i = 0;i <DaftarDance_90476.Dance.length;i++){
            System.out.println(i + ". " + DaftarDance_90476.Dance[i]);
        }
            System.out.println("Pilih Dance : ");
            PilDance = Input.nextInt();
            System.out.println("Input ID Anggota : ");
            String kodePeserta = Input.next();
            AnggotaDanceAktif[JumAnggota] = new AnggotaDanceAktif_90476(AnggotaDance[JumAnggota], PilDance, kodePeserta);
            JumAnggota = JumAnggota + 1;
    }
    
    
    static void updateAnggota_90476(){
        System.out.println("Masukkan ID Anggota yang mau di EDIT : ");
        String Search = Input.next();
        int Cari = 0;
        do{
            if (Cari == JumAnggota){
                System.err.println("Tidak Ada Data");
                break;
            }else if(AnggotaDanceAktif[Cari].getIdAnggota_90476().equals(Search)){
                int pilEdit;
                do{
                    System.out.println("Pilih data yang ingin di EDIT : ");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Nama");
                    System.out.println("3. Alamat");
                    System.out.println("4. No. Telp");
                    System.out.println("5. Umur");
                    System.out.println("6. Dance");
                    System.out.println("0. Exit");
                    pilEdit = Input.nextInt();
                   Input.nextLine();
                    if(pilEdit == 1){
                        System.out.println("=======================================");
                        System.out.println("ID Anggota : " + AnggotaDanceAktif[Cari].getIdAnggota_90476());
                        System.out.println("=======================================");
                        System.out.println("Nama : " + AnggotaDance[Cari].getNama_90476() 
                            + "\n Umur : " + AnggotaDance[Cari].getUmur_90476()
                            + "\n Alamat : " + AnggotaDance[Cari].getAlamat_90476()
                            + "\n No. Telp : " + AnggotaDance[Cari].getNoTelp_90476()
                            + "\n Dance : " + DaftarDance_90476.Dance[AnggotaDanceAktif[Cari].getIndexDance_90476()]);
                        System.out.println("=======================================");
                    }else if(pilEdit == 2){
                        System.out.println(" Ubah Nama : ");
                        String editNama = Input.nextLine();
                        AnggotaDance[Cari].setNama_90476(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = Input.nextLine();
                        AnggotaDance[Cari].setAlamat_90476(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah No. Telp :");
                        String editNotelp = Input.nextLine();
                        AnggotaDance[Cari].setNoTelp_90476(editNotelp);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = Input.nextLine();
                        AnggotaDance[Cari].setUmur_90476(editUmur);
                    }else if(pilEdit == 6){
                        System.out.println("Pilihan Dance : ");
                        for(int i=0; i < DaftarDance_90476.Dance.length;i++){
                            System.out.println(i + ". " + DaftarDance_90476.Dance[i]);
                        }
                        System.out.println("Pilih Dance : ");
                        int editLomba = Input.nextInt();
                        AnggotaDanceAktif[Cari].setIndexDance_90476(editLomba);
                    }
                }while(pilEdit != 0);
                break;
            }else{
                Cari = Cari = 1;
            }
        }while (true);
    }
    
    
    static void viewAnggota_90476() {
        if(JumAnggota == 0){
            System.out.println("Belum ada anggota terdaftar");
        }else{
            for(int i = 0; i < JumAnggota; i++){
                System.out.println("=======================================");
                System.out.println("ID Anggota : " + AnggotaDanceAktif[i].getIdAnggota_90476());
                System.out.println("=======================================");
                System.out.println("Nama : " + AnggotaDance[i].getNama_90476() 
                    + "\n Umur : " + AnggotaDance[i].getUmur_90476()
                    + "\n Alamat : " + AnggotaDance[i].getAlamat_90476()
                    + "\n No. Telp : " + AnggotaDance[i].getNoTelp_90476()
                    + "\n Dance : " + DaftarDance_90476.Dance[AnggotaDanceAktif[i].getIndexDance_90476()]);
                System.out.println("=======================================");
            }
        }
    }
    
    static void viewAdmin_90476() {
        for(int i = 0; i < dataAdmin_90476(); i++){
                System.out.println("=======================================");
                System.out.println("Nama : " + AdminDance[i].getNama_90476() 
                    + "\n No. Telp : " + AdminDance[i].getNoTelp_90476()
                    + "\n Alamat : " + AdminDance[i].getAlamat_90476());
                System.out.println("=======================================");
        }
    }
    
    
    static void deleteAnggota_90476(){
        System.out.println("masukkan ID Anggota yang akan di HAPUS : ");
        String search = Input.nextLine();
        Input.nextLine();
        int cari = 0;
        do{
            if(cari == JumAnggota){
                System.out.println("Tidak Ada Data!");
                break;
            }else if(AnggotaDanceAktif[cari].getIdAnggota_90476().equals(search)){
                if(cari == JumAnggota - 1){
                    JumAnggota = JumAnggota = 1;
                }else{
                    for(int i=cari;i<JumAnggota;i++){
                        AnggotaDanceAktif[i] = AnggotaDanceAktif[i + 1];
                        AnggotaDance[i] = AnggotaDance[i + 1];
                    }
                    JumAnggota = JumAnggota - 1;
                }
                break;
            }else{
                cari = cari + 1;
            }
        }while(true);
    }
    }
