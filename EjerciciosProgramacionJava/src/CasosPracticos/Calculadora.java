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
public class Calculadora {
    public static String res ="EL RESULTADO DE TU OPERACION ES: ";
    public static boolean salir = false;
    
    public static void menu(){
        //Scanner in = new Scanner(System.in);
        System.out.println("--BIENVENIDO A LA CALCULADORA--");
        System.out.println("1.-SUMAR (A+B)");
        System.out.println("2.-RESTAR (A-B)");
        System.out.println("3.-MULTIPLICAR (A*B)");
        System.out.println("4.-DIVIDIR (A/B)");
        System.out.println("5.-AREA RECTANGULO (BASE X ALTURA)");
        System.out.println("6.-AREA DE UN TRIANGULO EQUILÁTERO (BASE X ALTURA/2)");
        System.out.println("7.-AREA DE UN CIRCULO(PI X R2)");
        System.out.println("8.-SENO, COSENO Y TANGENTE(X)");
        System.out.println("9.-SALIR");
        //int opcion = in.nextInt();
        //if (opcion<9) 
            //System.out.println("HAS ELEGIDO " + opcion);
        //return opcion;
        }
    public static int pedirIntEnRango(int min, int max){
        Scanner in = new Scanner(System.in);
        System.out.println("DIME UN VALOR PARA REALIZAR LA OPERACION");
        int a = in.nextInt();
        while(a<min || a>max){
            System.out.println("ERROR! INTRODUCE  UN VALOR ADECUADO.");
        }
        return a;
    }
    public static void realizaOperacion(int opcion){
        Scanner in = new Scanner(System.in);
        opcion = in.nextInt();
        switch(opcion){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multi();
                break;
            case 4:
                divi();
                break;
            case 5:
                areaRectangulo();
                break;
            case 6:
                trianguloEquilatero();
                break;
            case 7:
                areaCirculo();
                break;
            case 8:
                senoCosenoTang();
                break;
            case 9:
                salir = true;
                break;
                
        }
    }
    public static void suma(){
        int a =pedirIntEnRango(-99999,99999);   
        int b =pedirIntEnRango(-99999,99999);
        int suma = a+b;
        System.out.println(res + suma);
    }
    public static void resta(){
        int a =pedirIntEnRango(-99999,99999);
        int b =pedirIntEnRango(-99999,99999);
        int resta =a-b;
        System.out.println(res + resta);
}
    public static void multi(){
        int a = pedirIntEnRango(-99999,99999);
        int b = pedirIntEnRango(-99999,99999);
        int multi = a*b;
        System.out.println(res + multi);
    }
    public static void divi(){
        int a = pedirIntEnRango(-99999,99999);
        int b = pedirIntEnRango(-99999,99999);
        while(b==0){
            System.out.println("NO SE PUEDE DIVIDIR POR CERO");
            b = pedirIntEnRango(-99999,99999);
        }
        int divi = a/b;
        System.out.println(res + divi);
    }
    public static void areaRectangulo(){
        int a = pedirIntEnRango(0,1000000);
        int b = pedirIntEnRango(0,1000000);
        int area = a*b;
        System.out.println(res + area);
        
    }
    public static void trianguloEquilatero(){
        int a = pedirIntEnRango(0,10000000);
        int b = pedirIntEnRango(0,10000000);
        int trianguloEquilatero=(a*b)/2;
        System.out.println(res + trianguloEquilatero);
    }
    public static void areaCirculo(){
        int radio = pedirIntEnRango(0,1000000);
        double pi = Math.PI;
        double area = radio*radio*pi;
        System.out.println(res + area);
        
    }
    public static void senoCosenoTang(){
        double x = pedirIntEnRango(-360,360);
        System.out.println("SENO(X): " + Math.sin(x));
        System.out.println("COSENO(X): " + Math.cos(x));
        System.out.println("TANGENTE(X): " + Math.tan(x));
        
    }
    
    public static void main(String[] args) {
       int opcion =0;
        do {
            menu();
            realizaOperacion(opcion);
            System.out.println("");
        } while (salir==false);

    }
}
