/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelajaran;

/**
 *
 * @author WINDOWS 11
 */
public class MatemJeniusBeraksi {
    public static void main(String[] args){
    MatematikaJenius matem = new MatematikaJenius();
    
    // Pemanggilan Method 
        System.out.println("Pertambahan: 200 + 100 = " + matem.pertambahan(200, 100));
            System.out.println("------------------------------");
        System.out.println("Perkalian: 221 * 223 = " + matem.perkalian(221, 223));
            System.out.println("------------------------------");
        System.out.println("Modulus: 54 % 4 = " + matem.modulus(54, 4));
    }  
}