/*
 * Proyecto EjerciciosProgramacionJava - Archivo PruebasFicheros.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD9.SistemaArchivos;

import java.io.File;

public class PruebasFicheros {
    
    public static void mostrarRutas(File f){
        System.out.println("Nombre del archivo: " + f.getName() );
        System.out.println("Ruta relativa del archivo: " + f.getParent());
        System.out.println("Ruta absoluta del archivo: " + f.getAbsolutePath() );
    }
    
    public static void mostrarEstado(File f){
        System.out.println(f.getAbsolutePath() +" ¿archivo? " + f.isFile() );
        System.out.println(f.getAbsolutePath() +" ¿directorio? " + f.isDirectory() );
    }
    
    public static void main(String[] args) {
        
        
        File temp = new File ("/datos/usuarios/alumnos/033565458v/Temp");
        File fotos = new File ("/datos/usuarios/alumnos/033565458v/Temp/Fotos");
        File document = new File ("/datos/usuarios/alumnos/033565458v/Temp/Documento.txt");
        
        System.out.println(temp.getAbsolutePath() + " ¿Existe? " + temp.exists() );
        
        
       
       
       mostrarEstado(document);
        
        
            
    }
}
