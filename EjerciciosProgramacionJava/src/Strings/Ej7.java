/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:09:49
 */
public class Ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2, s3;
        
        System.out.println("Dime una frase");
        s1=in.nextLine();
        
        System.out.println("Dime una palabra P1");
        s2=in.nextLine();
        
        System.out.println("Dime una palabra P2");
        s3=in.nextLine();
        
        System.out.println(s1.replaceAll(s2, s3));
        
        
        
        
    }
}
