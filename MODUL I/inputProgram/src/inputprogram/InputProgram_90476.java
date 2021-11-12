/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputprogram;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class InputProgram_90476 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT");
        System.out.print("Masukkan Nama : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan Umur : ");
            int umur = scan.nextInt();
            
            System.out.println("\nOUTPUT");
            System.out.println("Nama : " +nama);
            System.out.print("Umur : ");
            System.out.println(umur);
    }
}
