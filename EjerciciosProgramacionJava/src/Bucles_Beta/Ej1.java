/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:26:31
 */
    public class Ej1 {
        public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int a;
        System.out.println("Dime un numero");
        a = lector.nextInt();
        while(a>0) {
                System.out.println("La tabla de multiplicar de tu numero es" + a*1);
                System.out.println("La tabla de multiplicar de tu numero es" + a*2);
                System.out.println("La tabla de multiplicar de tu numero es" + a*3);
                System.out.println("La tabla de multiplicar de tu numero es" + a*4);
                System.out.println("La tabla de multiplicar de tu numero es" + a*5);
        }

    }
    }
