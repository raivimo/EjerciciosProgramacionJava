/*
 * Proyecto PROGRAMACION - Archivo Ej1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Vectores;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:21:57
 */
public class Ej1 {
    public static void main(String[] args) {
        
        double[] numeros = new double[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame el valor " + i + ": ");
            numeros[i]=in.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de la posicion " + i + " es :" + numeros[i]);
        }                  
    }      
}


