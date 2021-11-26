/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej11.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 20:17:23
 */
public class Ej11 {
    
    public static void tablaMultiplicar(int a){
        //CREAMOS LA MATRIZ
        int [] tabla = new int [10];
       
        //RELLENAMOS LA MATRIZ
        for (int i = 0; i < tabla.length; i++) {
            tabla[i]=a*(i+1); 
            }
        System.out.println("TABLA DEL " + a + " :");
        //MOSTRAMOS LA MATRIZ
        for (int i = 0; i < 10; i++) {
            System.out.println(a + " x " + (i+1) + " = " + tabla[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME UN NUMERO PARA SABER SU TABLA DE MULTIPLICAR");
        int a = in.nextInt();
        tablaMultiplicar(a);
        
        
        
    }
}
