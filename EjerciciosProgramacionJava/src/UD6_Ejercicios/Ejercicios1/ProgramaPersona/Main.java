/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaPersona;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:09:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        

        Persona raimon = new Persona("33565458v", "Raimon", "Vilar Morera", 14);
        Persona amparo = new Persona("564654564v", "Amparo", "Vilar Morera", 20);
        
        raimon.imprimir();
        amparo.imprimir();
        
        System.out.println(raimon.getApellido());
        
        raimon.esMayorEdad(mayorEdad);
        
        System.out.println(raimon.diferenciaEdad(amparo));
        
        
        
        
        
    }
}
