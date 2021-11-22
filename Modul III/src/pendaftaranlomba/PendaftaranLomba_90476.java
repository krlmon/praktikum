/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaranlomba;

/**
 *
 * @author Administrator
 */
import java.util.Date;
import java.util.Scanner;
public class PendaftaranLomba_90476 {
    /**
     * @param args the command line arguments
     */
    private static Scanner Input = new Scanner(System.in);
    private static PesertaLombaEntity_90476[] PesertaEntity = 
        new PesertaLombaEntity_90476[100];
    private static PanitiaEntity_90476[] PanitiaEntity = 
        new PanitiaEntity_90476[100];
    private static PesertaTerdaftarEntity_90476[] PesertaTerdaftarEntity = 
        new PesertaTerdaftarEntity_90476[100];
    private static int PilLomba;
    private static int JumPeserta=0;
    private static int CekPanitia;
    public static void main(String[] args) {
        // TODO code application logic here
        dataPanitia_90476();
        int pil;
        do{
            System.out.println("Jumlah Peserta : "+JumPeserta);
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
                    viewPeserta_90476();
                    break;
                case 3:
                    viewPanitia_90476();
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
            PanitiaEntity[i] = new PanitiaEntity_90476(passPanitia[i], namaPanitia[i], noTelpPanitia[i], alamatPanitia[i]);
        }
        return namaPanitia.length;
    }

    /**
    *method loginPanitia ini berfungsi menyimpan input untuk Nama dan Password yang nantinya akan di cek,
    * setelah itu menampilkan pilihan-pilihan yang dapat dilakukan oleh Panitia
    */
    
