package Lebih_Besar;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int angka1, angka2;

        System.out.print("Masukkan angka 1 : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka 2 : ");
        angka2 = input.nextInt();

        if (angka1 > angka2) {
            System.out.println("Yang lebih besar: "+angka1);
        }
        else if (angka1 < angka2){
            System.out.println("Yang lebih besar: "+angka2);
        }else{
            System.out.println("YNTKTS");
        }
        
    }
}