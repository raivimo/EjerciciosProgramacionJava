/*
 * Proyecto PROGRAMACION - Archivo Ej9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Vectores;
import java.util.Scanner;
/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 15 nov. 2021 21:37:40
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int [100];
        int n;
        
        System.out.println("Dime un valor N");
        n = in.nextInt();
        
        for (int i = 0; i < 100; i++) {
            numeros[i]=(int)(1+Math.random()*10);
            System.out.println(numeros[i]);
        	}
        
       for (int i = 0; i < numeros.length; i++) {
    	   	if (n == numeros[i])
    	   		System.out.println("Ese valor está en la posicion " + i + " del Array");
       			}
    }   
}

    
    