

package UD6.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList();
        int valor;
        do {
            System.out.println("Introduce notas");
            valor = in.nextInt();
            if (valor >= 0 && valor <=10)
                enteros.add(valor);
        } while (valor != -1);
                        
        int cuantosAprobados=0;
        int cuantosSuspensos=0;
        boolean algunDiez = false;
        boolean algunCero = false;
        
        for (int i = 0; i < enteros.size(); i++) {
                      
            if (enteros.get(i)>= 5 ){
                cuantosAprobados++;
                if (enteros.get(i) == 10)
                    algunDiez = true;
            }
            else{
                cuantosSuspensos++;
                if ( enteros.get(i) == 0)
                    algunCero=true;
            }
        }
        
        System.out.println(enteros);
            System.out.println("Aprobados: " + cuantosAprobados);
            System.out.println("Suspensos: " + cuantosSuspensos);
            System.out.println("Algun Diez = " + algunDiez);
            System.out.println("Algun Cero = " + algunCero);
                    
    }
}
