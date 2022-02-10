package UD6.ArrayList.CasoPractico;

import java.util.Arrays;
import java.util.Scanner;

public class Contacto {
    //Atributos
    private String nombre;
    private String telf;
    private String correo;
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }   
    
    public String getCorreo(){
        return correo;
    }
    public String getTelf(){
        return telf;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCorreo(String   
     correo){
        this.correo = correo;
    }
    public void setTelf(String telf){
        this.telf = telf;
    }
    
    //CONSTRUCTOR
    public Contacto(String nombre, String correo, String telf){
        this.nombre = nombre;
        this.correo = correo;
        this.telf = telf;
    }
     
    //METODOS UTILES
    public void imprimir(){
        System.out.println("Nombre Contacto: " +getNombre() + " Telefono: " + getTelf() + " Correo: " + getCorreo());
    }
}
    
