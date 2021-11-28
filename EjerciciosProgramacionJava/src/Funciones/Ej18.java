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
public class Ej18 {
    
    public static void saberLetra(int a){
        String letra[]={"T", "R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int res = (a%23);
        System.out.println(letra[res]);
            }
 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
             
        System.out.println("DIME EL NUMERO DEL DNI PARA SABER LA LETRA");
        int a = in.nextInt();
        saberLetra(a);
        
        
        
        
    }
}
