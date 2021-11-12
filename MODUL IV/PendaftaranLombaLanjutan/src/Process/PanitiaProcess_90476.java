/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Entity.PanitiaEntity_90476;
/**
 *
 * @author Administrator
 */
public class PanitiaProcess_90476 implements Interface_90476{
    private static PanitiaEntity_90476[] Panitia = new PanitiaEntity_90476[100];
    private static int JumPanitia = 0;
    
    /**
     * methiod getPanitia() fungsinya hampir sama seperti method Accessor
     * pada umumnya. yang digunakan untuk mengakses variabel yang tidak dapat
     * diakses dari luar kelas
     * @return panitia yang berbentuk Array.
     */
    
    public PanitiaEntity_90476[] getPanitia_90476(){
        return Panitia;
    }
    
    /**
     * method insert() berfungsi untuk memasukkan data kedalam class Entity
     * sesaui dengan parameter yang telah ditentukan
     * @param passPanitia menampung data Password panitia
     * @param namaPanitia menampung data Nama panitia
     * @param noTelpPanitia menampung data No Telp Panitia
     * @param alamatpanitia menampung data Alamat Panitia
     * keempat parameter tersebut nantinya akan dimasukkan kedalam PanitiaEntity
     */
    
    public void insert_90476(String[] passPanitia, String[] namaPanitia,
        String[] noTelpPanitia, String[] alamatPanitia){
        for(int i=0; i < namaPanitia.length; i++){
            Panitia[i] = new PanitiaEntity_90476(passPanitia[i], namaPanitia[i], 
                noTelpPanitia[i], alamatPanitia[i]);
            JumPanitia++;
        }
    }
    
    /**
     * methid view() berfungsi untuk menampilkan data Peserta Sesuai dengan 
     * data yang telah tersimpan dalam PanitiaEntity
     */
    
    @Override
    public void view() {
        for(int i = 0; i <JumPanitia;i++){
            System.out.println("===================================");
            System.out.println("Nama : "+ Panitia[i].getNama_90476()
            + "\n No. Telp : "+ Panitia[i].getNoTelp_90476()
            + "\n Alamat : "+ Panitia[i].getAlamat_90476());
            System.out.println("===================================");
        }
    }
    
    /**
     * method cekData() berfungsi untuk melakukan pencocokan data dari inputan
     * dan dari yang sudah tersimpan dalam sistem.
     * @param user menampung data nama user / username
     * @param password menampung data password user
     * @return loop yang bernilai INT yang nantinya digunakan untuk menentukan 
     * kondisi
     */
    
    public int cekData_90476(String user, String password){
        int loop = 0;
        for(PanitiaEntity_90476 prosesPanitia : Panitia){
            if(prosesPanitia.getNama_90476().equals(user) && 
             prosesPanitia.getPassword_90476().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
    
}
