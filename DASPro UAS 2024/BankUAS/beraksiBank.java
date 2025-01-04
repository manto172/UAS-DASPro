/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankUAS;

/**
 *
 * @author WINDOWS 11
 */
public class beraksiBank {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal Rp. 100000
        Bank bank = new Bank(100000);

        // Menampilkan informasi awal
        System.out.println("Selamat Datang di BANK UAS");
        System.out.println("Saldo Anda saat ini Sebesar: Rp. " + bank.getSaldo());
        System.out.println("================================");
        // Menyimpan uang Rp. 500000
        bank.simpanUang(500000);
        System.out.println("Terimakasih Sudah Mempercai Uang Anda Kepada Kami");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        System.out.println("================================");
        // Mengambil uang Rp. 150000
        bank.ambilUang(150000);
        System.out.println("Wah!! Anda Lagi Butuh Uang yaaa?");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        System.out.println("================================");
    }
}
