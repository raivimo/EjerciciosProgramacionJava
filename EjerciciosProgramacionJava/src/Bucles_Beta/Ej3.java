/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:51:45
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n, pos=0, neg=0;
        do {
            System.out.println("Dime un numero");
            n = lector.nextInt();
            if(n>0)
                pos++;
            else if(n<0)
                neg++;
            
        } while (n !=0);
        
        System.out.println("Numero de positivos "+pos);
        System.out.println("Numero de negativos "+neg);
   
            
    }
}
