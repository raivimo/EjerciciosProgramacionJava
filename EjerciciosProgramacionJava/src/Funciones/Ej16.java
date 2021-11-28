/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;
import java.util.Scanner;

/**
 *
 * @author raimo
 */
public class Ej16 {
    
    public static void aleatorio (int[]numeros){
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=(int)(1 + Math.random()*50);
            }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME TAMAÑO DEL ARRAY");
        int n = in.nextInt();
        int[] numeros = new int [n];
        
        aleatorio(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            System.out.print("  ");
        }
        
    }
}
