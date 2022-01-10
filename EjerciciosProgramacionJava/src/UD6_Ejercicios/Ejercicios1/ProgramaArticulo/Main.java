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
        Articulo uno = new Articulo();
        
        uno.nombre = "Teclado";
        uno.precioSinIva= 50;
        uno.iva = 21;
        uno.cuantosQuedan = 5;
        uno.precioConIva = (int) uno.precioConIva(uno.precioSinIva);
        
        System.out.println(uno.nombre + " - Precio:"+uno.precioSinIva+"€ - IVA:"+uno.iva+"% - PVP:"+uno.precioConIva+"€");
        
        
    }

}
