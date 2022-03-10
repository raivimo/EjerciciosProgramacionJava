/*
 * Proyecto EjerciciosProgramacionJava - Archivo PruebaFicheros2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package UD9.SistemaArchivos;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 mar. 2022 19:05:59
 */
public class PruebaFicheros2 {
    
    public static void mostrarEstado(File f) {
        System.out.println(f.getAbsolutePath() + " ¿archivo? " + f.isFile());
        System.out.println(f.getAbsolutePath() + " ¿carpeta? " + f.isDirectory());
    }

    public static void main(String[] args) {
        
        File temp = new File("/datos/usuarios/alumnos/a033565458v/Temp");
        File fotos = new File("/datos/usuarios/alumnos/a033565458v/Temp/Fotos");
        File document = new File("/datos/usuarios/alumnos/a033565458v/Temp/Documento.txt");
        
        System.out.println(temp.getAbsolutePath() + " ¿existe? " + temp.exists());
        mostrarEstado(fotos);
        mostrarEstado(document);
        
        System.out.println("Tamaño del archivo: " + document.length());
        
        long milisegundos = document.lastModified();
        Date fecha = new Date(milisegundos);
        System.out.println("Ultima modificacion: " + fecha);
        System.out.println("Ultima modificacion en ms: " + document.lastModified() );
        
        
    }

}
