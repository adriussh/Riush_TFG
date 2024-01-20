package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1Correccion;

public class Lavadora extends Electrodomestico{
    /*Atributos */
    private float carga=5;
    /* constructores son tres */
    public Lavadora(){
    }

    public Lavadora(double precio_base, double peso, float carga) {
        super(precio_base, peso);
        this.carga = carga;
    }

    public Lavadora(double precio_base, double precio_final, String colores, Consumo consumo_energetico, double peso, float carga) throws ProductoIncorrecto {
        super(precio_base, precio_final, colores, consumo_energetico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal(){
        precio_final=super.precioFinal();
        if (carga>30){
            precio_final+=50;
        }
        return precio_final;
    }
}
