/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 18:45:51
 */
public class Ej3 {
    
    
    public static int minimo (int x, int y){
        if(x>y)
            return y;
        else
            return x;
        
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("DIME A");
        a = in.nextInt();
        System.out.println("DIME B");
        b = in.nextInt();
        System.out.println("EL VALOR MINIMO ES " + minimo(a, b));
        
    }

}
