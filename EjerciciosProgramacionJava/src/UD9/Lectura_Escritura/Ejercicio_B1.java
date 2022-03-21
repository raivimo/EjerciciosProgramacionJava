/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio_B1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD9.Lectura_Escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 21 mar. 2022 20:28:14
 */
public class Ejercicio_B1 {

    public static void main(String[] args){
        try{
            File f = new File("Documentos/numeros.txt");
            Scanner in = new Scanner(f);
            
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int aux;
            
            while ( in.hasNext() ){
                min = in.nextInt();
                aux = in.nextInt();
                if ( min > aux )
                    min = aux;
                if ( max < aux )
                    max = aux;
            }
            in.close();
            System.out.println(min);
            System.out.println(max);
        }catch(Exception e){
            System.out.println("Error: " + e);
            e.printStackTrace();
    }
}
}
