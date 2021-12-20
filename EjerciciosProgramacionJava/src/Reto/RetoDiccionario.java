/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto;

import java.util.Scanner;

/**
 *
 * @author raimo
 */
public class RetoDiccionario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int datosIntroducidos=0;
        int[] y = new int [100];
        int i =0;
        do {
            datosIntroducidos = in.nextInt();
            if(datosIntroducidos !=0){
                y[i]=datosIntroducidos;
                i++;
            }
        } while (datosIntroducidos != 0);
        int suma =0;
        for (int j = 0; j < y.length ; j++) {
            suma += y[j];
        }
        int seg = suma *x;
        
        int minI = 00, segI = 00, min=00, horas=00;
        if (seg > 60 ) {
            min = seg/60;
            segI= seg%60;
            if (min > 60){
                horas = min/60;
                minI=seg%60;
            }
        }
        if (seg < 60 ||  min > 60)
            System.out.println(horas + ":" + minI + ":" + seg);
        else
            System.out.println(horas + ":" + min + ":" + segI);
    }
}

