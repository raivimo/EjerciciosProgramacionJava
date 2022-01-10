/*
 * Proyecto EjerciciosProgramacionJava - Archivo d.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Reto;

import java.util.Scanner;

public class d{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        int tamNiv;
        int []posNivel;
        
        int numConsultas;
        
        int i,j,k;

        while(true){
             //  leemos cuantos niveles y preparamos array
            tamNiv=sc.nextInt();
            posNivel=new int[tamNiv];

            // Caso de que acaban los juegos de prueba
            if(tamNiv==0){
                return;
            }
            
            //Leemos primer nivel e indicamos donde acaba
            posNivel[0]=sc.nextInt();

            // Leemos los niveles

            for (i=1;i<tamNiv;i++){
                
                //Leemos segundo nivel y sumamos donde acaba el anterior para saber donde acaba este
                posNivel[i]=posNivel[i-1]+sc.nextInt();       
                
            }    
            // Al acabar el bucle, si hemos leido 5 10 5 por ejemplo, tenemos 5, 15, 20


            //leemos cuantas consultas hay
            numConsultas=sc.nextInt();

            for(i=0;i<numConsultas;i++)
            {
                int a,b,posA,posB;
                a=sc.nextInt();
                // Resto uno a "a" para corregir posicion (nivel 1 es posicion 0 en array)
                a=a-1;

                b=sc.nextInt();
                // Resto dos  a "b" para corregir posicion 
                // El primero es para posicion array (nivel 1 es posicion 0 en array)
                // Y el segundo, es porque quiero "posicion de inicio", que realmente es posicion de final del nivel anterior
                b=b-2;

                //Calculo valor de posA
                posA=posNivel[a];

                if(b>=0){
                    posB=posNivel[b];
                }
                else{
                    // Si la resta ha dado menos 1 por peedir nivel 1, el inicio es 0
                    posB=0;
                }
                System.out.println(posB-posA);

            }
            // Esto lo pide el enunciado tras cada caso de prueba
            System.out.println("---");
        }

    }
}