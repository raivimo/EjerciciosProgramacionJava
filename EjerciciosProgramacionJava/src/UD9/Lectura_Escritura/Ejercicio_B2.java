/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio_B2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD9.Lectura_Escritura;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 21 mar. 2022 21:25:43
 */
public class Ejercicio_B2 {
    public static void main(String[] args) {
        try{
            File f = new File ("Documentos/alumnos_notas.txt");
            Scanner in = new Scanner(f);
            
            String[] nombres = new String[10];
            String[] trozosnombres;
            
            while ( in.hasNextLine() ){
                for (int i = 0; i < nombres.length; i++) {
                    nombres[i]=in.nextLine();
                }
               
                trozosnombres = nombres[0].split(" ");
                String nombre;
                String apellido;
                int suma = 0;
                for (int i = 2; i < nombres[0].length(); i++) {
                    trozosnombres[i] += suma;
                }
                
                int media = suma/(nombres[0].length() - 2);
                System.out.println(media);
                
                
            }
            
            System.out.println(nombres[0]);
            
            
            
            
        }catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
