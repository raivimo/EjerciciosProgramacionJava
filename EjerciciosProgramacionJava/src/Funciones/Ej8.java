/*
 * Proyecto EjerciciosProgramacionJava - Archivo Ej8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Funciones;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 nov. 2021 19:17:49
 */
public class Ej8 {
    
    public static int suma1aN(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int producto1aN(int n){
        int producto=1;
        for (int i = 1; i <= n; i++) {
            producto*=i;
            }
        return producto;
    }
    public static int intermedio1aN(int n){
        return (n/2);
            
        }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIME UN NUMERO N");
        int n = in.nextInt();
        System.out.println("EL SUMATORIO ES: " + (suma1aN(n)));
        System.out.println("EL PRODUCTORIO ES: " + (producto1aN(n)));
        System.out.println("EL VALOR INTERMEDIO ES: " + intermedio1aN(n));
        
        
    }
}
