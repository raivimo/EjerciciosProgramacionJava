
package UD6.ArrayList;

import java.util.ArrayList;


public class Ej1 {
    public static void main(String[] args) {
        ArrayList<String> listacolores = new ArrayList();
        listacolores.add("Rojo");
        listacolores.add("Azul");
        listacolores.add("Verde");
        listacolores.add("Naranja");
        listacolores.add("Blanco");
        
        for (int i = 0; i < listacolores.size(); i++) {
            System.out.println(listacolores.get(i));
        }
        
        listacolores.add("Negro");
        listacolores.add("Cyan");
        listacolores.add(1,"Amarillo");
        listacolores.add(2,"Magenta");
        listacolores.remove(3);
        listacolores.remove(4);
        System.out.println("===========================");
        for (int i = 0; i < listacolores.size(); i++) {
            System.out.println(listacolores.get(i));
        }
        
        
        
    }
}
