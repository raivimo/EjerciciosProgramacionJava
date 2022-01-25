
package UD6.POO.Clase_CuentaCorriente;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CuentaCorriente arrayObjeto[] = new CuentaCorriente[5];
        boolean salir = false;
        double ingresar = 0;
        double retirar = 0;
        int numCuenta = 0;
        arrayObjeto[0] = new CuentaCorriente(1,500);
        arrayObjeto[1] = new CuentaCorriente(2,300);
        arrayObjeto[2] = new CuentaCorriente(3,700);
        arrayObjeto[3] = new CuentaCorriente(4,200);
        arrayObjeto[4] = new CuentaCorriente(5, 150);
    
        
        do {
            CuentaCorriente.menu();
            int opcion = in.nextInt();
            switch(opcion){
                case 1:
                    for (int i = 0; i < arrayObjeto.length ; i++) {
                        arrayObjeto[i].imprimir();
                    }
                    break;
                case 2:
                    System.out.println("Indique el numero de cuenta en la que quiera realizar el ingreso.");
                    numCuenta=in.nextInt();
                    for (int i = 0; i < arrayObjeto.length; i++) {
                        if (arrayObjeto[i].getNumeroCuenta() == numCuenta) {
                            System.out.println("Indique cantidad que desee ingresar.");
                            arrayObjeto[i].ingresar(ingresar = in.nextDouble());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Indique el numero de cuenta de la que quiera retirar");
                    numCuenta = in.nextInt();
                    for (int i = 0; i < arrayObjeto.length; i++) {
                        if (arrayObjeto[i].getNumeroCuenta() == numCuenta) {
                            System.out.println("Indique la cantidad");
                            arrayObjeto[i].retirar(retirar = in.nextDouble());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Indique el numero de cuenta ORIGEN");
                    numCuenta = in.nextInt();
                    for (int i = 0; i < arrayObjeto.length; i++) {
                        if(arrayObjeto[i].getNumeroCuenta() == numCuenta){
                            System.out.println("Indique la cantidad que quiere transferir");
                            arrayObjeto[i].retirar(retirar = in.nextDouble());
                        }
                    }
                    System.out.println("Indique el numero de cuenta DESTINO");
                    numCuenta=in.nextInt();
                    for (int i = 0; i < arrayObjeto.length; i++) {
                        if (arrayObjeto[i].getNumeroCuenta() == numCuenta) {
                            arrayObjeto[i].ingresar(retirar);
                        }
                    }
                    break;

                case 5:
                    salir = true;
                    break;
            }
        } while (!salir);
            
    }
}

