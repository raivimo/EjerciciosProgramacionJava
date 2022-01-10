/*
 * Proyecto EjerciciosProgramacionJava - Archivo laPulga.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Reto;

import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 20 dic. 2021 18:26:56
 */
public class laPulga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int casos=0;
        int n,f,t;
        casos = in.nextInt();
        
        for (int i = 0; i < casos; i++) {
            n = in.nextInt();
            f = in.nextInt();
            t = in.nextInt();
            
            if (n <= t){
                int sol= f * t;
                System.out.println(sol);
            }
            else if (t > n){
                int sol1 = (t % (n + 1)) * f;
            System.out.println(sol1);
            }
        }
        
  
        
        
        
        
      
        
        
    }
}
