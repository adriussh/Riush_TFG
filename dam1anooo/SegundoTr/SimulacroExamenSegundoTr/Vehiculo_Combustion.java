package PrimerAnyo.SegundoTr.SimulacroExamenSegundoTr;

public class Vehiculo_Combustion extends Vehiculo{
    private Tipo_fosil tipo_de_fosil;
    private boolean viscosidad;

    public Vehiculo_Combustion(String matricula, String marca, String modelo, int fecha_fabricacion, int num_puertas, String color, int potencia, Tipo_fosil tipo_de_fosil, boolean viscosidad) throws MarcaInvalida {
        super(matricula, marca, modelo, fecha_fabricacion, num_puertas, color, potencia);
        this.tipo_de_fosil = tipo_de_fosil;
        this.viscosidad = viscosidad;
    }
    public double consumo(){
        return 0;
    }
}
