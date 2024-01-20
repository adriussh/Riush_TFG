package PrimerAnyo.TercerTr.ProgGenerica;

public class Personaa {

    String dni;
    public Personaa() {
    }

    public Personaa(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Personaa{" +
                "dni='" + dni + '\'' +
                '}';
    }
}
