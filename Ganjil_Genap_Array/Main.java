package Ganjil_Genap_Array;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int array [] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("DATA ARRAY: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");

        System.out.println("ARRAY GENAP: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]+ ",");
            }
        }
        System.out.println("\n");


        System.out.println("ARRAY GENAP");
        for (int j = 0; j < 10; j++) {
            if ((array[j] % 2 != 0)) {
                System.out.print(array[j]+ ",");
            }
                
            }
        }
    }

