package Tugas1819;

import java.util.Scanner;



public class CM_Daspro_18_19 {
    static Scanner nalalsa = new Scanner(System.in);
    static String[][] menuKategori = new String[10][2];
    static int[] stok = new int[10];
    static {
        menuKategori[0] = new String[] {"kopi hitam" , "minuman"};
        menuKategori[1] = new String[] {"cappucino" , "minuman"};
        menuKategori[2] = new String[] {"teh tarik" , "minuman"};
        stok[0] = 10;
        stok[1] = 2;
        stok[2] = 8;
    }
    
    static String[] heading = {"No." , "Nama item" , "kategori" , "stok"};
    public static void main(String[] args) {
      menu();
    }
    
    public static void menu(){
      
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
            tambahStok();
          } else if (menu == 3){
            tambahItem();
          } else if (menu == 4) {
            System.out.println("keluar dari program, terimakasih :)");
            break;  
          }
      }
      
    }
    
    public static void tampilInventori(String[][] menuKategori, int[] stok) {
        System.out.println("======= DATA INVENTORI ======");
        for (int i = 0; i < heading.length; i ++) {
            System.out.printf("%-15s" , heading[i]);

        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        
        for (int i =0;i < menuKategori.length; i++ ) {
            if (menuKategori[i][0] == null) {
                continue;
            }
            
            for (int j = 0; j <= menuKategori[i].length; j++) {
                if (j == 0) {
                    System.out.printf("%-15d", (i+1));
                } else if ( j <= menuKategori[i].length) {
                    System.out.printf("%-15s", menuKategori[i][j-1]);
                }
            }
            System.out.printf("%-15d%n", stok[i]);
        }  
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
     
      while (true) {
        System.out.print("Masukkan jumlah stok yang ingin ditambahkan: ");
        int jumlah = nalalsa.nextInt();
        if (jumlah <= 0) {
            System.out.println("harus lebih dari 0");
            continue;
          } else {
            stok[nomor - 1] += jumlah;
            System.out.println("Stok " + menuKategori[nomor - 1][0] + " berhasil ditambah. Stok sekarang: " + stok[nomor - 1]);
            break;
          }
      }
    }
    

    public static void tambahItem () {
        nalalsa.nextLine();
        System.out.println("===== TAMBAH ITEM BARU =====");
        System.out.print("Masukkan nama item baru : ");
        String nama = nalalsa.nextLine();
        System.out.print("Masukkan kategori item baru : ");
        String kategori = nalalsa.nextLine();
        int jumlah = 0;
        while (true) {
            System.out.print("Masukkan Jumlah stok awal : ");
            jumlah = nalalsa.nextInt();
            nalalsa.nextLine();
            if (jumlah <= 0) {
                System.out.println("harus lebih dari 0");
                continue;
              } else {
                break;
              }
        }

        for ( int i = 0; i < menuKategori.length; i++) {
            if (menuKategori[i][0] == null) {
                menuKategori[i][0] = nama;
                menuKategori[i][1] = kategori;
                stok[i] += jumlah;
                System.out.println("item baru berhasil ditambahkan: "  + nama + " (" + kategori + ") - Stok: " + jumlah);
                return;
            }
        }
        System.out.println("penuh,tidak bisa menambahkan item lagi");

    }
    
    }