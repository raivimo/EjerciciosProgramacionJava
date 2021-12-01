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
    public static String calles[] = {"SALIDA", "RONDA DE VALENCIA", "CAJA DE COMUNIDAD", "PLAZA LAVAPIES", "IMPUESTO SOBRE EL CAPITAL", 
        "ESTACIÓN DE GOYA", "GLORIETA CUATRO CAMINOS", "SUERTE", "AVENIDA DE REINA VICTORIA", "CALLE BRAVO MURILLO", "CARCEL/VISITAS",
        "GLORIETA DE BILBAO", "COMPAÑIA DE ELECTRICIDAD", "CALLE ALBERTO AGUILERA", "CALLE FUENCARRAL", "ESTACIÓN DE LAS DELICIAS",
        "AVD. FELIPE II", "CAJA DE COMUNIDAD", "CALLE VELÁZQUEZ", "CALLE SERRANO","PARKING GRATUITO", "AVENIDA DE AMERICA", "SUERTE",
        "CALLE DE CEA BERMÚDEZ", "ESTACIÓN DEL MEDIODIA", "AVDA. DE LOS REYES CATÓLICOS", "CALLE BAILÉN", "COMPAÑÍA DISTRIBUCIÓN DE AGUAS",
        "PLAZA ESPAÑA", "VÉ A LA CÁRCEL", "PUERTA DEL SOL", "CALLE DE ALCALÁ", "CAJA DE COMUNIDAD", "GRAN VÍA", "ESTACIÓN DEL NORTE", "SUERTE",
        "PASEO DE LA CASTELLANA", "IMPUESTO DE LUJO", "PASEO DEL PRADO"};
    
    public static int[] precioCalles = {200,60,0,60,200,200,100,0,100,120,0,140,150,140,160,200,180,0,180,200,0,220,0,220,240,
        200,260,260,150,280,0,300,300,0,320,200,0,350,100,400};
    
    public static double[] precioAlquiler= new double[40];
    public static int[] precioCasas= new int[40];
    
    
    //*ESTA FUNCIÓN SE ENCARGARÁ DE MOSTAR EL MENÚ PRINCIPAL DEL JUEGO
    public static void menu(){
        System.out.println("---BIENVENIDO AL JUEGO DEL MONOPOLY----");
        System.out.println("-------POR RAIMON VILAR MORERA---------");
        System.out.println("LAS INSTRUCCIONES DE JUEGO SON LAS SIGUIENTES:");
        System.out.println("SE TE ASIGNARÁ UNA CANTIDAD DE DINERO INICIAL (200€)");
        System.out.println("Y OBLIGATORIAMENTE HAS DE TIRAR LOS DADOS EN CADA TURNO");
        System.out.println("SEGUN LA CASILLA QUE CAIGAS: SUERTE, CAJA DE AHORROS, CÁRCEL O CALLE");
        System.out.println("TENDRÁS OPCION DE COMPRAR O PASAR SIN COMPRAR. EN EL CASO DE QUE CAIGAS");
        System.out.println("EN UN CALLE COMPRADA POR OTRO JUGADOR, SE TE EXIGIRÁ EL ALQUILER.");
        System.out.println("UNA VEZ TENGAS UNA PROPIEDAD, PODRÁS EDIFICAR EN ELLA, HACIENDO QUE EL VALOR");
        System.out.println("DE ALQUILER SEA MAS CARO.");    
        System.out.println("GANARÁ EL ÚLTIMO JUGADOR QUE NO HAYA QUEDADO EN BANCARROTA.");
    }
    
    //MENU DEL JUEGADOR DONDE LE DÁ A ALEGIR DIFERENTES OPCIONES DE JUEGO.    
    public static void menuJugador(){
        System.out.println("1. VER CANTIDAD DE DINERO DISPONIBLE");
        System.out.println("2. COMPRAR CALLE");
        System.out.println("3. COMPRAR CASAS");
        System.out.println("4. PASAR SIN COMPRAR");
        System.out.println("5. TIRAR DADOS");
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
            System.out.println("LO SIENTO. HAS SACADO TRES DOBLES SEGUIDOS. VAS A LA CARCEL.");
    }   
    
    //ESTA FUNCIÓN SE ENCARGARA DE INICAR EL JUEGO PREGUNTANDO CUANTOS JUGADORES DESSEAN JUGAR.
    public static void numJugadores(){
        Scanner in = new Scanner(System.in);
        int jugadores;
        do{
        System.out.println("¿CUANTOS JUGADORES SON?");
        jugadores = in.nextInt();
        if (jugadores>4)
            System.out.println("LO SIENTO. EL NUMERO MÁXIMO DE JUGADORES POSIBLES ES 4.");
        } while(jugadores>4);
    }
    
    //ESTA FUNCIÓN LA USO PARA CALCULAR EL PRECIO DEL ALQUILER
    public static void precioAlquiler(int[] precioCalles){
        for (int i = 0; i <= calles.length ; i++) {
            precioAlquiler[i]=(precioCalles[i]*0.22);
        }
    }
    
    //USO ESTA FUNCION PARA AVERIGUAR EL PRECIO DE LAS CASAS
    public static void precioCasas(int[] precioCalles){
        for (int i = 0; i < calles.length; i++) {
            precioCasas[i]=((int)(precioCalles[i]*0.5));
        }
    }
    
    public static void libreOcomprada(){
        int[]libreOcomprada = new int[40];
        for (int i = 0; i < libreOcomprada.length; i++) {
            if (libreOcomprada[i] == 0)
                System.out.println("ESTA CALLE ESTÁ LIBRE. PUEDES COMPRARLA.");
            else
                System.out.println("LO SIENTO, ESTA CALLE PERTENECE A OTRO JUGADOR.");
            }
        }
    
    public static void comprarCalle(){
        Scanner in = new Scanner(System.in);
        
    }
    
    
    public static void main(String[] args) {
        for (int i = 0; i < calles.length; i++) {
            System.out.println(calles[i] + "     " + precioCalles[i] + " €");      
            }
        precioAlquiler(precioCalles);
    
            
        }
    }   
    
    

