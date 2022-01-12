/*
 * Proyecto EjerciciosProgramacionJava - Archivo Punto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaPunto;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:00:59
 */
public class Punto {
    private int x = 0;
    private int y = 0;
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //GETTERS
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    //SETTERS
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    
    public void imprimir(){
        System.out.println("COORDENADAS PUNTO " + "("+x +", " + y +")");
    }
    
}
