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
public class Ej15 {
    
    public static int suma(int[] numeros){
        int suma=0;
        for (int i = 0; i < 100; i++) {
            suma += numeros[i];
            }
        return suma;
        }
    
    public static double media(int suma, int total){
        double media = suma/total;
        return media;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numeros = new int [100];
        for (int i = 0; i < 100; i++) {
            numeros[i]=(i+1);
            }
        
        
        System.out.println(suma(numeros));
        System.out.println(media(suma(numeros),100));
    }
}
