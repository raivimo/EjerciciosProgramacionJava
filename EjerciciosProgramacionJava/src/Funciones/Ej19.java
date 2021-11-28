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
public class Ej19 {
    
    public static void pitagoras(double a, double b, double c){
        boolean verdad = false;
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            verdad = true;
        System.out.println(verdad);
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DAME UN VALOR X");
        int x = in.nextInt();
        System.out.println("DAME UN VALOR Y");
        int y = in.nextInt();
        System.out.println("DAME UN VALOR Z");
        int z = in.nextInt();
        
        pitagoras(x,y,z);
        
        
        
        
    }
    
}
