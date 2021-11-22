/*
 * Proyecto V3_Ejercicios_Condicionales - Archivo Ej9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package Bucles_Beta;
import java.util.Scanner;


/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:32:19
 */
public class Ej9 {
    public static void main(String[] args) {
        int dado = 0, cara1=0, cara2=0, cara3=0, cara4=0, cara5=0, cara6=0;
        for (int i = 1; i <= 100; i++) {
            dado=(int)(Math.random()*6+1);

            switch(dado){
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;    
                    break;
            }          
        }
        
        System.out.println("La cara 1 ha salido estas veces "+cara1);
        System.out.println("La cara 2 ha salido estas veces "+cara2);
        System.out.println("La cara 3 ha salido estas veces "+cara3);
        System.out.println("La cara 4 ha salido estas veces "+cara4);
        System.out.println("La cara 5 ha salido estas veces "+cara5);
        System.out.println("La cara 6 ha salido estas veces "+cara6);
        
    }
}
