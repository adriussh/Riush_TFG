package PrimerAnyo.SegundoTr.PruebasEstudiar.PruebaUno;

public abstract class Vehiculo implements Kilometraje{
    protected int puertas;
    protected TipoMotor tipoDeMotor=TipoMotor.COMBUSTION;
    protected String color;
    protected int numeroRuedas;

    public Vehiculo() {
    }

    public Vehiculo(int puertas, String tipoDeMotor, String color, int numeroRuedas) throws TipoMotorIncorrecto {
        this.puertas = puertas;
        if (!TipoMotor.ELECTRICO.toString().equals(tipoDeMotor.toUpperCase()) && !TipoMotor.COMBUSTION.toString().equals(tipoDeMotor.toUpperCase())){
            throw new TipoMotorIncorrecto("El tipo de motor no es correcto");
        }
        this.tipoDeMotor = TipoMotor.valueOf(tipoDeMotor.toUpperCase());
        this.color = color;
        this.numeroRuedas = numeroRuedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public TipoMotor getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) throws TipoMotorIncorrecto {
        if (!TipoMotor.ELECTRICO.toString().equals(tipoDeMotor.toUpperCase()) && !TipoMotor.COMBUSTION.toString().equals(tipoDeMotor.toUpperCase())){
            throw new TipoMotorIncorrecto("El tipo de motor no es correcto");
        }
        this.tipoDeMotor = TipoMotor.valueOf(tipoDeMotor);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public double NuevoKilometraje() {
        double nuevokm=0;
        return nuevokm;
    }
}
