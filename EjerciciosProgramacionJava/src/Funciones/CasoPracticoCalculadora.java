/*
 * Proyecto EjerciciosProgramacionJava - Archivo CasoPracticoCalculadora.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 nov. 2021 20:27:45
 */
public class CasoPracticoCalculadora {
    
    
    public static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("--BIENVENIDO A LA CALCULADORA--");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. AREA DE UN TRIANGULO");
        System.out.println("6. AREA DE UN TRIANGULO EQUILATERO");
        System.out.println("7. AREA DE UN CIRCULO");
        System.out.println("8. SENO, COSENO Y TANGENTE DE X");
        System.out.println("9. SALIR.");
        int opcion = in.nextInt();
        
    }
    
    public static void pedirIntEnRango(double min, double max) {
        Scanner in = new Scanner(System.in);
        double a, b;
        do {         
            System.out.println("DIME VALOR DE A");
            a = in.nextDouble();
            System.out.println("DIME VALOR DE B");
            b = in.nextDouble();
            if ( a < min && b > max )
                System.out.println("LO SIENTO VALOR FUERA DE RANGO. INGRESE UN VALOR CORRECTO.");
          } while ( a < min && b > max );
           
    }
    
    public static int pasarValores(int a, int b){
        
    }
            
    public static double suma (double a, double b){
        Scanner in = new Scanner(System.in);
        System.out.println("DIME A");
        double x = in.nextDouble();
        System.out.println("DIME B");
        double y = in.nextDouble();
        return a+b;
    }
    
    public static double resta (double a, double b){
        Scanner in = new Scanner(System.in);
        System.out.println("DIME A");
        double x = in.nextDouble();
        System.out.println("DIME B");
        double y = in.nextDouble();
        return a-b;
    }
    
    public static double multi (double a, double b){
        Scanner in = new Scanner(System.in);
        System.out.println("DIME A");
        double x = in.nextDouble();
        System.out.println("DIME B");
        double y = in.nextDouble();
        return a+b;
    }
    
    public static double div (double a, double b){
        Scanner in = new Scanner(System.in);
        System.out.println("");
        if (b == 0) 
            System.out.println("¡ERROR! NO SE PUEDE DIVIDIR POR 0");
        
        return a/b;
    }
    
    public static double areaRectangulo(double a, double b){
        
    }
    
    
    public static void main(String[] args) {
              
                
    }

}
