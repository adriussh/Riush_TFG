package PrimerAnyo.PrimerTr.Sesion2610;

public class Mascota {
    //atributos,campos, variables.
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private int peso;
    private int altura;
    private char genero;

    //métodos.

    public Mascota(){
        nombre="default";
        edad=0;
        raza="default";
        color="default";
        peso=0;
        altura=0;
        genero='d';

    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
