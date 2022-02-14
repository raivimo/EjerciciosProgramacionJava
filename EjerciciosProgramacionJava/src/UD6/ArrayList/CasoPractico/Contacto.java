package UD6.ArrayList.CasoPractico;

public class Contacto {
    
    //Atributos
    private String nombre;
    private String correo;
    private String telefono;
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }   
    
    public String getCorreo(){
        return correo;
    }
    public String getTelf(){
        return telefono;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void setTelf(String telf){
        this.telefono = telf;
    }
    
    //CONSTRUCTOR
    public Contacto(String nombre, String correo, String telf){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telf;
    }
     
    //METODOS UTILES
    public void imprimir(){
        System.out.println("Nombre Contacto: " +getNombre() + " Telefono: " + getTelf() + " Correo: " + getCorreo());
    }
}
    
