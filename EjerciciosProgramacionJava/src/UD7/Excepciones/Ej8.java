/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 14 feb. 2022 20:25:28
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean leido = false;
        int valor = 0;
        
        do {
            try {
                System.out.println("Introduce un numero entero");
                valor = in.nextInt();
                leido = true;
        } catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
            in.nextLine();
        }
        
        } while (leido);
        System.out.println("Hemos leido : " + valor);
    }
}
