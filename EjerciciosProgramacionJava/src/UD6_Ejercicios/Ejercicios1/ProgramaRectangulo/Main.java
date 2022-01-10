/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaRectangulo;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:26:45
 */
public class Main {

    
    public static void main(String[] args) {
        
        Rectangulo uno = new Rectangulo();
        uno.x1=0;
        uno.y1=0;
        uno.x2=5;
        uno.y2=5;
        
       
        
        Rectangulo dos = new Rectangulo();
        dos.x1=7;
        dos.y1=9;
        dos.x2=2;
        dos.y2=3;
        
        System.out.println("COORDENADAS RECTANGULO 1: ("+ uno.x1 + ", " +uno.y1+")");
        System.out.println("COORDENADAS RECTANGULO 2: ("+ dos.x1 + ", " +dos.y1+")");
        
        
        System.out.println("Perimetro de rectangulo 1: " + uno.perimetro() );
        System.out.println("Perimetro de rectangulo 2: " + dos.perimetro() );
        
        System.out.println("Área rectangulo 1: " + uno.area());
        System.out.println("Área rectangulo 2: " + dos.area());
     
        
    }

}
