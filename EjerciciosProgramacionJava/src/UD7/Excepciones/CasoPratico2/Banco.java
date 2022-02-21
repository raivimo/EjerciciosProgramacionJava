/*
 * Proyecto EjerciciosProgramacionJava - Archivo Banco.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones.CasoPratico2;

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
    
    public void ingresarDinero() throws CuentaException {
        Scanner in = new Scanner(System.in);
        if (numCuenta < cuantos && cuantos >0) {
            System.out.println("Dime el numero de cuenta en la que desees realizar el ingreso");
            int numCuenta = in.nextInt();
            System.out.println("Dime la cantidad que desees ingresar");
            dinero = in.nextDouble();
            if (dinero > 0 ) 
                arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() + dinero));
            else
               throw new CuentaException("La cantidad a ingresar debe ser mayor que 0");
        }
        else
            throw new CuentaException("Posición incorrecta/Cree cuentas");
    }
    
    public void retirarDinero() throws CuentaException {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el numero de cuenta en la que desees retirar el dinero");
        numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            System.out.println("Dime la cantidad que desees retirar");
            dinero = in.nextDouble();
            double disponible = (arrayCuenta[numCuenta].getSaldo()) - dinero;
            if (dinero > 0 && disponible >= -100)
                arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() - dinero));                               
            else
                throw new CuentaException("La cantidad a ingresar debe ser mayor que 0 o saldo minimo mayor que -100€");
        }
        else
            throw new CuentaException("Numero de cuenta incorrecto");
    }
    
    public void transferencia() throws CuentaException {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el numero de Cuenta Origen");
        numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            System.out.println("Dime la cantidad que desees transferir");
            dinero = in.nextDouble();
            double disponible = (arrayCuenta[numCuenta].getSaldo()) - dinero;
                if (dinero > 0 && disponible >= -100)
                    arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() - dinero));                               
                else
                    throw new CuentaException("La cantidad a ingresar debe ser mayor que 0 o saldo minimo mayor que -100€");
        }
        else
            throw new CuentaException("Lo siento, la cuenta no existe.");
        System.out.println("Dime numero de cuenta destino");
        numCuenta = in.nextInt();
        if (numCuenta < cuantos) {
            if (dinero > 0 ) 
                arrayCuenta[numCuenta].setSaldo((arrayCuenta[numCuenta].getSaldo() + dinero));
            else
                throw new CuentaException("La cantidad a transferir debe ser mayor que 0");
        }
        else
            throw new CuentaException("Cuenta de destino incorrecta");
    }
    
    public void agregarCuenta(String nombre, double saldo) throws CuentaException{
        if(cuantos<maxCuentas){
            arrayCuenta[cuantos] = new Cuenta(nombre, saldo);
            cuantos++;
        }
        else
            throw new CuentaException("Limite cuentas alcanzado/saldo negativo");
    }
    
    public void eliminarCuenta() throws CuentaException {
        Scanner in = new Scanner(System.in);
        System.out.println("Diga el numero de cuenta que desee eliminar");
        numCuenta=in.nextInt();
        if (numCuenta >= 0 && numCuenta < cuantos) {
            for (int i = numCuenta + 1 ; i < cuantos; i++) {
                arrayCuenta[i-1]= arrayCuenta[i];
            }
            cuantos--;
            System.out.println("Cuenta: " + numCuenta + " borrada");
        }
        else
            throw new CuentaException("Numero de cuenta incorrecto");
    }
    
    public void buscarCuenta(){
        Scanner in = new Scanner(System.in);
        boolean encontrado = false;
        System.out.println("Indique el nombre de la cuenta que desee buscar");
        String buscar = in.nextLine();
        for (int i = 0; i < cuantos; i++) {
            if (arrayCuenta[i].getNombre().equalsIgnoreCase(buscar)) {
                System.out.println(i + ". Titular de Cuenta: " + arrayCuenta[i].getNombre() + "     Saldo de la Cuenta: " + arrayCuenta[i].getSaldo() + " €");
                encontrado = true;
            }
            if(!encontrado)
                System.out.println("Lo siento, la cuenta no existe");
        }
    }
    
    public void mostrarMorosos(){
        boolean moroso = false;
        for (int i = 0; i < cuantos; i++) {
            if(arrayCuenta[i].getSaldo() < 0){
                moroso = true;
                System.out.println("==LAS CUENTAS CON MOROSIDAD SON LAS SIGUIENTES==");
                System.out.println(i + ". Titular de Cuenta: " + arrayCuenta[i].getNombre() + "     Saldo de la Cuenta: " + arrayCuenta[i].getSaldo() + " €");
            }
        }
        if(!moroso)
            System.out.println("No hay cuentas con saldos negativos en este momento");
    }
}
