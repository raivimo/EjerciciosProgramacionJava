/*
 * Proyecto PROGRAMACION - Archivo CasoPractico0.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:20:27
 */
public class CasoPractico0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int max = 100;
        int cuantos = 0;
        boolean salir = false;
        
        
        int[] notas = new int[max];
        String[] nombre = new String[max];
        int opcion;

        do {
            System.out.println("--MENU--");
            System.out.println("1.- VER NOTAS");
            System.out.println("2.- AÑADIR NOTA");
            System.out.println("3.- BORRAR NOTA");
            System.out.println("4.- ESTADÍSTICAS");
            System.out.println("5.- VER SUSPENDIDOS");
            System.out.println("6.- SALIR");
            opcion = in.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("LISTA DE ALUMNOS");
                    for (int i = 0; i < cuantos; i++) {
                        System.out.println("Nota " + i + ": " + nombre[i] + " " + notas[i]);
                        }
                    break;
            case 2:
                if(cuantos < max){
                    in.nextLine();
                    System.out.println("NOMBRE DEL ALUMNO");
                    nombre[cuantos] = in.nextLine();
                    
                    System.out.println("NOTA DEL ALUMNO");
                    notas[cuantos] = in.nextInt();
                    cuantos++;
                    }
                else
                    System.out.println("LISTA LLENA, BORRE UNO");
                break;
            case 3:
                System.out.println("¿QUE NOTA DESEAS BORRAR?");
                int borrar = in.nextInt();
                if (borrar > 0 && borrar < cuantos) {
                    for (int i = borrar + 1; i < cuantos; i++) {
                        nombre[i-1]=nombre[i];
                        notas[i-1]=notas[i];
                        }
                    cuantos--;
                    System.out.println("NOTA " + borrar + " BORRADA");
                    }
                else
                    System.out.println("NO EXISTE ESA NOTA");
                break;
            case 6:
                salir = true;
                break;
                
            }
        } while (!salir);
        
    }
}

