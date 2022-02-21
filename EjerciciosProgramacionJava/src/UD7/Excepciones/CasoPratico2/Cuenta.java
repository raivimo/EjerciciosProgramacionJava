/*
 * Proyecto EjerciciosProgramacionJava - Archivo Cuenta.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD7.Excepciones.CasoPratico2;

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
    public Cuenta(String nombre, double saldo) throws CuentaException{
        this.nombre=nombre;
        if(saldo >= 0)
            this.saldo = saldo;
        else
            throw new CuentaException("Saldo insuficiente");
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    public void setSaldo(double saldo) throws CuentaException{
        if(saldo>=-100)
            this.saldo=saldo;
        else
            throw new CuentaException("Lo siento, el saldo minimo máximo -100€.");
    }
    
    public void imprimirCuenta(){
        System.out.println("Titular de la Cuenta: " + getNombre() + "     Saldo Disponible: " + getSaldo() + " €");
    }
}
