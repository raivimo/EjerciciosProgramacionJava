
package UD6.POO.Clase_CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente uno = new CuentaCorriente(1, 200);
        
        uno.ingresar(100);
        System.out.println(uno.retirar(500));
    }
}
