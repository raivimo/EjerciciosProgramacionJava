/*
 * Proyecto EjerciciosProgramacionJava - Archivo Banco.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6.CasoPractico.CasoPractico2;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 27 ene. 2022 18:59:57
 */
public class Banco {
    //Atributos
    private int maxCuentas=100;
    private int cuantos=0;
    private Cuenta [] arrayCuenta = new Cuenta [maxCuentas];
    private int numCuenta;
    private double dinero;

    //Metodos   
    public void verCuentas(){
        if(cuantos>0){
            for (int i = 0; i < cuantos ; i++) {
                System.out.print(i + ".");
                arrayCuenta[i].imprimirCuenta();
            }
        }
        else
            System.out.println("No hay cuentas");
    }
    
    public void ingresarDinero(){
        Scanner in = new Scanner(System.in);
        verCuentas();
        System.out.println("Dime el numero de cuenta en la que desees realizar el ingreso");
        int numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            System.out.println("Dime la cantidad que desees ingresar/");
            if (dinero > 0 ) 
                arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() + dinero));
            else
                System.out.println("La cantidad a ingresar debe ser mayor que 0");
            
        }
    }
    
    public void retirarDinero(){
        Scanner in = new Scanner(System.in);
        verCuentas();
        System.out.println("Dime el numero de cuenta en la que desees retirar el dinero");
        numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            System.out.println("Dime la cantidad que desees retirar");
            double disponible = (arrayCuenta[numCuenta].getSaldo()) - dinero;
            if (dinero > 0 && disponible >= -100)
                arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() - dinero));                               
            else
                System.out.println("La cantidad a ingresar debe ser mayor que 0 o saldo minimo mayor que -100€");
        }
    }
    
    public void transferencia(){
        Scanner in = new Scanner(System.in);
        verCuentas();
        System.out.println("Dime el numero de Cuenta Origen");
        numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            System.out.println("Dime la cantidad que desees transferir");
            dinero = in.nextDouble();
            double disponible = (arrayCuenta[numCuenta].getSaldo()) - dinero;
                if (dinero > 0 && disponible >= -100)
                    arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() - dinero));                               
                else
                    System.out.println("La cantidad a ingresar debe ser mayor que 0 o saldo minimo mayor que -100€");
        }
        else
            System.out.println("Lo siento, la cuenta no existe.");
        System.out.println("Dime numero de cuenta destino");
        numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            if (dinero > 0 ) 
                arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() + dinero));
            else
                System.out.println("La cantidad a transferir debe ser mayor que 0");
        }
    }
    
    public void agregarCuenta(String nombre, double saldo){
        if(cuantos<maxCuentas){
            arrayCuenta[cuantos] = new Cuenta(nombre, saldo);
            cuantos++;
        }
    }
    
    
}
