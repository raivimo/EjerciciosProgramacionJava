package UD6.POO.Clase_CuentaCorriente;

import java.util.Scanner;

public class CuentaCorriente {
    private int numeroCuenta;
    private double saldo;
    
    //CONSTRUCTOR
    public CuentaCorriente(int numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        if(saldo<0)
            System.out.println("No se puede crear una cuenta con saldo negativo");
        this.saldo=saldo;
    }
    
    //GETTERS
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    //SETTERS
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    //METODOS
    public void ingresar(double ingresar){
        if(ingresar<=0)
            System.out.println("Lo siento, no se permiten ingresos negativos o nulos");
        else{
            this.saldo+=ingresar;
            System.out.println("El saldo de tu cuenta ahora es de: " + getSaldo() + " €");
        }
    }
    public boolean retirar(double retirar){
        if(saldo>=retirar && retirar>=0){
            saldo-=retirar;
            System.out.println("El saldo de tu cuenta ahora es de: " + getSaldo() + " €");
            return true;
        }
        else
            return false;
    }
    public void imprimir(){
        System.out.println("Numero de cuenta: " + getNumeroCuenta() + " Saldo disponible: " + getSaldo() + "€");
    }
    public static void menu(){
        System.out.println("==========MENU==========");
        System.out.println("==SELECCIONE UNA OPCION==");
        System.out.println("1. VER CUENTAS.");
        System.out.println("2. INGRESAR");
        System.out.println("3. RETIRAR");
        System.out.println("4. TRANSFERENCIA");
        System.out.println("5. SALIR");
    }
}
