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
        Asignatura arrayObjeto[]= new Asignatura[5];
        arrayObjeto[0]=new Asignatura ("Sistemas informaticos", 1155, 1);
        arrayObjeto[1]=new Asignatura ("Entornos de Desarrollo", 1165, 1);
        arrayObjeto[2]=new Asignatura ("Programacion", 1175, 1);
        arrayObjeto[3]=new Asignatura ("FOL", 1185, 1);
        arrayObjeto[4]=new Asignatura ("Ingles", 1195, 1);
        
        for (int i = 0; i < arrayObjeto.length; i++) {
            arrayObjeto[i].imprimir();
        }
        
        
        
    }
}
