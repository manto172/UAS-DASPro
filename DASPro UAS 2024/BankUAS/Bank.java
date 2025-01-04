/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankUAS;

/**
 *
 * @author WINDOWS 11
 */
public class Bank {
    private int saldo;  
    
    public Bank(int saldoAwal) {
        saldo = saldoAwal;
    }

    // Menyimpan Uang 
    public void simpanUang(int jumlah) {
        saldo += jumlah;  
        System.out.println("Uang Yang di simpan: Rp. " + jumlah);
    }

    // Mengambil Uang
    public void ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;  
            System.out.println("Uang Yang diambil: Rp. " + jumlah);
        } else {
            System.out.println("Maaf!! Saldo Anda  Tidak Cukup untuk mengambil saldo sebesar Rp. " + jumlah);
        }
    }

    // Mendapatkan Saldo 
    public int getSaldo() {
        return saldo;
    }
}

