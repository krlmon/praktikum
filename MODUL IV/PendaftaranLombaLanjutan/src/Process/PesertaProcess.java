/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import Entity.PesertaLombaEntity;
import Entity.LombaEntity;
import Entity.PesertaTerdaftarEntity;
import java.util.Scanner;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class PesertaProcess  implements Interface{
    private static Scanner input = new Scanner(System.in);
    private static PesertaLombaEntity[] peserta = new PesertaLombaEntity[100];
    private static PesertaTerdaftarEntity[] pesertaTerdaftar = new PesertaTerdaftarEntity[100];
    public static int jumPeserta = 0;
    
    /**
     * method getPeserta() dan getPesertaTerdaftar() fungsinya hampir sama
     * seperti method Accessor pada umumnya. yang digunakan untuk mengakses 
     * variabel yang tidak dapat diakses dari luar class
     * @return panitia yang berbentu Array.
     */
    
    public PesertaLombaEntity[] getPeserta(){
        return peserta;
    }
    
    public PesertaTerdaftarEntity[] getPesertaTerdaftar(){
        return pesertaTerdaftar;
    }
    
    /**
     * method insert() berfungsi untuk memasukkan data ke dalam class Entity
     * sesuai dengah parameter yang telah ditentukan
     * @param nama menampung data nama peserta lomba
     * @param umur menampung data umur peserta lomba
     * @param alamat menampung data alamat peserta lomba
     * @param noTelp menampung data no. Telp peserta lomba
     */
    
    public void insert(String nama, String umur, String alamat, String noTelp){
        peserta[jumPeserta] = new PesertaLombaEntity(umur, nama, noTelp, alamat);
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
    
    public void insert(PesertaLombaEntity peserta, int index, String kodePeserta){
        pesertaTerdaftar[jumPeserta] = new PesertaTerdaftarEntity(peserta, index, kodePeserta);
        jumPeserta = jumPeserta+1;
    }
    
    /**
     * method view() berfungsi untuk menampilkan data Peserta sesuai dengan 
     * data yang telah tersimpan di dalam
     */

    @Override
    public void view() {
        if(jumPeserta == 0){
            System.err.println("Belum ada peserta terdaftar");
        }else{
            for(int i = 0; i < jumPeserta; i++){
                System.out.println("==================================");
                System.out.println("Kode Peserta : " + pesertaTerdaftar[i].getKodePeserta());
                System.out.println("==================================");
                System.out.println("Nama  : " + peserta[i].getNama()
                    + "\n Umur : " + peserta[i].getUmur()
                    + "\n Alamat : " + peserta[i].getAlamat()
                    + "\n No. Telp : " + peserta[i].getNoTelp()
                    + "\n Lomba : " + LombaEntity.lomba[pesertaTerdaftar[i].getIndexLomba()]);
                System.out.println("==================================");
            }
        }
    }
    /**
     * method update() berfungsi untuk memperbarui data Peserta sesuai dengan 
     * kode Peserta yang dimasukkan
     */
    
    public void update(){
        System.out.println("masukkan Kode peserta yang mau di EDIT : ");
        String search = input.next();
        int cari = 0;
        do{
         if(cari == jumPeserta){
             System.err.println("Tidak Ada data");
             break;
         }else if(pesertaTerdaftar[cari].getKodePeserta().equals(search)){
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
                    System.out.println("==================================");
                    System.out.println("Kode Pserta : " + pesertaTerdaftar[cari].getKodePeserta());
                    System.out.println("==================================");
                    System.out.println("Nama : " + peserta[cari].getNama()
                        + "\n Umur : " + peserta[cari].getUmur()
                        + "\n Alamat : " + peserta[cari].getAlamat()
                        + "\n No. Telp : " + peserta[cari].getNoTelp()
                        + "\n Lomba : " + LombaEntity.lomba[pesertaTerdaftar[cari].getIndexLomba()]);
                    System.out.println("==================================");
                 }else if(pilEdit == 2){
                        System.out.println(" Ubah Nama : ");
                        String editNama = input.nextLine();
                        peserta[cari].setNama(editNama);
                    }else if(pilEdit == 3){
                        System.out.println("Ubah Alamat :");
                        String editAlamat = input.nextLine();
                        peserta[cari].setAlamat(editAlamat);
                    }else if(pilEdit == 4){
                        System.out.println("Ubah No. Telp :");
                        String editNotelp = input.nextLine();
                        peserta[cari].setNoTelp(editNotelp);
                    }else if(pilEdit == 5){
                        System.out.println("Ubah Umur :");
                        String editUmur = input.nextLine();
                        peserta[cari].setUmur(editUmur);
                    }else if(pilEdit == 6){
                        System.out.println("Pilih Lomba : ");
                        for(int i=0; i < LombaEntity.lomba.length;i++){
                            System.out.println(i + ". " + LombaEntity.lomba[i]);
                        }
                        System.out.println("Pilih Lomba : ");
                        int editLomba = input.nextInt();
                        pesertaTerdaftar[cari].setIndexLomba(editLomba);
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
    
    public void delete(){
        System.out.println("masukkan Kode Peserta yang akan di HAPUS : ");
        String search = input.nextLine();
        input.nextLine();
        int cari = 0;
        do{
            if(cari == jumPeserta){
                System.err.println("Tidak Ada Data!");
                break;
            }else if(pesertaTerdaftar[cari].getKodePeserta().equals(search)){
                if(cari == jumPeserta - 1){
                    jumPeserta = jumPeserta = 1;
                }else{
                    for(int i=cari;i<jumPeserta;i++){
                        pesertaTerdaftar[i] = pesertaTerdaftar[i + 1];
                        peserta[i] = peserta[i + 1];
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
