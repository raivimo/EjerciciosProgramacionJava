package Bucles_Alfa;

import java.util.Scanner;
    public class Ejercicio2 {
        public static void main(String[] args) {
            int a;
            int b;
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Dime a");
            a = lector.nextInt();
            System.out.println("Dime b");
            b = lector.nextInt();
            
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
            
            while (a <= b) {
                System.out.println(a);
                a++;
            }
            
            
        }
    }