    static void loginPanitia_90476() {
        System.out.println("Nama : ");
        String nama = Input.next();
        System.out.println("Password : ");
        String password = Input.next();
        CekPanitia = login_90476(nama,password);
        System.out.println("Selamat Datang " + PanitiaEntity[CekPanitia].getNama_90476());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " + JumPeserta);
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
                    updatePeserta_90476();
                    break;
                case 3:
                    viewPeserta_90476();
                    break;
                case 4:
                    deletePeserta_90476();
                    break;
            }
        }while(pil != 0);
    }

    /**
     * fungsi method login ini yaitu menangkap masukan berupa nama dan password 
     * lalu melakukan pengecekan terhadapnya
     * @param nama merupakan nama dari Panitia yang tersimpan dalam panitiaEntity
     * @param password merupakan password dari panitia yang tersimpan dalam panitiaEntity
     * @return mengembalikan nilai yang digunakan untuk menentukan apakah 
     * nama dan password yang dimasukkan betul atau salah
     */
    
    static int login_90476(String nama, String password){
        int loop = 0;
        for(int i=0; i <= dataPanitia_90476(); i++){
            if(PanitiaEntity[i].getNama_90476().equals(nama) && PanitiaEntity[i].getPassword().equals(password)){
                break;
            }else{
                    loop++;
                    }
        }
        return loop;
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
        PesertaEntity[JumPeserta] = new PesertaLombaEntity_90476(umur, nama, noTelp, alamat);
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
            PesertaTerdaftarEntity[JumPeserta] = new PesertaTerdaftarEntity_90476(PesertaEntity[JumPeserta], PilLomba, kodePeserta);
            JumPeserta = JumPeserta + 1;
    }
    
    /**
     * method updatePeserta berfungsi untuk memperbarui data Peserta sesuai 
     * dengan kodePeserta yang dimasukkan
    */
    
    static void updatePeserta_90476(){
        System.out.println("Masukkan Kode Peserta yang mau di EDIT : ");
        String search = Input.next();
        int cari = 0;
        do{
            if (cari == JumPeserta){
                System.err.println("Tidak Ada Data");
                break;
            }else if(PesertaTerdaftarEntity[cari].getKodePeserta_90476().equals(search)){
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
                    pilEdit = Input.nextInt();
                   Input.nextLine();
                    if(pilEdit == 1){
                        System.out.println("=======================================");
                        System.out.println("Kode peserta : " + PesertaTerdaftarEntity[cari].getKodePeserta_90476());
                        System.out.println("=======================================");
                        System.out.println("Nama : " + PesertaEntity[cari].getNama_90476() 
                            + "\n Umur : " + PesertaEntity[cari].getUmur_90476()
                            + "\n Alamat : " + PesertaEntity[cari].getAlamat_90476()
                            + "\n No. Telp : " + PesertaEntity[cari].getNoTelp_90476()
                            + "\n Lomba : " + LombaEntity_90476.Lomba[PesertaTerdaftarEntity[cari].getIndexLomba_90476()]);
                        System.out.println("=======================================");
                    }else if(pilEdit == 2){
                        System.out.println(" Ubah Nama : ");
                        String editNama = Input.nextLine();
                        PesertaEntity[cari].setNama_90476(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = Input.nextLine();
                        PesertaEntity[cari].setAlamat_90476(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah No. Telp :");
                        String editNotelp = Input.nextLine();
                        PesertaEntity[cari].setNoTelp_90476(editNotelp);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = Input.nextLine();
                        PesertaEntity[cari].setUmur_90476(editUmur);
                    }else if(pilEdit == 6){
                        System.out.println("Pilih Lomba : ");
                        for(int i=0; i < LombaEntity_90476.Lomba.length;i++){
                            System.out.println(i + ". " + LombaEntity_90476.Lomba[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editLomba = Input.nextInt();
                        PesertaTerdaftarEntity[cari].setIndexLomba_90476(editLomba);
                    }
                }while(pilEdit != 0);
                break;
            }else{
                cari = cari = 1;
            }
        }while (true);
    }
    
    /**
     * method viepeserta berfungsi untuk menampilkan data Peserta sesuai dengan 
     * data yang telah tersimpan di dalam pesertaEntity
     */
    
    static void viewPeserta_90476() {
        if(JumPeserta == 0){
            System.out.println("Belum ada perserta terdaftar");
        }else{
            for(int i = 0; i < JumPeserta; i++){
                System.out.println("=======================================");
                System.out.println("Kode Pserta : " + PesertaTerdaftarEntity[i].getKodePeserta_90476());
                System.out.println("=======================================");
                System.out.println("Nama : " + PesertaEntity[i].getNama_90476() 
                    + "\n Umur : " + PesertaEntity[i].getUmur_90476()
                    + "\n Alamat : " + PesertaEntity[i].getAlamat_90476()
                    + "\n No. Telp : " + PesertaEntity[i].getNoTelp_90476()
                    + "\n Lomba : " + LombaEntity_90476.Lomba[PesertaTerdaftarEntity[i].getIndexLomba_90476()]);
                System.out.println("=======================================");
            }
        }
    }
    
    /**
     * method viepanitia berfungsi untuk menampilkan data Peserta sesuai dengan 
     * data yang telah tersimpan didalam panitiaEntity
     */

    static void viewPanitia_90476() {
        for(int i = 0; i < dataPanitia_90476(); i++){
                System.out.println("=======================================");
                System.out.println("Nama : " + PanitiaEntity[i].getNama_90476() 
                    + "\n No. Telp : " + PanitiaEntity[i].getNoTelp_90476()
                    + "\n Alamat : " + PanitiaEntity[i].getAlamat_90476());
                System.out.println("=======================================");
        }
    }
    
    /**
     * method deletePeserta berfungsi untuk memindah data-data peserta sesuai 
     * dengan kode peserta yang dimasukkan yang tersimpan di dalam pesertaEntity
     * dan psertaTerdaftarEntity ke array data selanjutnya seehingga tidak terbaca
     * oleh program lalu mengurangi jumlah jumPeserta
     */
    
    static void deletePeserta_90476(){
        System.out.println("masukkan Kode Peserta yang akan di HAPUS : ");
        String search = Input.nextLine();
        Input.nextLine();
        int cari = 0;
        do{
            if(cari == JumPeserta){
                System.out.println("Tidak Ada Data!");
                break;
            }else if(PesertaTerdaftarEntity[cari].getKodePeserta_90476().equals(search)){
                if(cari == JumPeserta - 1){
                    JumPeserta = JumPeserta = 1;
                }else{
                    for(int i=cari;i<JumPeserta;i++){
                        PesertaTerdaftarEntity[i] = PesertaTerdaftarEntity[i + 1];
                        PesertaEntity[i] = PesertaEntity[i + 1];
                    }
                    JumPeserta = JumPeserta - 1;
                }
                break;
            }else{
                cari = cari + 1;
            }
        }while(true);
    }
}
