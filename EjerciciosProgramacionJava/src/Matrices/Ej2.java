/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author raimo
 */
public class Ej2 {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=(i+1)*(j+1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("TABLA DEL " + (i+1) + ": ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
      
    }
}
