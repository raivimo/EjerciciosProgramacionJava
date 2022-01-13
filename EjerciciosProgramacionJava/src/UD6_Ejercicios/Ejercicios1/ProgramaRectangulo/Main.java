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
        
        Rectangulo uno = new Rectangulo(5,8,10,16);
        Rectangulo dos = new Rectangulo (2,1,12,50);

        uno.imprimir();
        uno.setX1Y1(8, 8);
        uno.imprimir();
        uno.setAll(2, 3, 4, 6);
        uno.imprimir();
        System.out.println(uno.perimetro());
        System.out.println(uno.area());
        
    }

}
