
package UD6.POO.Clase_DNI;

public class DNI {
    private int dni;
    
    //CONSTRUCTOR
    public DNI(int dni){
        this.dni=dni;
    }
    
    //GETTERS
    public int getDNI(){
        return dni;
    }
    
    public String getLetra(){
        String letra[]={"T", "R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int res = (getDNI()%23);
        return letra[res];        
    }
    
    public String getNIF(){
        return (getDNI()+ getLetra() );
    }
}
    
    
    


