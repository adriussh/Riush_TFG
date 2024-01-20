package PrimerAnyo.TercerTr.Sesion0405;

public class Paciente {
    public String dni;
    public String nombre;
    public String apellidos;
    public int n_operaciones;

    public Paciente(String dni, String nombre, String apellidos, int n_operaciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.n_operaciones = n_operaciones;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getN_operaciones() {
        return n_operaciones;
    }

    public void setN_operaciones(int n_operaciones) {
        this.n_operaciones = n_operaciones;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", n_operaciones=" + n_operaciones +
                '}';
    }
}
