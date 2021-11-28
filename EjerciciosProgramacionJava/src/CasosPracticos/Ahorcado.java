/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasosPracticos;
import java.util.Scanner;
/**
 *
 * @author raimo
 */
public class Ahorcado {
    public static int vidas = 5;
    public static String palabras [] = {"CASA","ZAPATO","SABANA","PERRO","GATO","HOGAR","AZULEJO"};
    public static String aleatorio = (palabras[((int)(Math.random()*8))]);
    
    
    public static void menu(){
        System.out.println("--BIENVENIDO AL JUEGO DEL --");
        System.out.println("          AHORCADO          ");
        }
    public static void palabraOculta(){
        System.out.print("Palabra: ");
        for (int i = 0; i < aleatorio.length() ; i++) {
           System.out.print("- ");
        }
}
    public static void vidas(){
        System.out.println("Vidas: " + vidas);
    }
    public static void letrasUsadas(){
        System.out.println("LETRAS USADAS: ");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        palabraOculta();
                
    }
}
