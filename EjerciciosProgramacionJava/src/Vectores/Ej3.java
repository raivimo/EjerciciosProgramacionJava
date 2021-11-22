
package Vectores;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:21:57
 */
public class Ej3 {
    public static void main(String[] args) {
        
        double[] numeros = new double[10];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
            
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame el valor " + i + ": ");
            numeros[i]=in.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            max= Math.max(numeros[i], max);
            min= Math.min(numeros[i], min);
            
             }    
        
        
        
        System.out.println("El máximo es " + max);
        System.out.println("El mínimo es " + min);
    }      
}


