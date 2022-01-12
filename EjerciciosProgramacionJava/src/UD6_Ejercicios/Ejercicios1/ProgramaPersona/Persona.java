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
    public String dni;
    public String nombre;
    public String apellido;
    public int edad;
    
    public Persona(String dni, String nombre, String apellido, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    
    public void imprimir(){
        System.out.print(nombre + " " + apellido + " con DNI " + dni);
    }
    
    public void mayorEdad(){
        if(edad < 18)
            System.out.println("ES MAYOR DE EDAD");
        else
            System.out.println("NO ES MAYOR DE EDAD");
        
        
    }
}
