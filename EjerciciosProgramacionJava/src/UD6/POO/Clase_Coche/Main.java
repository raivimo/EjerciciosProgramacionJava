
package UD6.POO.Clase_Coche;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Coche uno = new Coche("Ford Mondelo", "Azul", true, tipo.DEPORTIVO, "3485-HWN", 2003, seguro.TERCEROS);        
        Coche dos = new Coche("Ford Fiesta", "Rojo", false, tipo.UTILITARIO, "3325-LWN", 2003, seguro.TODO_RIESGO);   
        Coche tres = new Coche("Ford Kuga", "Negro", true, tipo.FAMILIAR, "4323-KSL", 2003, seguro.TERCEROS);   
        
        Coche arrayObjeto[] = new Coche [2];
        
        for (int i = 0; i < arrayObjeto.length; i++) {
            System.out.println("Escribe modelo");
            String modelo = in.nextLine();
            
            System.out.println("Escribe color");
            String color = in.nextLine();
            
            System.out.println("Pintura metalizada: true o false");
            boolean metalizada = in.nextBoolean();
            
            System.out.println("TIPO COCHE (1. Mini, 2. Familiar, 3. Utilitario, 4. Deportivo)");
            int tipoC = in.nextInt();
            tipo tc = null;
            switch(tipoC){
                case 1:
                    tc = tipo.MINI;
                    break;
                case 2:
                    tc = tipo.FAMILIAR;
                    break;
                case 3:
                    tc = tipo.UTILITARIO;
                    break;
                case 4:
                    tc = tipo.FAMILIAR;
                    break;
            }
            in.nextLine();
            System.out.println("Escribe matricula");
            String matricula = in.nextLine();
            
            System.out.println("Escribe año fabricacion");
            int año = in.nextInt();
            
            System.out.println("Seguro: 1. Todo Riesgo, 2. Terceros");
            int seguroC = in.nextInt();
            seguro ts = null;
            switch(seguroC){
                case 1:
                    ts = seguro.TODO_RIESGO;
                    break;
                case 2:
                    ts = seguro.TERCEROS;
                    break;
            }
            in.nextLine();
            arrayObjeto[i] = new Coche (modelo, color, metalizada,  tc, matricula, año, ts);
        }
            
        
        
        for (int i = 0; i < arrayObjeto.length; i++) {
            arrayObjeto[i].imprimir();
        }
        
        int cuantos=0;
        for (int i = 0; i < arrayObjeto.length; i++) {
            if (arrayObjeto[i].getMetalizada()) 
                cuantos++;
        }
        
         for (int i = 0; i < arrayObjeto.length; i++) {
            if (arrayObjeto[i].getAño()<2000) 
                cuantos++;
        }
  
        
      
        }
    }

