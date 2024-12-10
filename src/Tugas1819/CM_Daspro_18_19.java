package Tugas1819;

import java.util.Scanner;



public class CM_Daspro_18_19 {
    
    static Scanner nalalsa = new Scanner(System.in);
    public static String[][] menuKategori = new String[10][2];
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
            //    tampilInventori();
            } else if (menu == 2) {
        
            } else if (menu == 3){
                tambahItem();
            } else if (menu == 4) {
              break;  
            }
        }
    }

    public static void tambahItem () {
        

    }

    
    }