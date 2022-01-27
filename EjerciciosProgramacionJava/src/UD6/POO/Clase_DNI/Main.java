
package UD6.POO.Clase_DNI;


public class Main {
    public static void main(String[] args) {
        DNI uno = new DNI(33565458);
        
        
        DNI dos = DNI.newRandomDNI();
        dos.getDNI();
        System.out.println(dos.getDNI());
        
        
        
    }
}
