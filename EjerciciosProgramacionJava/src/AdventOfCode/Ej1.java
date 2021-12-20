/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdventOfCode;

import java.util.Scanner;

/**
 *
 * @author raimo
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []numeros = new int [2000];
        int []suma = new int [1998];
        int contador =0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=in.nextInt();
        }
        for (int i = 0; i < suma.length; i++) {
            suma[i] = numeros[i] + numeros[i+1] + numeros[i+2];
        }
        for (int i = 0; i < suma.length - 1 ; i++) {
            if(suma[i+1]>suma[i])
                contador++;
        }
        System.out.println(contador);
    }
}
