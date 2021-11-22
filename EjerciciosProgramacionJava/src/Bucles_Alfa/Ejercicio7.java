
package Bucles_Alfa;
import  java.util.Scanner;

    public class Ejercicio7 {
         public static void main(String[] args) {
             Scanner lector = new Scanner(System.in);
             int a;
             int b;
             int total=0;
             System.out.println("Dime a");
             a = lector.nextInt();
             System.out.println("Dime b");
             b = lector.nextInt();
             
            for (int i=a ; i <= b ; i+=1) {
                 total = total + i;
                 System.out.println(total);
                 
         }            
               
    }      
}
        