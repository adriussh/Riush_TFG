package PrimerAnyo.TercerTr.Sesion2604.EjArrayList2.E2;

public class E2Alumno {
    String nombre;
    double nota;

    public E2Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "E2Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
