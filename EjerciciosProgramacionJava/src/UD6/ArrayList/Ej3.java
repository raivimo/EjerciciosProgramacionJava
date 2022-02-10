

package UD6.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> listaPrecios = new ArrayList();
        double precio = 0;
        do {
            System.out.println("Dime un precio");
            precio = in.nextDouble();
            if(precio>=0)
                listaPrecios.add(precio);
            
        } while (precio >= 0);
        
        System.out.println(listaPrecios);
        System.out.println("");
        System.out.println("/////////////");
        System.out.println("");
        
        ArrayList<Double> listaBaratos = new ArrayList();
        ArrayList<Double> listaCaros = new ArrayList();
        
        for (int i = 0; i < listaPrecios.size(); i++) {
            if(listaPrecios.get(i) < 100)
                listaBaratos.add(listaPrecios.get(i));
        }
                
        for (int i = 0; i < listaPrecios.size(); i++){
                if( listaPrecios.get(i) >= 100 )
                    listaCaros.add(listaPrecios.get(i));
            }
        
        System.out.println(listaPrecios.size());
        
        /*for (int i = 0; i < listaPrecios.size() ; i++) {
            listaPrecios.remove(0);
        }*/
        
        for (int i = listaPrecios.size()-1; i >= 0 ; i--) {
            listaPrecios.remove(i);
        }
        
        
        
        System.out.println(listaPrecios);
        System.out.println(listaBaratos);
        System.out.println(listaCaros);
         
        
        
        
        
        
        
        
        
    }
}
