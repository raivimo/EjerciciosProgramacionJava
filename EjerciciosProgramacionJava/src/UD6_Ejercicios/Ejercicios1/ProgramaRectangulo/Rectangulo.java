/*
 * Proyecto EjerciciosProgramacionJava - Archivo Rectangulo.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * http://creativecommnos.org/licenses/by-nc-sa/4.0/
 */

package UD6_Ejercicios.Ejercicios1.ProgramaRectangulo;

/**
 *
 * @author Raimon Vilar Morera <raimonv@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:26:40
 */
public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Rectangulo(int x1, int y1, int x2, int y2){
        if (x2>x1 && y2>y1){
            this.x2=x2;
            this.x1=x1;
            this.y2=y2;
            this.y1=y1;
        }
        else
            System.out.println("Lo siento, las coordenadas no son correctas.");
    }
    
    //GETTERS
    public int getX1(){
        return x1;
    }
    
    public int getY1(){
        return y1;
    }
    
    public int getX2(){
        return x2;
    }
    
    public int getY2(){
        return y2;
    }
   //SETTERS
    
    public void setX1(int x1){
        if (x1<x2)
            this.x1=x1;
        else
            System.out.println("Lo siento, la coordenada no es valida");
    }
    
    public void setX2(int x2){
        if(x2>x1)
            this.x2=x2;
        else
            System.out.println("Lo siento, la coordenada no es valida");
    }
    
    public void setY1(int y1){
        if(y1<y2)
            this.y1=y1;
        else
            System.out.println("Lo siento, la coordenada no es valida");
    }
 
    public void setY2(int y2){
        if(y2>y1)
            this.y2=y2;
        else
            System.out.println("Lo siento, la coordenada no es valida");
    }
    
    public void setX1Y1 (int x1, int y1){
        setX1(x1);
        setY1(y1);
    }
    
    public void setX2Y2 (int x2, int y2){
        setX2(x2);
        setY2(y2);
    }
    
    public void setAll (int x1, int y1, int x2, int y2){
        setX1Y1(x1, y1);
        setX2Y2(x2, y2);
    }
    
    
    
    //METODOS UTILES
    public void imprimir(){
        System.out.println("(" + x1 +", " + y1 +")    " + "(" + x2 +", " +y2 + ")");
    }
    
    public int perimetro(){
        int ancho = Math.abs((x2-x1));
        int alto  = Math.abs((y2-y1));
        int perimetro = 2 * (ancho + alto);
        return perimetro;
    }    
    
    public int area(){
        int ancho = Math.abs((x2-x1));
        int alto  = Math.abs((y2-y1));
        int area = ancho * alto;
        return area;
    }    
    
    
}
