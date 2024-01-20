package PrimerAnyo.SegundoTr.Sesion1502.E2;

public class Moto extends Vehiculos{

    private int cilindrada;

    public Moto(){}

    public Moto(int km_realizados, String matrícula, int cilindrada) {
        super(km_realizados, matrícula);
        this.cilindrada = cilindrada;
    }

    public String showInfo() {
        return "*** Moto {" + "Kilometraje="+getKm_realizados()+". Matricula="+getMatrícula()+". Cilindrada=+"+getCilindrada()+". } ***";
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
