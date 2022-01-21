
package UD6.POO.Clase_CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente uno = new CuentaCorriente(1, 200);
        CuentaCorriente arrayObjeto[] = new CuentaCorriente[5];
        arrayObjeto[0] = new CuentaCorriente(1,500);
        arrayObjeto[1] = new CuentaCorriente(2,300);
        arrayObjeto[2] = new CuentaCorriente(3,700);
        
        
        uno.ingresar(100);
        System.out.println(uno.retirar(500));
    }
}
