/*
 * Proyecto EjerciciosProgramacionJava - Archivo Articulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaArticulo;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 21:30:17
 */
public class Articulo {
    
    public String nombre;
    public int precioSinIva;
    public int iva = 21;
    public int cuantosQuedan;
    public double precioConIva;
    
    public Articulo (String nombre, int precioSinIva, int iva, int cuantosQuedan){
        this.nombre= nombre;
        this.precioSinIva= precioSinIva;
        this.iva= iva;
        this.cuantosQuedan= cuantosQuedan;
    }
    
    public double precioConIva(){
        return ((int) (1.21 * precioSinIva));
    }
    
    public boolean venta(int x) {
        if (cuantosQuedan < x) {
            System.out.println("ERROR: No quedan tantos para vender");
            return false;
        }
        else {
            cuantosQuedan -= x;
            return true;
        }
    }
    

}
