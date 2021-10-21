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
public class CekPlatnomor90476 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char plat;
        System.out.println("Masukkan kode Plat : ");
        plat = scan.next().charAt(0);
        switch(plat){
            case 'L':
                System.out.println("Plat Surabaya");
                break;
            case 'B':
                System.out.println("Plat Jakarta");
                break;
            case 'N':
                System.out.println("Plat Malang");
                break;
            case 'D':
                System.out.println("Plat Bandung");
                break;
            default:
                System.out.println("Plat tidak dikenal oleh sistem");
        }
    }
}
