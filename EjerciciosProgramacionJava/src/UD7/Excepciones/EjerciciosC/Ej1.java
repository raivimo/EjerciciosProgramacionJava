/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones.EjerciciosC;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 21 feb. 2022 19:42:25
 */
public class Ej1 {
    
    public static void imprimePositivo(int p) throws Exception {
        if (p >= 0)
            System.out.println("El valor del p es: " + p);
        else
            throws new Exception ("Error: numero negativo");
    }
    
    public static void imprimeNegativo(int p) throws Exception {
        if (p <0 )
            System.out.println("El valor del p es: " + p);
        else
            throws new Exception ("Error: numero positivo");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println("Introduce un entero positivo: ");
                num = in.nextInt();
                imprimePositivo(num);
                
                System.out.println("Introduce un entero negativo: ");
                num = in.nextInt();
                imprimeNegativo(num);
            } catch (InputMismatchException e) {
                System.out.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        
    }
}
