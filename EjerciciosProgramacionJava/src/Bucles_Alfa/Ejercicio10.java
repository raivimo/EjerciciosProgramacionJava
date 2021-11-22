
package Bucles_Alfa;
import  java.util.Scanner;

    public class Ejercicio10 {
         public static void main(String[] args) {
             Scanner lector = new Scanner(System.in);
             int precio;
             int total=0;
             
                for (int i=1 ; i <= 5 ; i+=1) {
                    
                System.out.println("Dime un precio");
                precio = lector.nextInt();
                
                total = total + precio;
                System.out.println(total);
                }            
    }      
}
        