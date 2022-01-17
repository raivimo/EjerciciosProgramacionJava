
package UD6.POO.Clase_Asignatura;

public class Asignatura {
    private String nombre;
    private int codigoAsignatura;
    private int cursoImpartido;
    
    //CONSTRUCTOR
    public Asignatura(String nombre, int codigoAsignatura, int cursoImpartido){
        this.nombre=nombre;
        this.codigoAsignatura=codigoAsignatura;
        this.cursoImpartido=cursoImpartido;
    }
    
    //GETTERS
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCodigoAsignatura(){
        return codigoAsignatura;
    }
    
    public int getCursoImpartido(){
        return cursoImpartido;
    }
    
    //SETTERS
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setCodigoAsignatura(int codigoAsignatura){
        this.codigoAsignatura= codigoAsignatura;
    }
    
    public void setCursoImpartido(int cursoImpartido){
        this.cursoImpartido=cursoImpartido;
    }
    
    //METODOS
    
    public void imprimir(){
        System.out.println("Nombre Asignatura: " + getNombre() + " CODIGO ASIGNATURA: " + getCodigoAsignatura()
        + " SE IMPARTE EN EL CURSO DE: " + getCursoImpartido());
    }
    
}


