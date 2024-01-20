package PrimerAnyo.SegundoTr.Sesion1502.E2;

public class Vehiculos {

    protected int km_realizados;
    protected String matrícula;

    public Vehiculos (){

    }
    public Vehiculos (int km_realizados, String matrícula){
        this.km_realizados=km_realizados;
        this.matrícula=matrícula;
    }

    public int getKm_realizados() {
        return km_realizados;
    }

    public void setKm_realizados(int km_realizados) {
        this.km_realizados = km_realizados;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }


}
