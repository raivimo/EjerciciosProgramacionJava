/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:24:59
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, total = 1;
        System.out.println("Dime un numero");
        a = in.nextInt();
        
        for (int i = 1; i <= a ; i++) {
            total = total + i;
            System.out.println(total);
        }
    }
}
