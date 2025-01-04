/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hp;

/**
 *
 * @author WINDOWS 11
 */
public class HandphoneRumahBeraksi {
    public static void main(String[] args) {
        HandphoneRumah hprumah = new HandphoneRumah();
        // Pemanggilan Method 
       hprumah.Hidupkan();
       System.out.println("================================");
       hprumah.Memanggil();
       System.out.println("================================");
       hprumah.SMS();
       System.out.println("================================");
       hprumah.Matikan();
    }
}
