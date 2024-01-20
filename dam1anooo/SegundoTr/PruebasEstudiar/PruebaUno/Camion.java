package PrimerAnyo.SegundoTr.PruebasEstudiar.PruebaUno;

public class Camion extends Vehiculo implements Kilometraje{
    private double cargaMaxima;
    private double kilometraje;

    public Camion() {
    }

    public Camion(int puertas, String tipoDeMotor, String color, int numeroRuedas, double cargaMaxima, double kilometraje) throws TipoMotorIncorrecto {
        super(puertas, tipoDeMotor, color, numeroRuedas);
        this.cargaMaxima = cargaMaxima;
        this.kilometraje = kilometraje;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public double NuevoKilometraje() {
        double nuevokm = getKilometraje()+1500;
        return nuevokm;
    }
}
