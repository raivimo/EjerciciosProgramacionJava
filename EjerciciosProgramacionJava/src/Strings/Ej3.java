/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Strings;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 3 nov. 2021 21:44:28
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        
        
        
        System.out.println("Dame un texto");
        s1=in.nextLine();
        
        System.out.println("Dame otro texto");
        s2=in.nextLine();
        
        System.out.println(s1.compareToIgnoreCase(s2));
            

        
    }
    
    
    
}
