/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 19:39:27
 */
public class Ej9 {
    
    public static double max(double a, double b){
        if(a >= b)
            return a;
        else
            return b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] valor = new int [3];
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("DIME UN VALOR " + i + ":");
            valor[i]=in.nextInt();
            maximo= Math.max(valor[i], maximo);
            minimo= Math.min(valor[i], minimo);
            }
        System.out.println("EL VALOR MAXIMO ES: " + max(maximo,minimo));
    }
}
    

