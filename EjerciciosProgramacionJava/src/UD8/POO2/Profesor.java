/*
 * Proyecto EjerciciosProgramacionJava - Archivo Profesor.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD8.POO2;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 feb. 2022 19:13:07
 */
public class Profesor extends Persona {
    private double salario;
    private String especialidad;
    
    public Profesor(String n, String a, String f, double salario, String especialidad){
        super(n,a,f);
        this.salario=salario;
        this.especialidad=especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println(" Salario: " + salario + " Especialidad: " + especialidad);
    }
    
    
    
}
