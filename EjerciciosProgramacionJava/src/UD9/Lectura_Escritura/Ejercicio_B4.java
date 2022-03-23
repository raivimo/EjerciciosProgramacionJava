/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ejercicio_B4.java - Compañia DAW
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
 * @date 23 mar. 2022 21:35:49
 */
public class Ejercicio_B4 {
    public static void main(String[] args) {
        try{
        File f = new File ("Documentos/usa_nombres.txt");
        File ff = new File("Documentos/usa_apellidos.txt");
        
        Scanner in = new Scanner(f);
        Scanner in2 = new Scanner(ff); 
        
        
        
        
        
        
        }catch (Exception e){
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
