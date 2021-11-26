/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej13.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 26 nov. 2021 16:49:30
 */
public class Ej13 {
    
    public static double descuento(double a, double b){
        double res = (1-(a/b))*100;
        return res;
    }
    
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("CANTIDAD CON EL DESCUENTO APLICADO");
            double conDescuento=in.nextDouble();
            System.out.println("CANTIDAD SIN EL DESCUENTO APLICADO");
            double sinDescuento=in.nextDouble();
            
            System.out.println("EL DESCUENTO APLICADO ES DEL: " + descuento(conDescuento, sinDescuento) + " %");
            
    }
}
