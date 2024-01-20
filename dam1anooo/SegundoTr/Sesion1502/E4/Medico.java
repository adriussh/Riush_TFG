package PrimerAnyo.SegundoTr.Sesion1502.E4;

public class Medico {

    private String nombre;
    private String apellidos;
    private int n_colegiado;

    public Medico() {
    }

    public Medico(String nombre, String apellidos, int n_colegiado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.n_colegiado = n_colegiado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getN_colegiado() {
        return n_colegiado;
    }

    public void setN_colegiado(int n_colegiado) {
        this.n_colegiado = n_colegiado;
    }
}


