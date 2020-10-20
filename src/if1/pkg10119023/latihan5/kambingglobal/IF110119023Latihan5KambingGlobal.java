/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan5.kambingglobal;

/**
 *
 * @author  
 * NAMA     : Muhammad Farhan R
 * KELAS    : IF1
 * NIM      : 10119023
 * Deskripsi Program : latihan membuat variabel global
 */
public class IF110119023Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    //Variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 80;
    
    // Method utk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : "+jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : "+jumlahKambing);
    }
    
    public static void main(String[] args) {
        IF110119023Latihan5KambingGlobal kambingSusu = new 
        IF110119023Latihan5KambingGlobal();
        
        //menampilkan kambing saat program pertama berjalan(getJumlahKambing)
        kambingSusu.getJumlahKambing();
        
        //tambah kambing
        kambingSusu.tambahKambing();
        
        //total berubah
        kambingSusu.getJumlahKambing();
    }
    
}
