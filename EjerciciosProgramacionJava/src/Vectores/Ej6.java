/*
 * Proyecto PROGRAMACION - Archivo Ej6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Vectores;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 21:02:20
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros;
        int m=0;
        
        
        System.out.println("Dime el Valor N");
        numeros = new int [in.nextInt()];
        
        System.out.println("Dime el Valor M");
        m = in.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=m;
            System.out.println(numeros[i]);
        }

    }
}
