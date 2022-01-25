
package UD6.POO.Clase_Reloj;

public class Main {
    public static void main(String[] args) {
        Reloj arrayObjeto[] = new Reloj [5];
        arrayObjeto[0]= new Reloj(22, 33, 45);
        arrayObjeto[1] = new Reloj(21, 22, 29);
        arrayObjeto[2] = new Reloj(12, 45, 50);
        arrayObjeto[3] = new Reloj(14,50,34);
        arrayObjeto[4] = new Reloj(18,22,30);
        
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].imprimeHora();
        }
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].tick();
        }
        System.out.println("");
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].imprimeHora();
        }
        System.out.println("");
        
        for (int i = 0; i < arrayObjeto.length ; i++) {
            for (int j = 0; j < 60; j++) {
                arrayObjeto[i].tick();
            }
        }
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].imprimeHora();
        }
        System.out.println("");
        
        for (int i = 0; i < arrayObjeto.length ; i++) {
            for (int j = 0; j < 3600; j++) {
                arrayObjeto[i].tick();
            }
        }
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].imprimeHora();
        }
        System.out.println("");
        
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].tick(10);
        }
        
        for (int i = 0; i < arrayObjeto.length ; i++) {
            arrayObjeto[i].imprimeHora();
        }
        
    }
 }
