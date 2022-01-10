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
        Punto uno = new Punto();
        uno.x=5;
        uno.y=0;
        uno.imprimir();
        
        Punto dos = new Punto();
        dos.x=10;
        dos.y=10;
        dos.imprimir();
        
        Punto tres = new Punto();
        tres.x=-3;
        tres.y=7;
        tres.imprimir();
    }
}
