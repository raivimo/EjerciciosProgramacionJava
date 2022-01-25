
package UD6.POO.Clase_Reloj;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;
    
    //CONSTRUCTORES
    public Reloj (int hora, int minuto, int segundo){
        if(hora<24 && minuto<60 && segundo<60){
            this.hora=hora;
            this.minuto=minuto;
            this.segundo=segundo;
        }
        else
            System.out.println("Lo siento, el formato de horas no es adecuado. HORA < 24, MIN < 60 Y SEG < 60");
    }
    
    public Reloj(){
    }
    
    //GETTERS
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    //SETTERS
    public void setHora(int hora){
        if(hora<24)
            this.hora=hora;
        else
            System.out.println("Formato de hora no valido, prueba hora < 24");
    }
    
    public void setMinuto(int minuto){
        if(minuto<60)
            this.minuto=minuto;
        else
            System.out.println("Formato de minuto no valido, prueba minuto < 60");
    }
    
    public void setSegundo(int segundo){
        if(segundo<60)
            this.segundo=segundo;
        else
            System.out.println("Formato de minuto no valido, prueba segundo < 60");
    }
    
    //METODOS
    public void setReloj(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    public String dimeHora(){
        return (getHora() + ":" + getMinuto() + ":" + getSegundo() );
    }
    
    public String dimeHora12(){
        if(getHora()>12){
            hora = getHora()-12;
            return (hora + "pm:" + getMinuto() + ":" + getSegundo() );
        }
        else
            return (getHora() + "am:" + getMinuto() + ":" + getSegundo() );
    }
    
    public void imprimeHora(){
        System.out.println(getHora() + ":" + getMinuto() + ":" + getSegundo() );
    }
    
    public void imprimeHora12(){
        if(getHora()>12){
            hora = getHora()-12;
            System.out.println(hora + "pm:" + getMinuto() + ":" + getSegundo() );
        }
        else
            System.out.println(getHora() + "am:" + getMinuto() + ":" + getSegundo() );
    }
    
    public void tick(){
        if(segundo < 59)
            segundo =  getSegundo()+1;
        else{
            segundo = 0;
            if(minuto < 59)
                minuto = getMinuto()+1;
            else
                minuto =0;
                if(hora < 23 && minuto ==59)
                    hora = getHora() + 1;
                else if(hora > 23 && minuto==59)
                    hora=0;
            }
    }
    
    public void tick(int s){
        for (int i = 0; i < s; i++) {
            tick();
        }
    }    
}
