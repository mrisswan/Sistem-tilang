/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilangan;
import java.util.Scanner;
public class Penilangan {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Denda Penilangan Satlantas");
        String[] pelanggaran = {"Tidak memakai masker","Tidak membawa SIM","Tidak membawa STNK"};
        int[] denda = {100000,200000,150000};
        
        for (int i = 0; i<pelanggaran.length; i++){
            System.out.println(i +"."+pelanggaran[i]+" denda = "+ denda[i]);
        }
        System.out.print("Masukan nomor pelanggaran = ");
        int p = Input.nextInt();
        
        switch(p){
            case 0:
                System.out.println("Anda "+ pelanggaran[0] + " dan didenda "+denda[0]);
                break;
            case 1:
                System.out.println("Anda "+ pelanggaran[1] + " dan didenda "+denda[1]);
                break;
            case 2:
                System.out.println("Anda "+ pelanggaran[2] + " dan didenda "+denda[2]);
                break;
            default:
                System.out.println("Selamat anda tidak ditilang, Tetap jaga ketertiban!");
        }
    }
    
}
