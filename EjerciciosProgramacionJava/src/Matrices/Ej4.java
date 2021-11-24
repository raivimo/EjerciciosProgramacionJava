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
        int[] asignaturas = new int [5];
        int suma = 0;
        double media;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
            
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTA ALUMNO " + (i+1) + ":");
            
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("ASIGNATURA " + (j+1) + " :");
                asignaturas[j]=in.nextInt();
                suma = (suma + asignaturas[j]);
                max= Math.max(asignaturas[j], max);
                min= Math.min(asignaturas[j], min);
                }
            media = (suma/5.0);

            System.out.println("LA NOTA MEDIA DEL ALUMNO: " + (i+1) + " ES DE " + media);
            System.out.println("LA NOTA MÁXIMA DEL ALUMNO: " + (i+1) + " ES DE " + max);
            System.out.println("LA NOTA MINIMA DEL ALUMNO: " + (i+1) + " ES DE " + min);
            }
        }
              
        
    }

