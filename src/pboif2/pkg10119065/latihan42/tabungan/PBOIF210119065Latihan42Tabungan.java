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
public class PBOIF210119065Latihan42Tabungan {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("======Program Penarikan Uang======");
       System.out.print("Masukkan Saldo Awal : ");
       Tabungan tabungan = new Tabungan(sc.nextInt());
       System.out.print("Jumlah uang yang diiambil : ");
       tabungan.ambilUang(sc.nextInt());
    }
    
}
