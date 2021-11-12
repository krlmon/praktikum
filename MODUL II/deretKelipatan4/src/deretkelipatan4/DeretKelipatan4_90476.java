/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretkelipatan4;
import java.util.Scanner;
public class DeretKelipatan4_90476 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Banyak;
        System.out.print("Banyak Deret : ");
        Banyak = scan.nextInt();
        int[] deret = new int[Banyak];
        for(int i=0;i < Banyak; i++){
            deret[i] = i*4+2;
        }
        for(int i : deret){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
}
