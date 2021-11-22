/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:40:35
 */
public class Ej2 {
    public static void main(String[] args) {
        int suma = 0;
        int pro = 1;
        for (int i=0; i<=10; i++) {
            System.out.println("La suma es" +(suma = suma+ i));
            System.out.println("El producto es "+(pro=pro*i+pro));
        }
    }
}
