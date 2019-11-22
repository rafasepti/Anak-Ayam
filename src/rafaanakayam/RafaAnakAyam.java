/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaanakayam;

import java.util.Scanner;

/**
 *
 * @author LABKOM1-RPL23
 */
public class RafaAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rafaScanner = new Scanner(System.in);
        
        int rafa1, rafa2, rafa3;
        
        System.out.println("Masukan Anak Ayam");
        rafa1 = rafaScanner.nextInt();
        
        for(rafa3=2;rafa3<=rafa1;){
            System.out.println("Anak Ayam Mati "+rafa1);
            System.out.println(" Mati "+1);
            rafa1=rafa1-1;
            System.out.println(" Tinggal "+rafa1);
            
            if (rafa1==1) {
                System.out.println("Anak Ayam Mati "+rafa1);
                System.out.println(" Mati "+1);
                System.out.println(", Tinggal Induknya");
            }
        }
    }
    
}
