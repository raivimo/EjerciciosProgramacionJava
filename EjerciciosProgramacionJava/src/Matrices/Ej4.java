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
public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] notas = new int [4];
        String[] asignaturas = new String[5];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTA ALUMNO " + i + ":");
            notas[i]=in.nextInt();
        }
              
        
    }
}
