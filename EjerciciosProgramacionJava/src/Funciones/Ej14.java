/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej14.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 26 nov. 2021 17:40:48
 */
public class Ej14 {
    
    public static void triangulo(char a, int b){
        for (int i = 0; i < b; i++) {
            int contador=1;
            System.out.println(a*(i+1));
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME LETRA");
        char a = in.nextLine().charAt(0);
        System.out.println("DIME Nº DE LINEAS PARA FORMAR EL TRIANGULO");
        int b = in.nextInt();
        
        triangulo(a, b);
        
    }

}
