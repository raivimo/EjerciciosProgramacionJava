/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:03:03
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double a, b, mult=1;
        System.out.println("Dime A");
        a = lector.nextDouble();
        System.out.println("Dime B");
        b = lector.nextDouble();
        
       for (int i = 1; i <= b; i++) {
            mult*=a;
            
            
        }
        System.out.println(mult);
        
    }
}
