package PrimerAnyo.SegundoTr.Sesion2002;

public class Persona {
    private String nombre;
    private int edad;

    public Persona (String nombre, int edad) throws EdadIncorrecta {
        if (edad<=0 || nombre.isEmpty()){
            throw new EdadIncorrecta("O la edad es menor o igual a 0 o el nombre esta indicado como vacio");
        }
        this.nombre=nombre;
        this.edad=edad;
    }
}
