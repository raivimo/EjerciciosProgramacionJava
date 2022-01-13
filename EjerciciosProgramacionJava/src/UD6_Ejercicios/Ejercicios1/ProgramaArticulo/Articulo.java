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
    
    private String nombre;
    private int precioSinIva;
    private int iva = 21;
    private int cuantosQuedan;
    private double precioConIva;
    
    public Articulo (String nombre, int precioSinIva, int iva, int cuantosQuedan){
        this.nombre= nombre;
        this.precioSinIva= precioSinIva;
        this.iva= iva;
        this.cuantosQuedan= cuantosQuedan;
    }
    
    public double precioConIva(){
        return ((int) (1.21 * precioSinIva));
    }
    
    //GETTERS
    
    public String getNombre(){
        return nombre;
    }
    
    public int getPrecioSinIva(){
        return precioSinIva;
    }
    
    public int getIva(){
        return iva;
    }
    
    public int getCuantosQuedan(){
        return cuantosQuedan;
    }
    
    public int getPVP(){
        return ((int) (1.21 * precioSinIva));
    }
    
    public double getPVPDescuento(int x){
        double descuento = x/100;
        return (getPVP()*descuento);
    }
    
    //SETTERS
    
    public void SetNombre (String nombre){
        this.nombre=nombre;
    }
    
    public void SetPrecioSinIva (int precioSinIva){
        this.precioSinIva=precioSinIva;
    }
    
    public void SetIva (int iva) {
        this.iva=iva;
    }
    
    public void SetCuantosQuedan(int cuantosQuedan){
        this.cuantosQuedan= cuantosQuedan;
    }
    
    //METODOS UTILES
    
    public void imprimir(){
        System.out.println("Articulo: " + nombre + " Precio: " + precioSinIva + "€ " + "PVP: " + precioConIva() + "€ Stock Disponible: " + cuantosQuedan);
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
