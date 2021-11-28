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
public class Ej17 {
    
    public static boolean esPrimo(int a){
        boolean esPrimo=true;
        for (int i = 2; i < a-1; i++) {
            if ((a % i) == 0)
                esPrimo=false;
            }
        return esPrimo;
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("DIME UN NUMERO ENTERO");
        int a = in.nextInt();
        
        if (a == 0)
           System.out.println("INTRODUCE UN VALOR DISTINTO DE 0");
        else
            System.out.println(esPrimo(a));
     
        
    }
}
