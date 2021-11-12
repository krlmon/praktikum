/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import Entity.PesertaLombaEntity_90476;
import Entity.LombaEntity_90476;
import Entity.PesertaTerdaftarEntity_90476;
import java.util.Scanner;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class PesertaProcess_90476  implements Interface_90476{
    private static Scanner Input = new Scanner(System.in);
    private static PesertaLombaEntity_90476[] Peserta = new PesertaLombaEntity_90476[100];
    private static PesertaTerdaftarEntity_90476[] PesertaTerdaftar = new PesertaTerdaftarEntity_90476[100];
    public static int JumPeserta = 0;
    
    /**
     * method getPeserta() dan getPesertaTerdaftar() fungsinya hampir sama
     * seperti method Accessor pada umumnya. yang digunakan untuk mengakses 
     * variabel yang tidak dapat diakses dari luar class
     * @return panitia yang berbentu Array.
     */
    
    public PesertaLombaEntity_90476[] getPeserta_90476(){
        return Peserta;
    }
    
    public PesertaTerdaftarEntity_90476[] getPesertaTerdaftar_90476(){
        return PesertaTerdaftar;
    }
    
    /**
     * method insert() berfungsi untuk memasukkan data ke dalam class Entity
     * sesuai dengah parameter yang telah ditentukan
     * @param nama menampung data nama peserta lomba
     * @param umur menampung data umur peserta lomba
     * @param alamat menampung data alamat peserta lomba
     * @param noTelp menampung data no. Telp peserta lomba
     */
    
    public void insert_90476(String nama, String umur, String alamat, String noTelp){
        Peserta[JumPeserta] = new PesertaLombaEntity_90476(umur, nama, noTelp, alamat);
    }
    
    /**
     * method insert() berfungsi untuk memasukkan data ke dalam class Entity
     * sesuai dengah parameter yang telah ditentukan
     * juga merupakan bentuk Overloading dari method insert() diatasnya
     * @param peserta menampung satu baris array dari PesertaEntity
     * @param index menampung data INT dari Index
     * @param kodePeserta menampung data dari Kode Peserta yang telah 
     * diberikan panitia
     */
    
    public void insert_90476(PesertaLombaEntity_90476 peserta, int index, String kodePeserta){
        PesertaTerdaftar[JumPeserta] = new PesertaTerdaftarEntity_90476(peserta, index, kodePeserta);
        JumPeserta = JumPeserta+1;
    }
    
    /**
     * method view() berfungsi untuk menampilkan data Peserta sesuai dengan 
     * data yang telah tersimpan di dalam
     */

    @Override
    public void view() {
        if(JumPeserta == 0){
            System.err.println("Belum ada peserta terdaftar");
        }else{
            for(int i = 0; i < JumPeserta; i++){
                System.out.println("==================================");
                System.out.println("Kode Peserta : " + PesertaTerdaftar[i].getKodePeserta_90476());
                System.out.println("==================================");
                System.out.println("Nama  : " + Peserta[i].getNama_90476()
                    + "\n Umur : " + Peserta[i].getUmur_90476()
                    + "\n Alamat : " + Peserta[i].getAlamat_90476()
                    + "\n No. Telp : " + Peserta[i].getNoTelp_90476()
                    + "\n Lomba : " + LombaEntity_90476.Lomba[PesertaTerdaftar[i].getIndexLomba_90476()]);
                System.out.println("==================================");
            }
        }
    }
    /**
     * method update() berfungsi untuk memperbarui data Peserta sesuai dengan 
     * kode Peserta yang dimasukkan
     */
    
    public void update_90476(){
        System.out.println("masukkan Kode peserta yang mau di EDIT : ");
        String search = Input.next();
        int cari = 0;
        do{
         if(cari == JumPeserta){
             System.err.println("Tidak Ada data");
             break;
         }else if(PesertaTerdaftar[cari].getKodePeserta_90476().equals(search)){
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
                    System.out.println("==================================");
                    System.out.println("Kode Pserta : " + PesertaTerdaftar[cari].getKodePeserta_90476());
                    System.out.println("==================================");
                    System.out.println("Nama : " + Peserta[cari].getNama_90476()
                        + "\n Umur : " + Peserta[cari].getUmur_90476()
                        + "\n Alamat : " + Peserta[cari].getAlamat_90476()
                        + "\n No. Telp : " + Peserta[cari].getNoTelp_90476()
                        + "\n Lomba : " + LombaEntity_90476.Lomba[PesertaTerdaftar[cari].getIndexLomba_90476()]);
                    System.out.println("==================================");
                 }else if(pilEdit == 2){
                        System.out.println(" Ubah Nama : ");
                        String editNama = Input.nextLine();
                        Peserta[cari].setNama_90476(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = Input.nextLine();
                        Peserta[cari].setAlamat_90476(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah No. Telp :");
                        String editNotelp = Input.nextLine();
                        Peserta[cari].setNoTelp_90476(editNotelp);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = Input.nextLine();
                        Peserta[cari].setUmur_90476(editUmur);
                    }else if(pilEdit == 6){
                        System.out.println("Pilih Lomba : ");
                        for(int i=0; i < LombaEntity_90476.Lomba.length;i++){
                            System.out.println(i + ". " + LombaEntity_90476.Lomba[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editLomba = Input.nextInt();
                        PesertaTerdaftar[cari].setIndexLomba_90476(editLomba);
                 }
             }while(pilEdit != 0);
             break;
         }else{
             cari = cari + 1;
         }
        }while(true);
    }
    
    
    /**
     * method delete() berfungsi untuk memindah data-data peserta sesuai 
     * dengan kode peserta yang dimasukkan yang tersimpan di dalam pesertaEntity
     * dan TerdaftarEntity ke array data selanjutnya sehingga tidak terbaca
     * oleh program lalu mengurangi jumlah jumPeserta
     */
    
    public void delete_90476(){
        System.out.println("masukkan Kode Peserta yang akan di HAPUS : ");
        String search = Input.nextLine();
        Input.nextLine();
        int cari = 0;
        do{
            if(cari == JumPeserta){
                System.err.println("Tidak Ada Data!");
                break;
            }else if(PesertaTerdaftar[cari].getKodePeserta_90476().equals(search)){
                if(cari == JumPeserta - 1){
                    JumPeserta = JumPeserta = 1;
                }else{
                    for(int i=cari;i<JumPeserta;i++){
                        PesertaTerdaftar[i] = PesertaTerdaftar[i + 1];
                        Peserta[i] = Peserta[i + 1];
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
