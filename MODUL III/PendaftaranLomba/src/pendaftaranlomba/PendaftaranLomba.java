
package pendaftaranlomba;

import java.util.Date;
import java.util.Scanner;
public class PendaftaranLomba {
    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);
    private static PesertaLombaEntity[] pesertaEntity = 
        new PesertaLombaEntity[100];
    private static PanitiaEntity[] panitiaEntity = 
        new PanitiaEntity[100];
    private static PesertaTerdaftarEntity[] pesertaTerdaftarEntity = 
        new PesertaTerdaftarEntity[100];
    private static int pilLomba;
    private static int jumPeserta=0;
    private static int cekPanitia;
    public static void main(String[] args) {
        // TODO code application logic here
        dataPanitia();
        int pil;
        do{
            System.out.println("Jumlah Peserta : "+jumPeserta);
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
                    viewPeserta();
                    break;
                case 3:
                    viewPanitia();
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
            panitiaEntity[i] = new PanitiaEntity(passPanitia[i], namaPanitia[i], noTelpPanitia[i], alamatPanitia[i]);
        }
        return namaPanitia.length;
    }

    /**
    *method loginPanitia ini berfungsi menyimpan input untuk Nama dan Password yang nantinya akan di cek,
    * setelah itu menampilkan pilihan-pilihan yang dapat dilakukan oleh Panitia
    */
    
    static void loginPanitia() {
        System.out.println("Nama : ");
        String nama = input.next();
        System.out.println("Password : ");
        String password = input.next();
        cekPanitia = login(nama,password);
        System.out.println("Selamat Datang " + panitiaEntity[cekPanitia].getNama());
        int pil;
        
        do{
            System.out.println("Jumlah Peserta : " + jumPeserta);
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
                    updatePeserta();
                    break;
                case 3:
                    viewPeserta();
                    break;
                case 4:
                    deletePeserta();
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
    
    static int login(String nama, String password){
        int loop = 0;
        for(int i=0; i <= dataPanitia(); i++){
            if(panitiaEntity[i].getNama().equals(nama) && panitiaEntity[i].getPassword().equals(password)){
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
    
    static void insertPeserta(){
        System.out.println("Input Nama : ");
        String nama = input.nextLine();
        System.out.println("Imput Umur : ");
        String umur = input.nextLine();
        System.out.println("Input Alamat : ");
        String alamat = input.nextLine();
        System.out.println("Input No. Telp : ");
        String noTelp = input.nextLine();
        pesertaEntity[jumPeserta] = new PesertaLombaEntity(umur, nama, noTelp, alamat);
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
            pesertaTerdaftarEntity[jumPeserta] = new PesertaTerdaftarEntity(pesertaEntity[jumPeserta], pilLomba, kodePeserta);
            jumPeserta = jumPeserta + 1;
    }
    
    /**
     * method updatePeserta berfungsi untuk memperbarui data Peserta sesuai 
     * dengan kodePeserta yang dimasukkan
    */
    
    static void updatePeserta(){
        System.out.println("Masukkan Kode Peserta yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;
        do{
            if (cari == jumPeserta){
                System.err.println("Tidak Ada Data");
                break;
            }else if(pesertaTerdaftarEntity[cari].getKodePeserta().equals(search)){
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
                        System.out.println("Kode peserta : " + pesertaTerdaftarEntity[cari].getKodePeserta());
                        System.out.println("=======================================");
                        System.out.println("Nama : " + pesertaEntity[cari].getNama() 
                            + "\n Umur : " + pesertaEntity[cari].getUmur()
                            + "\n Alamat : " + pesertaEntity[cari].getAlamat()
                            + "\n No. Telp : " + pesertaEntity[cari].getNoTelp()
                            + "\n Lomba : " + LombaEntity.lomba[pesertaTerdaftarEntity[cari].getIndexLomba()]);
                        System.out.println("=======================================");
                    }else if(pilEdit == 2){
                        System.out.println(" Ubah Nama : ");
                        String editNama = input.nextLine();
                        pesertaEntity[cari].setNama(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = input.nextLine();
                        pesertaEntity[cari].setAlamat(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah No. Telp :");
                        String editNotelp = input.nextLine();
                        pesertaEntity[cari].setNoTelp(editNotelp);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = input.nextLine();
                        pesertaEntity[cari].setUmur(editUmur);
                    }else if(pilEdit == 6){
                        System.out.println("Pilih Lomba : ");
                        for(int i=0; i < LombaEntity.lomba.length;i++){
                            System.out.println(i + ". " + LombaEntity.lomba[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editLomba = input.nextInt();
                        pesertaTerdaftarEntity[cari].setIndexLomba(editLomba);
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
    
    static void viewPeserta() {
        if(jumPeserta == 0){
            System.out.println("Belum ada perserta terdaftar");
        }else{
            for(int i = 0; i < jumPeserta; i++){
                System.out.println("=======================================");
                System.out.println("Kode Pserta : " + pesertaTerdaftarEntity[i].getKodePeserta());
                System.out.println("=======================================");
                System.out.println("Nama : " + pesertaEntity[i].getNama() 
                    + "\n Umur : " + pesertaEntity[i].getUmur()
                    + "\n Alamat : " + pesertaEntity[i].getAlamat()
                    + "\n No. Telp : " + pesertaEntity[i].getNoTelp()
                    + "\n Lomba : " + LombaEntity.lomba[pesertaTerdaftarEntity[i].getIndexLomba()]);
                System.out.println("=======================================");
            }
        }
    }
    
    /**
     * method viepanitia berfungsi untuk menampilkan data Peserta sesuai dengan 
     * data yang telah tersimpan didalam panitiaEntity
     */

    static void viewPanitia() {
        for(int i = 0; i < dataPanitia(); i++){
                System.out.println("=======================================");
                System.out.println("Nama : " + panitiaEntity[i].getNama() 
                    + "\n No. Telp : " + panitiaEntity[i].getNoTelp()
                    + "\n Alamat : " + panitiaEntity[i].getAlamat());
                System.out.println("=======================================");
        }
    }
    
    /**
     * method deletePeserta berfungsi untuk memindah data-data peserta sesuai 
     * dengan kode peserta yang dimasukkan yang tersimpan di dalam pesertaEntity
     * dan psertaTerdaftarEntity ke array data selanjutnya seehingga tidak terbaca
     * oleh program lalu mengurangi jumlah jumPeserta
     */
    
    static void deletePeserta(){
        System.out.println("masukkan Kode Peserta yang akan di HAPUS : ");
        String search = input.nextLine();
        input.nextLine();
        int cari = 0;
        do{
            if(cari == jumPeserta){
                System.out.println("Tidak Ada Data!");
                break;
            }else if(pesertaTerdaftarEntity[cari].getKodePeserta().equals(search)){
                if(cari == jumPeserta - 1){
                    jumPeserta = jumPeserta = 1;
                }else{
                    for(int i=cari;i<jumPeserta;i++){
                        pesertaTerdaftarEntity[i] = pesertaTerdaftarEntity[i + 1];
                        pesertaEntity[i] = pesertaEntity[i + 1];
                    }
                    jumPeserta = jumPeserta - 1;
                }
                break;
            }else{
                cari = cari + 1;
            }
        }while(true);
    }
}
