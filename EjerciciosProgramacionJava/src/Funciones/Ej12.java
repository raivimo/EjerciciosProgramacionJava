/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej12.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 26 nov. 2021 16:40:29
 */
public class Ej12 {
    public static void pasarMillas() {
    Scanner in = new Scanner(System.in);
        System.out.println("DIME UN VALOR EN KM PARA SABER SU CONVERSION A MILLAS");
        double a = in.nextDouble();
        double res = (a/1.60934);
        System.out.println("EQUIVALE A: " + res + " MILLAS");
        
}
    public static void main(String[] args) {
        pasarMillas();
    }
}
