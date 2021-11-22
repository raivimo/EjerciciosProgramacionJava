/*
 * Proyecto PROGRAMACION - Archivo ejeplo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Matrices;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:12:27
 */
public class ejeplo {
    public static void main(String[] args) {
        
    
	double[][] matriz={{1,2,3,4},{5,6},{7,8,9,10,11,12},{13}};
        for (int i = 0 ; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
                }
        System.out.println("");
}
}
}