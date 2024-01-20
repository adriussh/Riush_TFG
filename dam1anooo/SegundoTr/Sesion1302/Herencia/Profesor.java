package PrimerAnyo.SegundoTr.Sesion1302.Herencia;

public class Profesor extends Persona{
    private int salario;

    public Profesor(String dni, String nombre, int edad, int salario, int beca1) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
        this.salario = beca1;
    }

    public int getBeca() {
        return salario;
    }

    public void setBeca(int beca) {
        this.salario = beca;
    }

    @Override
    public String toString() {
        return "Profesor-> DNI: "+dni+". Nombre-> "+nombre+". Edad-> "+edad+". Salario-> "+salario;
    }

    public double calcularRetencion(){
        double retencion;
        retencion=salario*0.20;
        return retencion;
    }
}
