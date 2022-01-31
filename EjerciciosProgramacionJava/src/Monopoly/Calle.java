/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Monopoly;

/**
 *
 * @author raimo
 */
public class Calle {
    //Atributos
    private String nombre;
    private double precio;
    private double alquilerCalle;
    
    //Constructor
    public Calle(String[] nombreCalles, double[] precioCalles){
        for (int i = 0; i < i ; i++) {
            this.nombre = nombreCalles[i];
            this.precio = precioCalles[i];
        }
    }
    
    
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public double getAlquilerCalle(){
        return alquilerCalle;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public void setAlquilerCalle(double precio){
        this.alquilerCalle=0.22*precio;
    }
    
    public void imprimir(){
        System.out.println("Nombre Calle : " + getNombre() + " Precio Calle: " + getPrecio() + " €");
    }
}

