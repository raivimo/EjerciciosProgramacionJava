/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:15:42
 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a, fact=1, total=1;
        System.out.println("Dime un Natural positivo");
        a = in.nextInt();
        
        for (int i = 1; i <= a ; i++) {
            fact = fact*i;
                                
        }
        System.out.println(fact);
    }
    
}
