/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasosPracticos;
import java.util.Scanner;

/**
 *
 * @author raimo
 */
public class Contactos {
    public static int cuantos = 0;
    public static int max = 100;
    public static String[]nombre = new String[max];
    public static String[]correo = new String[max];
    public static int[]telefono = new int [max];
    public static boolean salir = false;
    
    public static void menu(){
        System.out.println("--MENU CONTACTOS--");
        System.out.println("1. VER CONTACTOS.");
        System.out.println("2. AGREGAR CONTACTO.");
        System.out.println("3. EIMINTAR CONTACTO.");
        System.out.println("4. BUSCAR POR NOMBRE.");
        System.out.println("5. BUSCAR POR TELEFONO.");
        System.out.println("6. BUSCAR POR CORREO.");
        System.out.println("7. BUSQUEDA GLOBAL.");
        System.out.println("8. SALIR.");
    }
    public static void elegirOpcion(int opcion){
        Scanner in = new Scanner(System.in);
        System.out.println("ELIGE UNA OPCION");
        opcion = in.nextInt();
        switch(opcion){
            case 1:
                verContactos();
                break;
            case 2:
                agregarContacto();
                break;
            case 3:
                borrarContacto();
                break;
            case 4:
                buscarNombre();
                break;
            case 5:
                buscarTelefono();
                break;
            case 6:
                buscarCorreo();
                break;
            case 8:
                salir = true;
                break;
        }
    }
    public static void verContactos(){
        if (cuantos == 0){
            System.out.println("NO HAY CONTACTOS.");
            System.out.println("");
            }
        for (int i = 0; i < cuantos; i++) {
            System.out.println((i+1) + ". Nombre: " + nombre[i] + "   Telf: " + telefono[i] + "   Mail: " + correo[i]);
        }
    }
    public static void agregarContacto(){
        Scanner in = new Scanner(System.in);
        if (cuantos <= max){
            System.out.println("NOMBRE DEL CONTACTO");
            for (int i = cuantos; i <= cuantos ; i++) {
                nombre[i]=in.nextLine();              
                }
            
            System.out.println("NUMERO DE TELEFONO");
            for (int i = cuantos; i <= cuantos; i++) {
                telefono[i]=in.nextInt();
                }
            
            System.out.println("DIRECCION DE CORREO ELECTRÓNICO");
            for (int i = cuantos; i <= cuantos; i++) {
                in.nextLine();
                correo[i]=in.nextLine();
                }
            cuantos++;
        }
        else
            System.out.println("LISTA DE CONTACTOS LLENA. BORRE UNO.");
    }
    public static void borrarContacto(){
        Scanner in = new Scanner(System.in);
        int borrar = 0;
        System.out.println("INTRODUCA EL NUMERO DE CONTACTO QUE DESEA BORRAR");
        borrar = in.nextInt();
        if (borrar >= 0 && borrar < cuantos) {
            for (int i = borrar + 1 ; i < cuantos ; i++) {
                nombre[i-1]=nombre[i];
                telefono[i-1]=telefono[i];
                correo[i-1]=correo[i];
                }
            cuantos--;
            System.out.println("CONTACTO " + borrar + " BORRADO");
        }
        else
            System.out.println("LO SIENTO, EL CONTACTO NO EXISTE");
    }
    public static void buscarNombre(){
        Scanner in = new Scanner(System.in);
        System.out.println("INTRODUCA EL NOMBRE A BUSCAR");
        String buscar = in.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < cuantos ; i++) {
            if (nombre[i].indexOf(buscar) != -1 ) {
                System.out.println(i + ". Nombre: " + nombre[i] + "    Telf: " + telefono[i] + "   Correo: " + correo[i]);
                encontrado = true;
                }
            }
        if (!encontrado)
            System.out.println("LO SIENTO. EL CONTACTO NO EXISTE.");
        }
    public static void buscarTelefono(){
        Scanner in = new Scanner(System.in);
        System.out.println("INTRODUCA EL TELEFONO A BUSCAR");
        int buscar = in.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < cuantos; i++) {
            if (telefono[i]==buscar) {
                System.out.println(i + ". Nombre: " + nombre[i] + "    Telf: " + telefono[i] + "   Correo: " + correo[i]);
                encontrado = true;
                }
            }
        if(!encontrado)
            System.out.println("LO SIENTO. EL TELEFONO NO EXISTE.");
    }
    public static void buscarCorreo(){
        Scanner in = new Scanner(System.in);
        System.out.println("INTRODUCE EL CORREO QUE QUIERES BUSCAR");
        String buscar = in.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < cuantos; i++) {
            if ((correo[i].indexOf(buscar)) != -1) {
                System.out.println(i + ". Nombre: " + nombre[i] + "    Telf: " + telefono[i] + "   Correo: " + correo[i]);
                encontrado = true;
                }
            }
        if(!encontrado)
            System.out.println("LO SIENTO. EL CORREO NO EXISTE.");
    }

    public static void main(String[] args) {
        int opcion = 0;
        do {
            menu();
            elegirOpcion(opcion);
        } while (salir == false);

    }
}
