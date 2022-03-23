/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio_B3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD9.Lectura_Escritura;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 23 mar. 2022 21:10:52
 */
public class Ejercicio_B3 {
    public static void main(String[] args) {
        try{
            File f = new File("Documentos/usa_personas.txt");
            Scanner in = new Scanner(f);
            ArrayList <String> personas = new ArrayList();
            
            File ff = new File ("Documentos/usa_personas_sorted.txt");
            FileWriter writer = new FileWriter(ff);
            
            while (in.hasNextLine()) {
                personas.add(in.nextLine());
            }
            
            Collections.sort(personas);
            
            
            for (int i = 0; i < personas.size(); i++) {
                String get = personas.get(i);
                System.out.println(get);
                writer.write("" + get + "\n");
            }
            
        in.close();
        writer.close();
        }catch(Exception e){
            System.err.println("Error");
            e.printStackTrace();
        }   
        
        
    }
}
