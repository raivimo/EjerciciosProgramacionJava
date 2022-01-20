package UD6.POO.Clase_Coche;
enum tipo {MINI, UTILITARIO, FAMILIAR, DEPORTIVO}
enum seguro{TODO_RIESGO, TERCEROS}
    
public class Coche {
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private tipo tipo_coche;
    private int año;
    private seguro seguro_coche;
    
    //CONSTRUCTOR
    public Coche (String modelo, String color, boolean metalizada, tipo tipo_coche, String matricula, int año, seguro seguro_coche){
        this.modelo=modelo;
        this.color = color;
        this.metalizada=metalizada;
        this.tipo_coche=tipo_coche;
        this.matricula=matricula;
        this.año=año;
        this.seguro_coche=seguro_coche;
    }
      
    //GETTERS
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getMetalizada(){
        return metalizada;
    }
    
    public tipo getTipo(){
        return tipo_coche;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public int getAño(){
        return año;
    }
        
    public seguro getSeguro(){
        return seguro_coche;
    }
    
    //SETTERS
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public void setMetalizada(boolean metalizada){
        this.metalizada=metalizada;
    }
    
    public void setTipo(tipo tipo_coche){
        this.tipo_coche=tipo_coche;
    }
    
        
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public void setSeguro(seguro seguro_coche){
        this.seguro_coche=seguro_coche;
    }
    
      
    //METODOS
    public void imprimir(){
        System.out.println("Modelo Coche: " + getModelo()+ " Color del coche: " + getColor()
                + " Pintura Metalizada: " + getMetalizada()+" Tipo de Carroceria: " + getTipo()
                + " Matricula del coche: " + getMatricula() + " Año de Construccion: " + getAño()
                + " Tipo de Seguro: " + getSeguro());
    }

    
}


