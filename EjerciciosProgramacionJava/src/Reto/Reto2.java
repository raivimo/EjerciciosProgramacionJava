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
public class Reto2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        while(x<1000){
            x = in.nextInt();
            if(x!=0){
                if (x%2==0)
                    System.out.println("DERECHA");
                else
                    System.out.println("IZQUIERDA");
            }
        }
    }
}
