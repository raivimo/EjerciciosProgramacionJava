/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej10.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package Bucles_Beta;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 16:49:02
 */
public class Ej10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        boolean esPrimo = true;

        System.out.println("Dime un numero para saber si es primo");
        a = in.nextInt();

        for (int i = 2; i <= a - 1; i++) {
            if ((a % i) == 0) {
                esPrimo = false;
            }
        }
        if (esPrimo) {
            System.out.println(a + " Es primo");
        } else {
            System.out.println(a + " No es primo");
        }

    }
}
