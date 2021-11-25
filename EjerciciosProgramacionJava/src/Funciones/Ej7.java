/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 19:11:56
 */
public class Ej7 {
    
    public static double perimetroRectangulo(double ancho, double alto){
        return ancho+alto*2;
    }
    public static double areaRectangulo(double ancho, double alto){
        return ancho*alto;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME ANCHO DEL RECTANGULO");
        double ancho = in.nextDouble();
        System.out.println("DIME ALTO DEL RECTANGULO");
        double alto = in.nextDouble();
        System.out.println("EL PERIMETRO DE TU RECTANGULO ES DE: " + perimetroRectangulo(ancho, alto)+"m" + " Y EL AREA ES DE: " + areaRectangulo(ancho,alto)+"m2");
        
        
    }

}
