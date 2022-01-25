
package UD6.POO.Clase_DNI;


public class Main {
    public static void main(String[] args) {
        DNI uno = new DNI(33565458);
        System.out.println(uno.getLetra());
        System.out.println(uno.getNIF());
        
        
        System.out.println(uno.newRandomDNI());
    }
}
