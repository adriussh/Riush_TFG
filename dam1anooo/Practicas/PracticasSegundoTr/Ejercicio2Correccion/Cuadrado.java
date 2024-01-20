package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio2Correccion;

public class Cuadrado extends Figura{
    //atributos
    private int lado;

    //constructores
    public Cuadrado() {
    }

    public Cuadrado(int lado) throws ExcepcionCuadrado{
        if (lado<=0){
            throw new ExcepcionCuadrado("Un lado no puede ser igual o menor a 0.");
        }
        this.lado = lado;
    }

    //getter's y setter's
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) throws ExcepcionCuadrado{
        if (lado<=0){
            throw new ExcepcionCuadrado("Un lado no puede ser igual o menor a 0.");
        }
        this.lado = lado;
    }

    public double volumen(){
        return Math.pow(lado,3);
    }
    public double area(){
        return lado*lado;
    }
    public void dibujar(){
        System.out.println("00000000000");
        System.out.println("00000000000");
        System.out.println("00000000000");
        System.out.println("00000000000");
        System.out.println("00000000000");
    }
}
