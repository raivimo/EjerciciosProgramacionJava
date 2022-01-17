/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6.POO.Clase_Asignatura;

/**
 *
 * @author raimo
 */
public class Main {
    public static void main(String[] args) {
        Asignatura uno = new Asignatura ("Matematicas", 004, 1);
        Asignatura dos = new Asignatura ("Ingles", 005, 1);
        Asignatura tres = new Asignatura ("Entornos de Desarrollo", 006,1);
        
        uno.imprimir();
        dos.imprimir();
        tres.imprimir();
        
    }
}
