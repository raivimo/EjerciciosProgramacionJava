package UD6.CasoPractico.CasoPractico2;

import java.util.Scanner;


public class Main {
    public static void menu(){
        System.out.println("===BANCO PROGRAMADOR JAVA JUNIOR===");
        System.out.println("==ELIJA UNA DE LAS SIGUIENTES OCIONES");
        System.out.println("1.- VER CUENTAS");
        System.out.println("2.- INGRESAR DINERO");
        System.out.println("3.- RETIRAR DINERO");
        System.out.println("4.- TRANSFERENCIA");
        System.out.println("5.- AGREGAR CUENTA");
        System.out.println("6.- ELIMINAR CUENTA");
        System.out.println("7.- BUSCAR CUENTA");
        System.out.println("8.- MOSTRAR MOROSOS");
        System.out.println("9.- SALIR");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        Banco raimon = new Banco();
        
        do {
            menu();
            int opcion=in.nextInt();
            switch(opcion){
                case 1:
                    raimon.verCuentas();
                    break;
                case 2:
                    raimon.ingresarDinero();
                    break;
                case 3:
                    raimon.retirarDinero();
                    break;
                case 4:
                    raimon.transferencia();
                    break;
                case 5:
                    in.nextLine();
                    System.out.println("DIME NOMBRE DE LA CUENTA");
                    String nombre = in.nextLine();
                    System.out.println("DIME EL SALDO INICIAL");
                    double saldo = in.nextDouble();
                    raimon.agregarCuenta(nombre, saldo);
                    break;
                case 6:
                    raimon.eliminarCuenta();
                    break;
                case 7:
                    raimon.buscarCuenta();
                    break;
                case 8:
                    raimon.mostrarMorosos();
                    break;
                case 9:
                    salir=true;
                    break;
            }
        } while (salir == false);
    }
}
