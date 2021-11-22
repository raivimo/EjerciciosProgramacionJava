/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 20:16:03
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        int cont=0, x;
        
        System.out.println("Dime una frase");
        s1=in.nextLine();
        
        System.out.println("Dime una palabra");
        s2=in.nextLine();
        
        
        while (s1.indexOf(s2) > -1 ) {
            cont++;
                    }
        System.out.println(cont);
    }
}
