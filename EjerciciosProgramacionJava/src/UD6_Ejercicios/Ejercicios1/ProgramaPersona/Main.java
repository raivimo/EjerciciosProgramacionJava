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
        
        /*Persona raimon = new Persona();
        System.out.println("DIME NOMBRE DE LA PERSONA");
        raimon.nombre= in.nextLine();
        System.out.println("DIME DNI");
        raimon.dni = in.nextLine();
        System.out.println("DIME APELLIDOS");
        raimon.apellido = in.nextLine();
        System.out.println("DIME EDAD");
        raimon.edad = in.nextInt();
        
        Persona amparo = new Persona();
        in.nextLine();
        System.out.println("DIME NOMBRE DE LA PERSONA");
        amparo.nombre= in.nextLine();
        System.out.println("DIME DNI");
        amparo.dni = in.nextLine();
        System.out.println("DIME APELLIDOS");
        amparo.apellido = in.nextLine();
        System.out.println("DIME EDAD");
        amparo.edad = in.nextInt();
*/
        Persona raimon = new Persona("33565458v", "Raimon", "Vilar Morera", 38);
        Persona amparo = new Persona("564654564v", "Amparo", "Vilar Morera", 22);
        
        raimon.imprimir();
        amparo.imprimir();
        
        
        
        
    }
}
