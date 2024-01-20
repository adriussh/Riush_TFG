package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio2Correccion;

public abstract class Figura implements IAcciones{
    //sin atributos

    //sin constructores. Las clases abstractas solo declaran metodos para ser implementadas en las hijas. Las interfaces tambien solo declaran metodos que seran implementadas
    //en la clase Figura.

    //Declaracion metodos abstractos.
    public abstract double volumen();
    public abstract double area();
}
