/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 nov. 2021 19:38:56
 */
public class Ej2 {
    
    public static boolean mayorEdad(int a){
        return a>=18;
        
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME EDAD");
        int x = in.nextInt();

        System.out.println(mayorEdad(x));

    }
}
