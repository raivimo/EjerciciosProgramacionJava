
package Monopoly;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        String nombreCalles[] = {"SALIDA", "RONDA DE VALENCIA", "CAJA DE COMUNIDAD", "PLAZA LAVAPIES", "IMPUESTO SOBRE EL CAPITAL",
        "ESTACIÓN DE GOYA", "GLORIETA CUATRO CAMINOS", "SUERTE", "AVENIDA DE REINA VICTORIA", "CALLE BRAVO MURILLO", "CARCEL/VISITAS",
        "GLORIETA DE BILBAO", "COMPAÑIA DE ELECTRICIDAD", "CALLE ALBERTO AGUILERA", "CALLE FUENCARRAL", "ESTACIÓN DE LAS DELICIAS",
        "AVD. FELIPE II", "CAJA DE COMUNIDAD", "CALLE VELÁZQUEZ", "CALLE SERRANO", "PARKING GRATUITO", "AVENIDA DE AMERICA", "SUERTE",
        "CALLE MARIA DE MOLINA", "CALLE DE CEA BERMÚDEZ", "ESTACIÓN DEL MEDIODIA", "AVDA. DE LOS REYES CATÓLICOS", "CALLE BAILÉN", "COMPAÑÍA DISTRIBUCIÓN DE AGUAS",
        "PLAZA ESPAÑA", "VÉ A LA CÁRCEL", "PUERTA DEL SOL", "CALLE DE ALCALÁ", "CAJA DE COMUNIDAD", "GRAN VÍA", "ESTACIÓN DEL NORTE", "SUERTE",
        "PASEO DE LA CASTELLANA", "IMPUESTO DE LUJO", "PASEO DEL PRADO"};
        double[] precioCalles = {200, 60, 0, 60, 200, 200, 100, 0, 100, 120, 0, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240,
        200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 0, 350, 100, 400};
    
        
        Calle arrayCalles [] = new Calle [40];
        
        for (int i = 0; i < arrayCalles.length; i++) {
            arrayCalles[i] = new Calle(nombreCalles, precioCalles);
        }
    
        
        
        for (int i = 0; i < arrayCalles.length; i++) {
            arrayCalles[i].imprimir();
        }
        
        
        
        
        
    }
}
