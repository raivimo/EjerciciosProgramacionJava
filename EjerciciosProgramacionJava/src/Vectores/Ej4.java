/*
 * Proyecto PROGRAMACION - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Vectores;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 19:48:52
 */
public class Ej4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[20];
        int positivos = 0;
        int negativos = 0;
        
                
        for (int i = 0; i < 20; i++) {
            System.out.println("Dame el valor  " + i + " :");
            numeros[i]=in.nextInt();
            }
        for (int i = 0; i < 20; i++) {
            if (numeros[i]>0){
                positivos +=i;
            }
            else
                negativos -=i;
         }
        System.out.println("Suma de valores positivos: " + positivos);
        System.out.println("Suma de valores negativos: " + negativos);
    }
}
