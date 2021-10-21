/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class PengujianSegitiga90476 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan ketiga panjang sisi segitiga : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        if(Math.pow(c, 2) < Math.pow(a,2) + Math.pow(b, 2))
        {
            System.out.println("SEGITIGA LANCIP");
        }else if(Math.pow(c, 2) > Math.pow(a,2) + Math.pow(b, 2))
        {
            System.out.println("SEGITIGA TUMPUL");
        }else{
            System.out.println("SEGITIGA SIKU SIKU");
        }
    }
}
