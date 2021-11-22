package Entregables_UD3;

import java.util.Scanner;
    public class Ejercicio2 {

    public static void main (String[] args){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("BIENVENIDO A LA CALCULADORAint exp = a^b;");
        
        System.out.println("1.SUMA A+B");
        System.out.println("2.RESTA A-B");
        System.out.println("3.MULTIPLICAR A*B");
        System.out.println("4.DIVIDIR A/B");
        System.out.println("5.RESTO A%B");
        System.out.println("6.EXPONENCIAL A^B");
        System.out.println("7.SENO(X)");
        System.out.println("8.COSENO(X)");
        System.out.println("9.TANGENTE(X)");
        System.out.println("10.SALIR");
        System.out.println("ELIGE UN NUMERO PARA HACER TU OPERACION");
        
        double a;
        double b;
        
        char c;
        c = lector.nextLine().charAt(0);
        
        System.out.println("Has elegido " +c);
        int opcion = Character.getNumericValue(c);

        
        System.out.println("DIME A");
        a = lector.nextDouble();
        System.out.println("DIME B");
        b = lector.nextDouble();


       switch (opcion) {
            case 1:
                System.out.println("El resultado de tu operación es "+(a+b));
                break;
            case 2:
                System.out.println("El resultado de tu operación es " +(a-b));
                break;
            case 3:
                System.out.println("El resultado de tu operación es "+(a*b));
                break;
            case 4:
                System.out.println("El resultado de tu operación es "+ (a/b));
                break;
            case 5:
                System.out.println("El resultado de tu operación es "+ (a%b));
                break;
            case 6:
                System.out.println("El resultado de tu operacion es "+ Math.pow(a, b));
                break;
            case 7:
                System.out.println("El resultado de tu operacion es "+ Math.sin(a));
                break;
            case 8:
                System.out.println("El resultado de tu operacion es "+ Math.cos(a));
                break;
            case 9:
                System.out.println("El resultado de tu operacion es "+ Math.tan(a));
                break;
            case 10:
                System.out.println("SALIR");
                lector.nextLine();
                break;

            default:
                System.out.println("ERROR");
        }               
    }
}