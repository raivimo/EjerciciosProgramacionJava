/*
 * Proyecto EjerciciosProgramacionJava - Archivo Rectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaRectangulo;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:26:40
 */
public class Rectangulo {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    
    
    public int perimetro(){
        int ancho = Math.abs((x2-x1));
        int alto  = Math.abs((y2-y1));
        int perimetro = 2 * (ancho + alto);
        return perimetro;
    }    
    
    public int area(){
        int ancho = Math.abs((x2-x1));
        int alto  = Math.abs((y2-y1));
        int area = ancho * alto;
        return area;
    }    
    
    
}
