/*
 * Proyecto EjerciciosProgramacionJava - Archivo RETO_CIFRADO_BASICO.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */
package Vectores;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 24 mar. 2022 18:38:15
 */
public class RETO_CIFRADO_BASICO {

    public static void main(String[] args) {
        try {
            File f = new File("Documentos/carta_cifrada.txt");
            Scanner in = new Scanner(f);
            String lineas;
            String[] trozos;
            char[] original;

            while (in.hasNextLine()) {
                lineas = in.nextLine();
                original = lineas.toCharArray();
                for (int i = 0; i < original.length; i++) {
                    switch (original[i]) {
                        case 'A':
                            original[i] = 'N';
                            break;
                        case 'B':
                            original[i] = 'O';
                            break;
                        case 'C':
                            original[i] = 'P';
                            break;
                        case 'D':
                            original[i] = 'Q';
                            break;
                        case 'E':
                            original[i] = 'R';
                            break;
                        case 'F':
                            original[i] = 'S';
                            break;
                        case 'G':
                            original[i] = 'T';
                            break;
                        case 'H':
                            original[i] = 'U';
                            break;
                        case 'I':
                            original[i] = 'V';
                            break;
                        case 'J':
                            original[i] = 'W';
                            break;
                        case 'K':
                            original[i] = 'X';
                            break;
                        case 'L':
                            original[i] = 'Y';
                            break;
                        case 'M':
                            original[i] = 'Z';
                            break;
                        case 'N':
                            original[i] = 'A';
                            break;
                        case 'O':
                            original[i] = 'B';
                            break;
                        case 'P':
                            original[i] = 'C';
                            break;
                        case 'Q':
                            original[i] = 'D';
                            break;
                        case 'R':
                            original[i] = 'E';
                            break;
                        case 'S':
                            original[i] = 'F';
                            break;
                        case 'T':
                            original[i] = 'G';
                            break;
                        case 'U':
                            original[i] = 'H';
                            break;
                        case 'V':
                            original[i] = 'I';
                            break;
                        case 'W':
                            original[i] = 'J';
                            break;
                        case 'X':
                            original[i] = 'K';
                            break;
                        case 'Y':
                            original[i] = 'L';
                            break;
                        case 'Z':
                            original[i] = 'M';
                            break;
                    }
                }
                for (int i = 0; i < original.length; i++) {
                    System.out.print(original[i]);
                }
            }
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }

    }
}
