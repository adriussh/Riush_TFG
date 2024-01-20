package PrimerAnyo.TercerTr.Sesion1704.EjerciciosSet.E1;

public class Jugador {
    String nombre;
    int edad;
    Posicion pos;

    public Jugador(String nombre, int edad, String pos) {
        this.nombre = nombre;
        this.edad = edad;
        this.pos = Posicion.valueOf(pos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = Posicion.valueOf(pos);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pos=" + pos +
                '}';
    }
}


