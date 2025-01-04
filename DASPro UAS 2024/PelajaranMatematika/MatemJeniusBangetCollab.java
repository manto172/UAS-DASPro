/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PelajaranMatematika;

/**
 *
 * @author WINDOWS 11
 */
public class MatemJeniusBangetCollab {
    public static void main(String[] args) {
        MatematikaJenius matematika = new MatematikaJenius();

        // Menguji method pecahan dengan 3 parameter bertipe double
        System.out.println("Pecahan: 15.7 / (30.7 + 10.2) = " + matematika.pecahan(15.7, 30.7, 10.2));
          System.out.println("------------------------------");
        // Menguji konsep overloading pada pertambahan
        System.out.println("Pertambahan (double 3 angka): 12.5 + 28.7 + 14.2 = " + matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (int 3 angka): 200 + 300 + 100 = " + matematika.pertambahan(200, 300, 100));
        System.out.println("Pertambahan (double 2 angka): 21.5 + 39.5 = " + matematika.pertambahan(21.5, 39.5));
        System.out.println("Pertambahan (int 2 angka): 600 + 400 = " + matematika.pertambahan(600, 400));
          System.out.println("------------------------------");
        // Menguji konsep overloading pada pengurangan
        System.out.println("Pengurangan (double 3 angka): 70.5 - 20.2 - 30.1 = " + matematika.pengurangan(70.5, 20.2, 30.1));
        System.out.println("Pengurangan (int 2 angka): 300 - 50 = " + matematika.pengurangan(300, 50));
          System.out.println("------------------------------");
        // Menguji konsep overloading pada perkalian
        System.out.println("Perkalian (double 3 angka): 2.5 * 3.5 * 4.0 = " + matematika.perkalian(2.5, 3.5, 4.0));
        System.out.println("Perkalian (int 2 angka): 6 * 7 = " + matematika.perkalian(6, 7));
          System.out.println("------------------------------");
        // Menguji konsep overloading pada pembagian
        System.out.println("Pembagian (double 3 angka): 50.0 / 5.0 / 2.0 = " + matematika.pembagian(50.0, 5.0, 2.0));
        System.out.println("Pembagian (int 2 angka): 20 / 4 = " + matematika.pembagian(20, 4));
          System.out.println("------------------------------");
        // Menguji konsep overloading pada modulus
        System.out.println("Modulus (double 3 angka): 50.0 % 20.0 % 5.0 = " + matematika.modulus(50.0, 20.0, 5.0));
        System.out.println("Modulus (int 2 angka): 20 % 7 = " + matematika.modulus(20, 7));
    }
}
