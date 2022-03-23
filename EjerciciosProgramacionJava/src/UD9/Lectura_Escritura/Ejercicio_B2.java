/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio_B2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package UD9.Lectura_Escritura;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 21 mar. 2022 21:25:43
 */
public class Ejercicio_B2 {

    public static void main(String[] args) {
        try {
            File f = new File("Documentos/alumnos_notas.txt");
            Scanner in = new Scanner(f);

            String nombres;
            String[] partes = null;
            int suma = 0;
      
            while (in.hasNextLine()) {
                suma = 0;
                nombres = in.nextLine();
                partes = nombres.split(" ");
                for (int i = 2; i < partes.length; i++) {
                    suma += Integer.parseInt(partes[i]);
                }
                int result = suma / (partes.length-2);
                System.out.println("Nombre: " + partes[0] + " Apellidos: " + partes[1] + " Nota Media: " + result );
            }
            in.close();
            } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
