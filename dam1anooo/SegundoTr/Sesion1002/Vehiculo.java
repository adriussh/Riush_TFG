package PrimerAnyo.SegundoTr.Sesion1002;

public class Vehiculo {
    //atributos
    private String matricula;
    private String modelo;
    private int potenciaCV;

    //constructores
    public Vehiculo(){

    }

    public Vehiculo(String matricula, String modelo, int potenciaCV){
        this.matricula=matricula;
        this.modelo=modelo;
        this.potenciaCV=potenciaCV;
    }

    //getteres&setteres

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
}
