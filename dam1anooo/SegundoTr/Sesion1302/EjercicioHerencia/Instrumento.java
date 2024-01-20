package PrimerAnyo.SegundoTr.Sesion1302.EjercicioHerencia;

public abstract class Instrumento {
    public String tipo;

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
