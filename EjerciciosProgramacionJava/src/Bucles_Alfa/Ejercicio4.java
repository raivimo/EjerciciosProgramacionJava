
package Bucles_Alfa;
import  java.util.Scanner;

    public class Ejercicio4 {
         public static void main(String[] args) {
             Scanner lector = new Scanner(System.in);
             int a;
             int b;
             System.out.println("Dime a");
             a = lector.nextInt();
             System.out.println("Dime b");
             b = lector.nextInt();
             
             for (int i=b; i >= a ; i-=1){
                 System.out.println(i);
               
             }
     }      
}
        
