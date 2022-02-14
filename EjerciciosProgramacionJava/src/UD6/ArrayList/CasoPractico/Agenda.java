

package UD6.ArrayList.CasoPractico;

import java.util.Scanner;
import java.util.ArrayList;


public class Agenda {
    private ArrayList <Contacto> arrayListObjeto;
            
    //CONSTRUCTOR
    public Agenda() {
        arrayListObjeto = new ArrayList();
    }
    
    //METODOS UTILES
    public void agregarContacto(String nombre, String correo, String telf){
        arrayListObjeto.add(new Contacto(nombre, correo, telf));
    }
    
    public void imprimirContactos(){
        if (arrayListObjeto.isEmpty())
            System.out.println("Lista de Contactos vacia, añada contactos");
        else{
            for (int i = 0; i < arrayListObjeto.size() ; i++) {
                System.out.print(i + " . ");
                arrayListObjeto.get(i).imprimir();
            }
        }
    }

    public void eliminarContactos(){
        Scanner in = new Scanner(System.in);
        int borrar=0;
        System.out.println("Introduzca posicion del contacto a borrar");
        borrar = in.nextInt();
        if (borrar >= 0 && borrar < arrayListObjeto.size() ){ 
            arrayListObjeto.remove(borrar);
            System.out.println("Contacto " + borrar + " borrado.");
        }
        else
            System.out.println("Contacto no encontrado.");
    }
    
    public void buscarContactoNombre(String nombre) {
        int cont = 0;
        if (arrayListObjeto.isEmpty() == false) {
            for (int i = 0; i < arrayListObjeto.size(); i++) {
                if (arrayListObjeto.get(i).getNombre().toUpperCase().contains(nombre.toUpperCase())) {
                    arrayListObjeto.get(i).imprimir();
                    cont++;
                }
            }
            if (cont == 0) {
                System.err.println("CONTACTO NO ENCONTRADO.");
            }
        } else {
            System.out.println("NO HAY CONTACTOS.");
        }
    }
   
    public void buscarContactoTelefono(String telefono) {
        int cont = 0;
        if (arrayListObjeto.isEmpty() == false) {
            for (int i = 0; i < arrayListObjeto.size(); i++) {
                if (arrayListObjeto.get(i).getTelf().toUpperCase().contains(telefono.toUpperCase())) {
                    arrayListObjeto.get(i).imprimir();
                    cont++;
                }
            }
            if (cont == 0) {
                System.err.println("CONTACTO NO ENCONTRADO.");
            }
        } else {
            System.err.println("NO HAY CONTACTOS.");
        }
    }
   
    public void buscarContactoCorreo(String correo) {
        int cont = 0;
        if (arrayListObjeto.isEmpty() == false) {
            for (int i = 0; i < arrayListObjeto.size(); i++) {
                if (arrayListObjeto.get(i).getCorreo().toUpperCase().contains(correo.toUpperCase())) {
                    arrayListObjeto.get(i).imprimir();
                    cont++;
                }
            }
            if (cont == 0) {
                System.err.println("CONTACTO NO ENCONTRADO.");
            }
        } else {
            System.err.println("NO HAY CONTACTOS.");
        }
    }
   
    public void busquedaGlobal(String busqueda) {
        int cont = 0;
        if (arrayListObjeto.isEmpty() == false) {
            for (int i = 0; i < arrayListObjeto.size(); i++) {
                if (arrayListObjeto.get(i).getCorreo().toUpperCase().contains(busqueda.toUpperCase())
                        ||arrayListObjeto.get(i).getNombre().toUpperCase().contains(busqueda.toUpperCase())
                        ||arrayListObjeto.get(i).getTelf().toUpperCase().contains(busqueda.toUpperCase())) {
                   
                    arrayListObjeto.get(i).imprimir();
                    cont++;
                }
            }
            if (cont == 0) {
                System.err.println("CONTACTO NO ENCONTRADO.");
            }
        } else {
            System.err.println("NO HAY CONTACTOS.");
        }

    }
}

   

