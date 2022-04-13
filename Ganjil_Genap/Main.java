package Ganjil_Genap;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int angka1;    
        System.out.println("Masukkan angka  : ");
        angka1 = input.nextInt();

        if(angka1%2==0){
            System.out.println("Angka Genap");
        }else{
            System.out.println("Angka Ganjil");
        }
    }
}
