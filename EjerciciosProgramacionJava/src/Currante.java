public class Currante extends Trabajador {

    private double horas;

    private Departamento departamento;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Currante(double horas, Departamento departamento) {
        this.horas = horas;
        this.departamento = departamento;
    }
    
}
