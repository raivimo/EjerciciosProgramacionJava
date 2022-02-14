/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej11.java - Compañia DAW
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
 * @date 14 feb. 2022 21:02:03
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        int posicion = 0;
        
        int n = 0;
        n = (int) (1 + Math.random()*99);
        int enteros[] = new int [n];
        
        System.out.println("La longitud del vector es : " + n);
        do {
            try{
                for (int i = 0; i < enteros.length; i++) {
                    enteros[i] = (int) (1 * Math.random() + 9 );
                }
                if (posicion >= 0){
                    System.out.println("Dime la posición del vector que quieres que te muestre");
                    posicion = in.nextInt();
                    System.out.println("El numero correspondiente a esta posicion del vector es: " + enteros[posicion]);
                }
                else
                    salir = true;
            }catch(InputMismatchException e){
            System.out.println("Tipo de dato introducido incorrecto");
            }catch(ArrayIndexOutOfBoundsException f){
            System.out.println("Indice buscado fuera del tamaño del vector");
            }
        } while (salir == false);
        
    }
}
