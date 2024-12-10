package Tugas1819;

import java.util.Scanner;



public class CM_Daspro_18_19 {
    static Scanner nalalsa = new Scanner(System.in);
    public static String[][] menuKategori = new String[10][2];
    static int[] stok = new int[10];
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("===== MENU INVENTORI KAFE =====");
            System.out.println("1. Tampilkan Inventori. ");
            System.out.println("2. Tambah Stok untuk Item yang ada. ");
            System.out.println("3. Tambah Item Baru. ");
            System.out.println("4. keluar.  ");
            System.out.print("pilih menu : ");
            int menu = nalalsa.nextInt();
    
            if (menu == 1) {
             tampilInventori(menuKategori, stok);
            } else if (menu == 2) {
              tambahStok();;
            } else if (menu == 3){
              tambahItem();
            } else if (menu == 4) {
              break;  
            }
        }
    }
    
    public static void tampilInventori(String[][] menuKategori, int[] stok) {
     
    }
    
    public static void tambahStok() {
      System.out.println("===== TAMBAH STOK =====");
      System.out.print("Masukkan nomor item: ");
      int nomor = nalalsa.nextInt();
      nalalsa.nextLine();
      if (nomor < 1 || nomor > menuKategori.length || menuKategori[nomor - 1][0] == null) {
          System.out.println("Item tidak ditemukan.");
          return;
        }
      System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
      int jumlah = nalalsa.nextInt();
      if (jumlah > 0) {
        stok[nomor - 1] += jumlah;
        System.out.println("Stok " + menuKategori[nomor - 1][0] + " berhasil ditambah. Stok sekarang: " + stok[nomor - 1]);
      }
    }
    

    public static void tambahItem () {
    

    }
    
    }