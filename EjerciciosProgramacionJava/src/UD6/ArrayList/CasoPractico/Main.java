package UD6.ArrayList.CasoPractico;

import java.util.Scanner;




/*public static int menu() {

        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.print("¿Opción? ");
        
        int opcion = pedirIntEnRango(1, 8);

        return opcion;
    }

public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: No válido. Debe ser entre " + min + " y " + max);
                System.out.print("Vuelve a intentarlo: ");
            }
        } while (valor < min || valor > max);

        return valor;
    }

*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                
        Agenda agendaContactos = new Agenda();
        Contacto a = new Contacto("asda", "asdasd","asdas");
        
        
        
        agendaContactos.agregarContacto(a);
        agendaContactos.imprimirContactos();
        
        agendaContactos.eliminarContactos();
        agendaContactos.imprimirContactos();
        
        String buscar = in.nextLine();
        
        agendaContactos.buscarcontacto(buscar);
        
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
   
