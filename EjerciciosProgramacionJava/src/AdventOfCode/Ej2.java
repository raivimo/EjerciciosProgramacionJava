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
public class Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int forward = 0, sumaf=0, down=0, sumad=0, up = 0, sumau=0;
        int contador = 0;
        int a=0;
        String [] instrucciones = new String [2];
        for (int i = 0; i < instrucciones.length ; i++) {
            instrucciones[i]=in.nextLine();
        }
        for (int i = 0; i < instrucciones.length; i++) {
            if(instrucciones[i].startsWith("forward")){
                forward = Integer.parseInt(instrucciones[i].substring(8)); 
                sumaf = sumaf + forward;
            }
        }
        for (int i = 0; i < instrucciones.length; i++) {
            if(instrucciones[i].startsWith("down")){
                down = Integer.parseInt(instrucciones[i].substring(5));
                sumad= sumad + down;
            }
        }
        for (int i = 0; i < instrucciones.length; i++) {
            if(instrucciones[i].startsWith("up")){
                up = Integer.parseInt(instrucciones[i].substring(3));
                sumau = sumau + up;
            }
        }
        int res = sumad-sumau;
        int res2 = res*sumaf;
        System.out.println(sumaf);
        System.out.println(sumad);
        System.out.println(sumau);
    }
    
}
