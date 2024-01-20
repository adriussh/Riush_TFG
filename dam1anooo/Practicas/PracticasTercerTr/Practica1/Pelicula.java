package PrimerAnyo.Practicas.PracticasTercerTr.Practica1;

public class Pelicula {
    private int id;
    private String titulo;
    private Genero genero;
    private int estreno;

    //Constructores
    public Pelicula(int id, String titulo, String genero, int estreno) {
        this.id = id;
        this.titulo = titulo;
        this.genero = Genero.valueOf(genero.toUpperCase());
        this.estreno = estreno;
    }

    //Getter's y Setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = Genero.valueOf(genero.toUpperCase());
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero=" + genero +
                ", estreno=" + estreno +
                '}';
    }
}
