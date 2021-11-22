/*
 * Proyecto PROGRAMACION - Archivo Ej5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Vectores;
import  java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 20:51:51
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] numeros = new double[20];
        double suma = 0, media = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Dime el valor " + i +" :");
            numeros[i]=in.nextDouble();
            }
        for (int i = 0; i < 20; i++) {
            suma = suma + numeros[i];
            media = (suma/20);       
        }
        System.out.println("La suma de los valores es " + suma);
        System.out.println("La media de los valores es " + media);
    }

}
