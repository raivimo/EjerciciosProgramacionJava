/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Gamma;
import  java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 27 oct. 2021 20:47:29
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Dame un X");
        x = in.nextInt();
        
        for (int i = 1; i <= x; i++) {
            System.out.println("TABLA DE MULTIPLICAR DEL "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j +"=" + (i*j) );
                
            }
        }
        
               
    }
}
