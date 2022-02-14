/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej10.java - Compañia DAW
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
 * @date 14 feb. 2022 20:52:16
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vector [] = new double[5];
        boolean leido = false;
      
        
        do {
            try{
                
                for (int i = 0; i < vector.length; i++) {
                    System.out.println("Dime un valor");
                    vector[i]=in.nextDouble();
                    leido = true;
                }
            }catch(InputMismatchException e){
                in.nextLine();
                System.out.println("No has introducido un double");
            }
            
        } while (!leido);
        
        
    }
}
