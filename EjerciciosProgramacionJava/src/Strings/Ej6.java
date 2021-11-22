/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 19:42:24
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s1,s2, s3;
        
        System.out.println("Dime una frase");
        s1=in.nextLine();
        System.out.println("Dime una palabra que esté contenida en la frase");
        s2=in.nextLine();
            
        s3=(s2.substring(0, s2.length()));
        
        if (s1.indexOf(s2) < s1.length()) {
            System.out.println("Esta palabra está contenida en esta frase");
        }
        
        System.out.println("Ademas, empieza la frase con esa palabra? "+ s1.startsWith(s2));
        System.out.println("Ademas, termina la frase con esa palabra? " + s1.endsWith(s2));
                
        /*System.out.println(s1.indexOf(s2));
        */
        
        
        
        
        
        
        
        
    }

}
