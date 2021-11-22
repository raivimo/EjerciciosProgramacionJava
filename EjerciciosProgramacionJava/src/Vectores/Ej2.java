
package Vectores;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:21:57
 */
public class Ej2 {
    public static void main(String[] args) {
        
        double[] numeros = new double[10];
        double suma=0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame el valor " + i + ": ");
            numeros[i]=in.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
           suma = suma + numeros[i];       
             }    
        System.out.println("La suma total es " + suma);
    }      
}


