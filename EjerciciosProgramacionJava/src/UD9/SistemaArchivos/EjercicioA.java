
package UD9.SistemaArchivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 mar. 2022 19:45:22
 */
public class EjercicioA {
    
    public static void muestraInfoRuta(File ruta) throws IOException{
        ArrayList <File> arx = new ArrayList();
        ArrayList <File> dir = new ArrayList();
        
        if(ruta.isFile() == true)
            System.out.println("Nombre del Archivo: " + ruta.getName() );
        
        else{
            File[] lista = ruta.listFiles();
            System.out.println("Contenido Directorio: " + ruta.getAbsolutePath() + " :");
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if( f.isDirectory() )
                    dir.add(lista[i]);
                else
                    arx.add(lista[i]);
            }
            Collections.sort(arx);
            Collections.sort(dir);
            
            for (int i = 0; i < dir.size(); i++) {
                System.out.println("[D]" + dir.get(i).getName() );
            }
            
            for (int i = 0; i < arx.size(); i++) {
                System.out.println("[A]" + arx.get(i).getName() );
            }
        }
    }
        
    
    public static void main(String[] args) {
        try{
            File ruta = new File ("/datos/usuarios/alumnos/a033565458v");
            muestraInfoRuta(ruta);
            
        }catch(IOException e1){
            System.err.println("No existe archivo/directorio.");
        }catch(NullPointerException e2){
            System.out.println("No existe archivo/directorio.");
        }
            
        
        
        
    }

}
