/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu90476;

import Controller90476.SepatuController90476;
import Entity90476.SepatuEntity90476;
import java.util.Scanner;

/**
 *
 * @author GENESIS
 */
public class Menu90476 {
public static SepatuController90476 Sepatu = new SepatuController90476();
    
    public static void menuUtama90476(){
        System.out.println("\n========================");
        System.out.println("=====  M  E  N  U  =====");
        System.out.println("========================");
        System.out.println("1. Tambah Sepatu ");
        System.out.println("2. Ubah Sepatu");
        System.out.println("3. Hapus Sepatu");
        System.out.println("4. Lihat Sepatu");
        System.out.println("5. Keluar");
        System.out.println("========================");
        System.out.print("Masukkan pilihan : ");
    }
    
    
    public static void menuTambah90476(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n========================");
        System.out.println("Masukkan Merk : ");
        String Merk = scan.nextLine();
        System.out.println("Masukkan Ukuran : ");
        String Ukuran = scan.nextLine();
        System.out.println("Masukkan Stok : ");
        int Stok = scan.nextInt();
        System.out.println("========================");
        Sepatu.insertSepatu90476(0, Merk, Ukuran, Stok);
    }
    public static void menuUbah90476(){
         int pil;
        showData90476();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n========================");
        showData90476();
        System.out.print("Pilih ID yang ingin di UBAH : ");
        pil = scan.nextInt();
        System.out.print("\nMasukkan Merk : ");
        String Merk = scan.next();
        System.out.print("\nMasukkan Ukuran : ");
        String Ukuran = scan.next();
        System.out.print("\nMasukkan Stok : ");
        int Stok = scan.nextInt();
        System.out.println("========================");
        
        Sepatu.updateSepatu90476(pil, Merk, Ukuran, Stok);
    }
    
    
    public static void menuHapus90476(){
         int pil;
        showData90476();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n========================");
        showData90476();
        System.out.print("Pilih ID yang ingin di HAPUS : ");
        pil = scan.nextInt();
        System.out.println("========================");
        
        Sepatu.deleteSepatu90476(pil);
    }
    
    
    public static void showData90476(){
        for(SepatuEntity90476 sepatuEntity90476 : Sepatu.getDataSepatu90476()){
            System.out.println("id = " + sepatuEntity90476.getId90476());
            System.out.println("Merk = " + sepatuEntity90476.getMerk90476());
            System.out.println("Ukuran = " + sepatuEntity90476.getUkuran90476());
            System.out.println("Stok = " + sepatuEntity90476.getStok90476());
            System.out.println("========================");
        }
    }
}
