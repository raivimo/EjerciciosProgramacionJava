/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaPunto;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:02:21
 */
public class Main {
    public static void main(String[] args) {
 
     
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto (5,5);
        Punto p3 = Punto.creaPuntoAleatorio();
        Punto p4 = Punto.creaPuntoAleatorio();
        Punto p5 = Punto.creaPuntoAleatorio();
        
        p3.imprimir();
        p4.imprimir();
        p5.imprimir();
        
        
        
        

    }
}
