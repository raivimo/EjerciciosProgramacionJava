/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 14 feb. 2022 20:42:10
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b = 0;
        boolean salir = false;
        
        do {
            try{
                System.out.println("Introduce un valor A");
                a = in.nextInt();
                System.out.println("Introduce un valor B");
                b = in.nextInt();
                System.out.println("El resultado es : " + (a/b) );
                System.out.println("////////////");
                System.out.println("");
            } catch (InputMismatchException e){
                System.out.println("No has introducido un tipo de dato valido");
                System.out.println("///////////////////////");
                System.out.println("");
                salir = true;
            } catch (ArithmeticException f){
                System.out.println("No se puede divir por cero");    
                System.out.println("///////////////");
                System.out.println("");
                salir = true;
            }
            
        } while (salir == false);
        
    }
}
