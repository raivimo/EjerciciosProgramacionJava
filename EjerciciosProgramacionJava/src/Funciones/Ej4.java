/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 18:54:16
 */
public class Ej4 {
    
    public static void dimeSigno(int a){
        if (a>0)
            System.out.println("1");
        else if (a<0)
            System.out.println("-1");
        else if (a == 0)
            System.out.println("0");
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME UN NUMERO");
        int a = in.nextInt();
        dimeSigno(a);
    }
}
