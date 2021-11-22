package Bucles_Alfa;
import java.util.Scanner;

    public class Ejercicio3 {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            int a;
            int b;
            
            System.out.println("Dime a");
            a = lector.nextInt();
            System.out.println("Dime b");
            b = lector.nextInt();
            
            for (int i= a ; i <=b ; i +=2){
                    System.out.println(i);
            }
            
                   
        }
    
}
