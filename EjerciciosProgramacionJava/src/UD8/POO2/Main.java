/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD8.POO2;

import java.util.ArrayList;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 feb. 2022 19:22:27
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> al = new ArrayList();
        
        Alumno a1 = new Alumno("Raimon", "Vilar Morera", "31/12/1986", "1-C", 8.7);
        Alumno a2 = new Alumno("Camila", "Cabello Sotomonte", "32/05/1995", "2-C", 6.3);
        Profesor p1 = new Profesor("Jose", "Garcia Vicente", "22/03/1997", 1900, "Informatica");
        Profesor p2 = new Profesor("Teodoro", "Llorente Misero", "06/06/2004", 2500, "Informatica");
        al.add(a1);
        al.add(a2);
        al.add(p1);
        al.add(p2);
        for (int i = 0; i < al.size(); i++) {
            al.get(i).imprimir();
        }
        
        
        
   
       
        
        
    }

}
