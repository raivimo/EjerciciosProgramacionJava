/*
 * Proyecto EjerciciosProgramacionJava - Archivo Persona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaPersona;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:09:45
 */
public class Persona {
    private final String dni;
    private String nombre;
    private String apellido;
    private int edad;
    public final int mayorEdad=18;
    
    public Persona(String dni, String nombre, String apellido, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    //GETTERS
    
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    
    //SETTERS
    
        
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    
    //METODOS UTILES
    
    public void imprimir(){
        System.out.println(nombre + " " + apellido + " con DNI " + dni);
    }
    
    public boolean esMayorEdad(int mayorEdad){
        return mayorEdad>18;
    }
    
    public boolean esJubilado(){
        return edad>=65;
    }
    
    public int diferenciaEdad(Persona p){
        return Math.abs(p.getEdad()-edad);
    }
}

