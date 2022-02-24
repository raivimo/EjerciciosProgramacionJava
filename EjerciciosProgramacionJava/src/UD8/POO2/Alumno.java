/*
 * Proyecto EjerciciosProgramacionJava - Archivo Alumno.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD8.POO2;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 feb. 2022 19:17:39
 */
public class Alumno extends Persona {
    private String grupo;
    private double nota_media;
    
    public Alumno(String n, String a, String f, String grupo, double nota_media){
        super(n,a,f);
        this.grupo=grupo;
        this.nota_media=nota_media;
    }
    
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println(" Grupo: " + grupo + " Nota Media: " + nota_media);
    }

}
