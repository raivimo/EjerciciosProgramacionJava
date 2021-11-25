/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 19:00:03
 */
public class Ej5 {
    public static double millas_a_kilometros(int millas){
        double res = millas * 1.60934;
        return res;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME CANTIDAD DE MILLAS");
        int millas = in.nextInt();
        System.out.println("LA DISTANIA EQUIVALENTE EN KM ES DE: " + millas_a_kilometros(millas));
    }
}
