/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:19:48
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num, s=0, diez=0, i=0;
        double m=0;
        do {
            System.out.println("Dime un numero");
            num= lector.nextInt();
            i++;
            if (num>0){
                s = s + num;
                m = (s/i);
                
            }
            else if (num == 10)
                    diez++;
                    
        } while (num != -1);
            System.out.println("La suma es " +s);
            System.out.println("La media es "+m);
            System.out.println("Hay estos dieces "+diez);
    }
}
