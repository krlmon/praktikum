/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator90476;

/**
 *
 * @author GENESIS
 */
import java.util.Scanner;
public class kalkulator90476 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil90476, angka1_90476, angka2_90476, hasil90476;
        Scanner scan90476 = new Scanner(System.in);
       do{

            System.out.println("\n=============================");
            System.out.println("1. Penambahan (+) ");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("=============================");
                 System.out.print("Masukkan pilihan: ");
                 pil90476=scan90476.nextInt();
                 System.out.println("=============================");
                    switch(pil90476){
                    case 1:
                            System.out.print("\n\n INPUT ANGKA PERTAMA : \n");
                            angka1_90476 = scan90476.nextInt();

                            System.out.print("\n\n INPUT ANGKA KEDUA : \n");
                            angka2_90476 = scan90476.nextInt();
                            hasil90476 = angka1_90476 + angka2_90476;
                            System.out.println("HASIL PENJUMLAHAN = "+hasil90476);
                            break;
                    case 2:
                            System.out.print("\n\n INPUT ANGKA PERTAMA : \n");
                            angka1_90476 = scan90476.nextInt();

                            System.out.print("\n\n INPUT ANGKA KEDUA : \n");
                            angka2_90476 = scan90476.nextInt();
                            hasil90476 = angka1_90476 - angka2_90476;
                            System.out.println("HASIL PENGURANGAN1 = "+hasil90476);
                            break;
                    case 3:
                            System.out.print("\n\n INPUT ANGKA PERTAMA : \n");
                            angka1_90476 = scan90476.nextInt();

                            System.out.print("\n\n INPUT ANGKA KEDUA : \n");
                            angka2_90476 = scan90476.nextInt();
                            hasil90476 = angka2_90476*angka1_90476;
                            System.out.println("HASIL PERKALIAN = "+hasil90476);
                            break;
                    case 4:
                            System.out.print("\n\n INPUT ANGKA PERTAMA : \n");
                            angka1_90476 = scan90476.nextInt();

                            System.out.print("\n\n INPUT ANGKA KEDUA : \n");
                            angka2_90476 = scan90476.nextInt();
                            hasil90476 = angka1_90476/angka2_90476;
                            System.out.println("HASIL PEMBAGIAN = "+hasil90476);
                            break;
                 }
         }while(pil90476!=4&&pil90476<4);
    }
}
