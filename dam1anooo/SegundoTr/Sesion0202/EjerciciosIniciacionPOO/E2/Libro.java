package PrimerAnyo.SegundoTr.Sesion0202.EjerciciosIniciacionPOO.E2;

public class Libro {
    private String titulo;
    private String autor;
    private int edicion;
    private int año_public;
    private String categoria;

    private double precio;

    private String isbn;
    private Editorial editorial;

    public Libro(){

    }

    public Libro(String titulo, String autor, int edicion, int año_public, String categoria, double precio, String isbn, Editorial editorial){
        this.titulo=titulo;
        this.autor=autor;
        this.edicion=edicion;
        this.año_public=año_public;
        this.categoria=categoria;
        this.precio=precio;
        this.isbn=isbn;
        this.editorial=editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getAño_public() {
        return año_public;
    }

    public void setAño_public(int año_public) {
        this.año_public = año_public;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
