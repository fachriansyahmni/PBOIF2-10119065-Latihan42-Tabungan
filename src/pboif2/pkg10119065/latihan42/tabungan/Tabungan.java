package pboif2.pkg10119065.latihan42.tabungan;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Tabungan 
 *                         dengan objek
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo)
    {
         this.saldo = saldo;
    }
    public void ambilUang(int jumlah)
    {
        saldo -= jumlah;
        System.out.println("saldo anda sekarang : "+saldo);
    }
}
