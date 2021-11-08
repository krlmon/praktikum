/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Entity.PanitiaEntity;
/**
 *
 * @author Administrator
 */
public class PanitiaProcess implements Interface{
    private static PanitiaEntity[] panitia = new PanitiaEntity[100];
    private static int jumPanitia = 0;
    
    /**
     * methiod getPanitia() fungsinya hampir sama seperti method Accessor
     * pada umumnya. yang digunakan untuk mengakses variabel yang tidak dapat
     * diakses dari luar kelas
     * @return panitia yang berbentuk Array.
     */
    
    public PanitiaEntity[] getPanitia(){
        return panitia;
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
    
    public void insert(String[] passPanitia, String[] namaPanitia,
        String[] noTelpPanitia, String[] alamatPanitia){
        for(int i=0; i < namaPanitia.length; i++){
            panitia[i] = new PanitiaEntity(passPanitia[i], namaPanitia[i], 
                noTelpPanitia[i], alamatPanitia[i]);
            jumPanitia++;
        }
    }
    
    /**
     * methid view() berfungsi untuk menampilkan data Peserta Sesuai dengan 
     * data yang telah tersimpan dalam PanitiaEntity
     */
    
    @Override
    public void view() {
        for(int i = 0; i <jumPanitia;i++){
            System.out.println("===================================");
            System.out.println("Nama : "+ panitia[i].getNama()
            + "\n No. Telp : "+ panitia[i].getNoTelp()
            + "\n Alamat : "+ panitia[i].getAlamat());
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
    
    public int cekData(String user, String password){
        int loop = 0;
        for(PanitiaEntity prosesPanitia : panitia){
            if(prosesPanitia.getNama().equals(user) && 
             prosesPanitia.getPassword().equals(password)){
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
    
}
