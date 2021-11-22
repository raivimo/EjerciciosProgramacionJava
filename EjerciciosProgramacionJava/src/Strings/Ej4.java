/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:32:20
 */
public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2, s3, s4, s5, s6, s7, s8;
        
        System.out.println("Dime nombre");
        s1=in.nextLine();
        
        System.out.println("Primer apellido");
        s2=in.nextLine();
        
        System.out.println("Segundo apellido");
        s3=in.nextLine();
        
        s4=s1.substring(0,3);
        s5=s2.substring(0,3);
        s6=s3.substring(0,3);
        s7=s4.concat(s5);
        s8=s7.concat(s6);
        
        System.out.println(s8.toUpperCase());
        
        
        
    }
}
