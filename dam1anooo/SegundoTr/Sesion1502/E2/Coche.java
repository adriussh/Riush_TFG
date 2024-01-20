package PrimerAnyo.SegundoTr.Sesion1502.E2;

public class Coche extends Vehiculos{

    private int numero_puertas;
    private int caballos;

    public Coche(){

    }

    public Coche(int km_realizados, String matricula, int numero_puertas, int caballos) {
        super(km_realizados, matricula);
        this.numero_puertas = numero_puertas;
        this.caballos = caballos;
    }

    public String showInfo() {
        return "*** Coche {" + "Kilometraje="+getKm_realizados()+". Matricula="+getMatrícula()+". Numero de puertas="+getNumero_puertas()+". CV="+getCaballos()+". } ***";
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}
