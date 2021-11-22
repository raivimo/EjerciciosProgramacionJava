/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package Bucles_Beta;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:41:34
 */
public class Ej5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a, b, par = 0, impar = 0;

        System.out.println("Dime a");
        a = lector.nextInt();
        System.out.println("Dime b");
        b = lector.nextInt();
        int num = b - a;
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                par++;
            } else if (i % 2 != 0) {
                impar++;
            }
        }
        System.out.println(par);
        System.out.println(impar);

    }
}
