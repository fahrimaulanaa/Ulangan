package Tambah_Tambahan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.println("Faktor penjumlahan: ");
        
        for (int i = 1; i <= angka; i++) {
            System.out.print(i += 1 );
        }
    }
}