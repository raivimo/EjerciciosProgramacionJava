/*
 * Proyecto PROGRAMACION - Archivo Ej1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Matrices;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:38:39
 */
public class Ej1 {
    public static void main(String[] args) {
        int[][] matriz = new int [5][5];
        
        int cont = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = cont;
                cont++;
    //            MATRIZ[I][J] = 5*I + (J+1);
                System.out.print(matriz[i][j]+ "\t" );
            }
            System.out.println("");
            }
        }  
                
    }