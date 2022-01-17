package UD6.POO.Clase_CuentaCorriente;

public class CuentaCorriente {
    private int numeroCuenta;
    private double saldo;
    
    //CONSTRUCTOR
    public CuentaCorriente(int numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        if(saldo<0)
            System.out.println("No se puede crear una cuenta con saldo negativo");
        this.saldo=saldo;
    }
    
    //GETTERS
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //SETTERS
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    //METODOS
    public void ingresar(double ingresar){
        if(ingresar<=0)
            System.out.println("Lo siento, no se permiten ingresos negativos o nulos");
        else{
            this.saldo+=ingresar;
            System.out.println("El saldo de tu cuenta ahora es de: " + getSaldo() + " €");
        }
    }
    
    public boolean retirar(double retirar){
        if(saldo>retirar && retirar>=0){
            saldo-=retirar;
            return true;
        }
        else
            return false;
    }
}
