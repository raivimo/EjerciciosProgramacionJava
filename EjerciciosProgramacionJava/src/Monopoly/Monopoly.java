/*
 * Proyecto EjerciciosProgramacionJava - Archivo Monopoly.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Monopoly;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 29 nov. 2021 19:11:58
 */
public class Monopoly {
    public static void menu(){
        System.out.println("---BIENVENIDO AL JUEGO DEL MONOPOLY----");
        System.out.println("-------POR RAIMON VILAR MORERA---------");
        System.out.println("LAS INSTRUCCIONES DE JUEGO SON LAS SIGUIENTES:");
    }
    
    /*ESTA FUNCION SÉ ENCARGARÁ DE LANZAR LOS DADOS ALEATORIAMENTE
    COMPROBAR SI HAN SALIDO "DOBLES", Y EN EL CASO DE QUE HAYAN SALIDO DOBLES REPETIR.
    HASTA UN MÁXIMO DE 3 VECES.
    */
    public static void tirardados(){
    
      int dado1, dado2, res;
        int cont = 0;
        do {
           
            dado1 = (int)(1+Math.random()*6);
            dado2 = (int)(1+Math.random()*6);
            res = dado1+dado2;
            System.out.println("DADO 1: " + dado1 + " DADO 2: " +dado2 + " HAS SACADO UN: " + res);
            if(dado1==dado2  && cont < 3){
                System.out.println("HAS SACADO DOBLE. DEBES VOLVER A TIRAR.");
                cont++;
            }
        
              
                
        } while (dado1 == dado2 && cont < 3);
        if(cont==3)
            System.out.println("LO SIENTO. VAS A LA CARCEL.");
    }   
    
    public static void numJugadores(){
        /*ESTA FUNCIÓN SE ENCARGARA DE INICAR EL JUEGO PREGUNTANDO CUANTOS JUGADORES
        DESSEAN JUGAR.
        */
        Scanner in = new Scanner(System.in);
        int jugadores;
        do{
        System.out.println("¿CUANTOS JUGADORES SON?");
        jugadores = in.nextInt();
        if (jugadores>4)
            System.out.println("LO SIENTO. EL NUMERO MÁXIMO DE JUGADORES POSIBLES ES 4.");
        } while(jugadores>4);
    }

    
    
    public static void main(String[] args) {
        tirardados();
        
    }   
    
}
