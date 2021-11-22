/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 4 nov. 2021 18:46:06
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        
           
        System.out.println("Dime una frase");
        s1 = in.nextLine();
        s2= s1.toLowerCase();
        
        int a=0, e=0, i=0, o=0, u=0;
        
        for (int j = 0; j < s2.length(); j++) {
            if (s1.charAt(j)=='a') 
                a++;
            else if (s1.charAt(j)=='e')
                e++;
            else if (s1.charAt(j)=='i')
                i++;
            else if (s1.charAt(j)=='o')
                o++;
            else if (s1.charAt(j)=='u')
                u++;
            }
        System.out.println(s2);
        System.out.println("Vocal A. Nº: "+a);
        System.out.println("Vocal E. Nº: "+e);
        System.out.println("Vocal I. Nº: "+i);
        System.out.println("Vocal O. Nº: "+o);
        System.out.println("Vocal U. Nº: "+u);

        }          
    }