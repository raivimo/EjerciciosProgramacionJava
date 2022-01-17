
package UD6.POO.Clase_Reloj;

public class Main {
    public static void main(String[] args) {
        Reloj uno= new Reloj();
        uno.dimeHora();
        uno.setReloj(23, 59, 59);
        
        uno.imprimeHora();
        uno.tick();
        uno.imprimeHora();

    }
 }
