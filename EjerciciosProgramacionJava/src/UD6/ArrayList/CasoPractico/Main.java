package UD6.ArrayList.CasoPractico;

import java.util.Scanner;
  
public class Main {
    public static void menu() {
        System.out.println("====MENU AGENDA ====");
        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.print("¿Opción? ");
    } 
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agendaContactos = new Agenda();
        boolean salir = false;
        
        do {
            menu();
            int opcion = in.nextInt();
            switch(opcion){
                case 1:
                    agendaContactos.imprimirContactos();
                    System.out.println("");
                    break;
                case 2:
                    in.nextLine();
                    System.out.println("Dime nombre del Contacto");
                    String nombre = in.nextLine();
                    System.out.println("Dime correo del Contacto");
                    String correo = in.nextLine();
                    System.out.println("Dime telefono del Contacto");
                    String telf = in.nextLine();
                    agendaContactos.agregarContacto(nombre, correo, telf);
                    System.out.println("");
                    break;
                case 3:
                    in.nextLine();
                    agendaContactos.imprimirContactos();
                    agendaContactos.eliminarContactos();
                    System.out.println("");
                    break;
                case 4:
                    in.nextLine();
                    System.out.println("Dime nombre del Contacto");
                    nombre = in.nextLine();
                    agendaContactos.buscarContactoNombre(nombre);
                    System.out.println("");
                    break;
                case 5:
                    in.nextLine();
                    System.out.println("Dime telefono del Contacto");
                    telf = in.nextLine();
                    agendaContactos.buscarContactoTelefono(telf);
                    System.out.println("");
                    break;
                case 6:
                    in.nextLine();
                    System.out.println("Dime correo del Contacto");
                    correo = in.nextLine();
                    agendaContactos.buscarContactoCorreo(correo);
                    System.out.println("");
                    break;
                case 7:
                    in.nextLine();
                    System.out.println("Busqueda del Contacto");
                    correo = in.nextLine();
                    agendaContactos.busquedaGlobal(correo);
                    System.out.println("");
                    break;
                case 8:
                    salir = true;
                    break;
                    
            }
                
            
        } while (salir == false);
        
   
            
            
            
        }
               
    }
   
