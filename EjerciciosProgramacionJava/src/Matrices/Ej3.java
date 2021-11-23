
import java.util.Scanner;


public class Ej3 {

    public static void main(String[] args) {

        // Variables
        int[][] numeros;
        int n, m;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos N y M (tamaño de la matriz)
        System.out.print("Dime N: ");
        n = in.nextInt();
        System.out.print("Dime M: ");
        m = in.nextInt();
        
        // Creamos la matriz
        numeros = new int[n][m];
        
        // Pedimos los valores de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Dime valor [" + i + "][" + j + "]:");
                numeros[i][j] = in.nextInt();
            }
        }

        // Mostramos la matriz
        for (int i = 0; i < n; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < m; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
