/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6.POO.Clase_Coche;


public class Main {
    public static void main(String[] args) {
        Coche uno = new Coche("Ford Mondelo", "Azul", true, tipo.DEPORTIVO, "3485-HWN", 2003, seguro.TERCEROS);        
        Coche dos = new Coche("Ford Fiesta", "Rojo", false, tipo.UTILITARIO, "3325-LWN", 2003, seguro.TODO_RIESGO);   
        Coche tres = new Coche("Ford Kuga", "Negro", true, tipo.FAMILIAR, "4323-KSL", 2003, seguro.TERCEROS);   
        
        uno.imprimir();
        dos.imprimir();
        tres.imprimir();
    }
}
