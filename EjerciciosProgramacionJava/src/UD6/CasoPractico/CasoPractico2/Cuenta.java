/*
 * Proyecto EjerciciosProgramacionJava - Archivo Cuenta.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6.CasoPractico.CasoPractico2;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 27 ene. 2022 18:59:51
 */
public class Cuenta {
    //Atributos
    private String nombre;
    private double saldo;
    
    //Constructor
    public Cuenta(String nombre, double saldo){
        this.nombre=nombre;
        this.saldo=saldo;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setSaldo(double saldo){
        if(saldo>=-100)
            this.saldo=saldo;
        else
            System.out.println("Lo siento, el saldo minimo máximo -100€.");
    }
    
    public void imprimirCuenta(){
        System.out.println("Nombre Cuenta: " + getNombre() + " Saldo de la Cuenta: " + getSaldo());
    }
}
