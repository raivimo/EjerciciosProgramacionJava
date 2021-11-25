/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej10.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 20:00:53
 */
public class Ej10 {
    
    public static boolean fechaCorrecta(int a, int b, int c){
        return a>0 && a<=30 && b>0 && b<=12 && c<=2021;
       }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("DIME EL DIA");
        a = in.nextInt();
        System.out.println("DIME EL MES");
        b = in.nextInt();
        System.out.println("DIME EL AÑO");
        c = in.nextInt();
        
        System.out.println("SU FECHA ES: " + fechaCorrecta(a,b,c));
    }
}
