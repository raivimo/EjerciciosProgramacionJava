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
        "AVD. FELIPE II", "CAJA DE COMUNIDAD", "CALLE VELÁZQUEZ", "CALLE SERRANO", "PARKING GRATUITO", "AVENIDA DE AMERICA", "SUERTE",
        "CALLE DE CEA BERMÚDEZ", "ESTACIÓN DEL MEDIODIA", "AVDA. DE LOS REYES CATÓLICOS", "CALLE BAILÉN", "COMPAÑÍA DISTRIBUCIÓN DE AGUAS",
        "PLAZA ESPAÑA", "VÉ A LA CÁRCEL", "PUERTA DEL SOL", "CALLE DE ALCALÁ", "CAJA DE COMUNIDAD", "GRAN VÍA", "ESTACIÓN DEL NORTE", "SUERTE",
        "PASEO DE LA CASTELLANA", "IMPUESTO DE LUJO", "PASEO DEL PRADO"};

    public static double[] precioCalles = {200, 60, 0, 60, 200, 200, 100, 0, 100, 120, 0, 140, 150, 140, 160, 200, 180, 0, 180, 200, 0, 220, 0, 220, 240,
        200, 260, 260, 150, 280, 0, 300, 300, 0, 320, 200, 0, 350, 100, 400};

    public static double[] precioAlquiler = new double[40];
    public static double[] precioCasas = new double[40];
    public static int[] libreOcomprada = new int[40];

    public static int numJugadores;

    public static String[] nombreJugador;
    public static double[] dineroJugador;
    public static int[] posicionJugador;
    public static int turnoJugador;

    public static int[] callesDelJugador = new int[40];

    public static int contador = 0;

    //*ESTA FUNCIÓN SE ENCARGARÁ DE MOSTAR EL MENÚ PRINCIPAL DEL JUEGO
    public static void menu() {
        System.out.println("---BIENVENIDO AL JUEGO DEL MONOPOLY----");
        System.out.println("-------POR RAIMON VILAR MORERA---------");
        System.out.println("LAS INSTRUCCIONES DEL JUEGO SON LAS SIGUIENTES:");
        System.out.println("SE TE ASIGNARÁ UNA CANTIDAD DE DINERO INICIAL (200€)");
        System.out.println("Y OBLIGATORIAMENTE HAS DE TIRAR LOS DADOS EN CADA TURNO.");
        System.out.println("SEGUN LA CASILLA QUE CAIGAS: SUERTE, CAJA DE AHORROS, CÁRCEL O CALLE");
        System.out.println("TENDRÁS OPCION DE COMPRAR O PASAR SIN COMPRAR. EN EL CASO DE QUE CAIGAS");
        System.out.println("EN UN CALLE COMPRADA POR OTRO JUGADOR, SE TE EXIGIRÁ EL ALQUILER.");
        System.out.println("UNA VEZ TENGAS UNA PROPIEDAD, PODRÁS EDIFICAR EN ELLA, HACIENDO QUE EL VALOR");
        System.out.println("DEL ALQUILER SEA MÁS CARO.");
        System.out.println("GANARÁ EL ÚLTIMO JUGADOR QUE NO HAYA QUEDADO EN BANCARROTA.");
        numJugadores();
    }

    //MENU DEL JUEGADOR DONDE LE DÁ A ALEGIR DIFERENTES OPCIONES DE JUEGO.    
    public static void menuJugador() {
        for (int i = contador; i < (contador + 1); i++) {
            System.out.println("ES EL TURNO DE: " + nombreJugador[i]);
            System.out.println("DINERO DISPONIBLE: " + dineroJugador[i] + " €");
            System.out.println("ESTAS EN LA CALLE: " + calles[posicionJugador[i]]);
            //System.out.println("TIENES EN PROPIEDAD LAS SIGUIENTES CALLES:");
            
        }
        
        System.out.println("1. TIRAR DADO");
        System.out.println("2. COMPRAR CALLE");
        System.out.println("3. COMPRAR CASA");
        System.out.println("4. FINALIZAR TURNO");

    }

    //ESTA FUNCIÓN SE ENCARGARA DE INICAR EL JUEGO PREGUNTANDO CUANTOS JUGADORES DESSEAN JUGAR Y SU NOMBRE
    public static int numJugadores() {
        Scanner in = new Scanner(System.in);
        System.out.println("¿CUANTOS JUGADORES SON?");
        numJugadores = in.nextInt();
        nombreJugador = new String[numJugadores];
        in.nextLine();
        if (numJugadores <= 4) {
            for (int i = 0; i < numJugadores; i++) {
                System.out.println("NOMBRE DEL JUGADOR " + (i + 1) + ":");
                nombreJugador[i] = in.nextLine();
            }
        } else {
            System.out.println("LO SIENTO. EL MAXIMO NUMERO DE JUGADORES ES 4.");
        }
        //UNA VEZ SABEMOS EL Nº DE JUGADORES, PODEMOS CREAR LOS ARRAYS CORRESPONDIENTES (LO HE INTENTADO EN EL MAIN, PERO NO FUNCIONABA)
        dineroJugador = new double[numJugadores];
        posicionJugador = new int[numJugadores];

        return numJugadores;
    }

    public static int turnoJugador(int contador) {
        if (contador <= numJugadores) {
            switch (numJugadores) {
                case 1:
                    contador++;
                    break;
                case 2:
                    contador++;
                    break;
                case 3:
                    contador++;
                    break;
                case 4:
                    contador++;
                    break;
            }
        }
        else
            contador=0;
        return contador;
        }

    //ESTA FUNCIÓN ASIGNA EL DINERO INICIAL DE LOS JUGADORES EN FUNCIÓN DE SU NUMERO.
    public static void dineroInicial() {
        for (int i = 0; i < numJugadores; i++) {
            dineroJugador[i] += 200;
        }
    }

    public static void realizarOperacion(int opcion) {
        Scanner in = new Scanner(System.in);
        opcion = in.nextInt();
        switch (opcion) {
            case 1:
                tirarDados();
                break;
            case 2:
                comprarCalle(libreOcomprada);
                break;
            case 4:
                opcion = 4;
                break;

        }
    }

    /*ESTA FUNCION SÉ ENCARGARÁ DE LANZAR LOS DADOS ALEATORIAMENTE
    COMPROBAR SI HAN SALIDO "DOBLES", Y EN EL CASO DE QUE HAYAN SALIDO DOBLES REPETIR.
    HASTA UN MÁXIMO DE 3 VECES.
     */
    public static void tirarDados() {
        int dado1, dado2, res;
        int cont = 0;
        do {
            dado1 = (int) (1 + Math.random() * 6);
            dado2 = (int) (1 + Math.random() * 6);
            res = dado1 + dado2;
            System.out.println("DADO 1: " + dado1 + " DADO 2: " + dado2 + " HAS SACADO UN: " + res);
            if (dado1 == dado2 && cont < 3) {
                System.out.println("HAS SACADO DOBLE. DEBES VOLVER A TIRAR.");
                cont++;
            }
        } while (dado1 == dado2 && cont < 3);
        if (cont == 3) {
            System.out.println("LO SIENTO. HAS SACADO TRES DOBLES SEGUIDOS. VAS A LA CARCEL.");
        }
        for (int i = turnoJugador; i < turnoJugador + 1; i++) {
            posicionJugador[turnoJugador] = res; 
        }
        
    }

    //ESTA FUNCIÓN LA USO PARA CALCULAR EL PRECIO DEL ALQUILER
    public static void generarAlquiler(double[] precioCalles) {
        for (int i = 0; i <= calles.length; i++) {
            precioAlquiler[i] = (precioCalles[i] * 0.22);
        }
    }

    //USO ESTA FUNCION PARA AVERIGUAR EL PRECIO DE LAS CASAS
    public static void precioCasas(double[] precioCalles) {
        for (int i = 0; i < calles.length; i++) {
            precioCasas[i] = ((int) (precioCalles[i] * 0.5));
        }
    }

    public static void libreOcomprada() {
        for (int i = 0; i < libreOcomprada.length; i++) {
            if (libreOcomprada[i] == 0) {
                System.out.println("ESTA CALLE ESTÁ LIBRE. PUEDES COMPRARLA.");
            } else {
                System.out.println("LO SIENTO, ESTA CALLE PERTENECE A OTRO JUGADOR.");
            }
        }
    }

    public static void comprarCalle(int[] libreOcomprada) {
        Scanner in = new Scanner(System.in);
        for (int i = posicionJugador[turnoJugador]; i < (posicionJugador[turnoJugador]) + 1 ; i++) {
            if (libreOcomprada[i] == 0) {
                System.out.println("EL PRECIO DE ESTA CALLE ES DE: " + precioCalles[i] + " €. PULSA 1 PARA COMPRAR.");
                if (dineroJugador[turnoJugador] >= precioCalles[i]) {
                    libreOcomprada[i] = in.nextInt();
                    dineroJugador[turnoJugador] -= precioCalles[i];
                    System.out.println("TE QUEDAN : " + dineroJugador[turnoJugador] + "€");
                }
                else 
                    System.out.println("LO SIENTO. NO TIENES SUFICIENTE DINERO PARA AFRONTAR EL PAGO DE ESTA PROPIEDAD");
                }
            else
                System.out.println("LO SIENTO. ESTA CALLE PERTENECE YA A OTRO JUGADOR");
        }
    }
   

    public static void main(String[] args) {
        int opcion = 0;
        menu();
        dineroInicial();
        generarAlquiler(precioCalles);
        precioCasas(precioCalles);
        //PONEMOS A "CERO" EL TABLERO PARA INDICAR QUE TODAS LAS PROPIEDADES ESTAN LISTAS PARA SU VENTA.
        for (int i = 0; i < libreOcomprada.length; i++) {
            libreOcomprada[i] = 0;
        }
        
        
        do {
            turnoJugador(contador);
            menuJugador();
            realizarOperacion(opcion);
           } while (opcion < 4);
        
        
        
        
        
        
    }
}
