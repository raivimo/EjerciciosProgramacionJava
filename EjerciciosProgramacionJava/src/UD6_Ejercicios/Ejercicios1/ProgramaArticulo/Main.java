/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:30:22
 */
public class Main {
    public static void main(String[] args) {
        Articulo uno = new Articulo("teclado", 50, 21, 5);
        
        System.out.println(uno.getNombre() + " - Precio:"+uno.getPrecioSinIva()+"€ - IVA:"+uno.getIva()+"% - PVP:"+uno.precioConIva()+"€");
        uno.imprimir();
        System.out.println(uno.getPVPDescuento(10));
             
        
    }

}
