

package UD6.CasoPractico.CasoPractico0;

import java.util.Scanner;


public class Agenda {
    private int cuantos=0;
    private Contacto arrayObjeto[];
    
    public int getCuantos(){
        return cuantos;
    }
    
    //CONSTRUCTOR
    public Agenda() {
        arrayObjeto = new Contacto [100];
    }
    
    //METODOS UTILES
    public void agregarContacto(Contacto a){
        if(cuantos>100)
            System.out.println("Lo siento, agenda llena");
        else{
            arrayObjeto[cuantos]=a;
            cuantos++;
        }
        
    }
    
    public void imprimirContactos(){
        for (int i = 0; i < cuantos; i++) {
            arrayObjeto[i].imprimir();
        }
    }

    public void eliminarContactos(){
        Scanner in = new Scanner(System.in);
        int borrar=0;
        System.out.println("Introduzca posicion del contacto a borrar");
        borrar = in.nextInt();
        if (borrar >= 0 && borrar < cuantos) {
            for (int i = borrar + 1 ; i < cuantos; i++) {
                arrayObjeto[i - 1] = arrayObjeto[i];
            }
        }
    }
    
    public int [] buscarcontacto(String nombre){
        Scanner in = new Scanner(System.in);
        int[] cuantos2 = new int [100];
        for (int i = 0; i < cuantos; i++) {
            if(arrayObjeto[i].getNombre().equalsIgnoreCase(nombre) ){
                arrayObjeto[i].imprimir();
            }
        }
        return cuantos2;
    }
    
    
    
    
    
}
