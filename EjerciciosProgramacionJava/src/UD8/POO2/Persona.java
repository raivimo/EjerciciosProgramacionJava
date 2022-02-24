/*
 * Proyecto EjerciciosProgramacionJava - Archivo Persona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD8.POO2;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 feb. 2022 19:11:07
 */
public class Persona {
    String nombre;
    private String apellidos;
    private String fechaNacim;
    
    public Persona(String n, String a, String f){
        nombre=n;
        apellidos=a;
        fechaNacim=f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
    
    public void imprimir(){
        System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos + " Fecha Nacimiento: " + fechaNacim);
    }
}
