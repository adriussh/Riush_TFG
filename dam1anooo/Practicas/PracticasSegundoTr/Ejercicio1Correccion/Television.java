package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1Correccion;

public class Television extends Electrodomestico{
    /* atributos de la clase hija Television*/
    private int resolucion;
    private boolean tdt;

    /* la clase Television tiene tres constructores*/
    public Television() {
    }

    /* *
     * @param precio_base
     * @param peso
     * @param resolucion
     * @param tdt
     * */

    public Television(double precio_base, double peso, int resolucion, boolean tdt) {
        super(precio_base, peso);
        this.resolucion = 20;
        this.tdt = false;
    }

    public Television(double precio_base, double precio_final, String colores, Consumo consumo_energetico, double peso, int resolucion, boolean tdt) throws ProductoIncorrecto {
        super(precio_base, precio_final, colores, consumo_energetico, peso);
        this.resolucion = 20;
        this.tdt = false;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public double precioFinal(){
        double resultado=0;
        resultado=super.precioFinal();
        if (resolucion>40){
            resultado=(resultado+resultado*0.3);
        } else if (isTdt()) {
            resultado+=50;
        }
        return resultado;
    }
}
