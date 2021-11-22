/*
 * Proyecto PROGRAMACION - Archivo Ej8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Vectores;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 21:19:45
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numeros = new double [100];
        double r;
        int contador=0;
        
        System.out.println("Dime un valor R");
        r = in.nextDouble();
        
        for (int i = 0; i < 100; i++) {
            numeros[i]=Math.random();
            if (numeros[i]>=r)
                contador++;
        }
        System.out.println("Hay estos valores del array que son iguales o superiores a R " + contador); 
        
    }

}
