/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:34:45
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s1, s2, s3;
        
        System.out.println("Escribe un texto");
        s1 = in.nextLine();
        
        s2 = s1.toUpperCase();
        System.out.println(s2);
        
        s3= s1.toLowerCase();
        System.out.println(s3);
        
    }
}
