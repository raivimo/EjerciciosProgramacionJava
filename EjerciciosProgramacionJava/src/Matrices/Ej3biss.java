/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;
import java.util.Scanner;
/**
 *
 * @author raimo
 */
public class Ej3biss {
    public static void main(String[] args) {
        int[][] numeros;
        Scanner in = new Scanner(System.in);
        System.out.println("DIME VALOR N");
        int n = in.nextInt();
        System.out.println("DIME VALOR M");
        int m= in.nextInt();
        numeros = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("DIME VALOR [" + i + "][" + j + "]:");
                numeros[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(numeros[i][j] + "");
            }
            System.out.println("");
        }
        
        
        
        
    }
}
