/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 19:05:51
 */
public class Ej6 {
    public static double precioConIVA(double precio){
        double res = precio*1.21;
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("DIME PRECIO ARTICULO " + (i+1) + ":");
            double precio = in.nextDouble();
            System.out.println("EL PRECIO CON EL IVA DE TU ARTICULO ES: " + precioConIVA(precio));
        }
    }
}
