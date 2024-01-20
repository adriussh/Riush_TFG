package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1;

public class Television extends Electrodomestico {

    protected int resolucion = 20;
    protected boolean sintonizadorTDT = false;


    public Television() {
    }

    public Television(double precio_base, double precio_final, String color, char consumo_energetico, double peso, int resolucion, boolean sintonizadorTDT){
        super(precio_base, precio_final, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    protected double precioFinal() {
        //fijacion del precio final a partir de la eleccion de consumo energetico
        switch (consumo_energetico) {
            case 'A':
                precio_final = precio_base + 100;
                break;
            case 'B':
                precio_final = precio_base + 80;
                break;
            case 'C':
                precio_final = precio_base + 60;
                break;
            case 'D':
                precio_final = precio_base + 50;
                break;
            case 'E':
                precio_final = precio_base + 30;
                break;
            case 'F':
                precio_final = precio_base + 10;
                break;
            default:
                System.out.println("La opcion no se encuentra en el sistema.");
                break;
        }

        // fijacion de precio final dependiendo del peso
        if (peso > 0 && peso < 19) {
            precio_final += 10;
        } else if (peso >= 20 && peso < 50) {
            precio_final += 50;
        } else if (peso >= 50 && peso < 80) {
            precio_final += 80;
        } else if (peso >= 80) {
            precio_final += 100;
        }

        //fijacion de precio final dependiendo de la resolucion
        if (resolucion > 40) {
            precio_final = precio_final + (precio_final * 0.3);
        }
        if (sintonizadorTDT == true) {
            precio_final = precio_final + 50;
        }
        return precio_final;
    }
    @Override
    public void ProductoIncorrecto () throws ProductoIncorrecto {
            throw new ProductoIncorrecto("Ha introducido datos incompatibles.");
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    protected void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return super.toString() + "La resolucion del televisor es " + resolucion +
                "\n y tiene un sintonizador del tipo TDT: " + sintonizadorTDT;
    }
}