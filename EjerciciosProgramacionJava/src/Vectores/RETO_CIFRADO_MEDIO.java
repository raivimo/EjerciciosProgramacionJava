/*
 * Proyecto EjerciciosProgramacionJava - Archivo RETO_CIFRADO_BASICO.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package Vectores;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 mar. 2022 18:38:15
 */
public class RETO_CIFRADO_MEDIO {

    public static void main(String[] args) {
        try {
            File f = new File("Documentos/carta-cifrada.txt");
            Scanner in = new Scanner(f);
            String lineas;
            char[] caracteres;
            ArrayList<Integer> asci_original = new ArrayList();
            ArrayList<Integer> asci_modificado = new ArrayList();
            int clave = 0;
            
            char[] carachteres2;

            while (in.hasNextLine()) {
                lineas = in.nextLine();
                caracteres = lineas.toCharArray();
                
                for (int i = 0; i < caracteres.length; i++) {
                    asci_original.add( (int)caracteres[i] );
                }
                
                for (int i = 0; i < asci_original.size(); i++) {
                    if ( asci_original.get(i) < 65) 
                        asci_modificado.add( asci_original.get (i) );
                    if ( asci_original.get(i) >= 65 )    
                        asci_modificado.add( asci_original.get(i)+clave );
                    
                }
                
                for (int i = 0; i < 10; i++) {
                    
                }
              
                
            }
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }

    }
}
