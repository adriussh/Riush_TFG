package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1;

public abstract class Electrodomestico {

    //Inicializacion de los atributos con su respectivo nombre
    protected double precio_base = 100;
    protected double precio_final = 0;
    protected Color color = Color.blanco;
    protected char consumo_energetico = 'F';
    protected double peso = 5;


    //constructores requeridos e indicados
    public Electrodomestico(){
    }

    public Electrodomestico(double precio_final, double peso) {
        this.peso = peso;
        this.precio_final = precio_final;
    }

    public Electrodomestico(double precio_base, double precio_final, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.precio_final = precio_final;
        this.color = Color.blanco;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    //metodo que comprueba el consumo energetico.
    public void comprobarConsumoEnergetico() throws ProductoIncorrecto{
        switch (consumo_energetico){
            case 'A':
                if (!(precio_final >= 100)){
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'B':
                if (!(precio_final >= 80 && precio_final < 100)){
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'C':
                if (!(precio_final >= 60 && precio_final < 80)){
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'D':
                if (!(precio_final >= 50 && precio_final < 60)){
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'E':
                if (!(precio_final >= 30 && precio_final < 50)){
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
            case 'F':
                if (!(precio_final >= 10 && precio_final < 30)){
                    throw new ProductoIncorrecto("No es correcto la letra con precio");
                }
                break;
        }


    }

    protected abstract double precioFinal();

    public boolean comprobarColor(String color) throws ProductoIncorrecto {
        boolean estadoproductogama = false;
        //si color es igual a alguno de estos valores, entonces estadoproductogama es true.
        if (Color.blanco.toString().equals(color) || Color.negro.toString().equals(color) || Color.azul.toString().equals(color) || Color.rojo.toString().equals(color) || Color.gris.toString().equals(color)) {
            estadoproductogama = true;
        }
        else {
            throw new ProductoIncorrecto("*** El color que usted indica no se encuentra dentro de nuestra gama. ***");
        }
        return estadoproductogama;
    }

    @Override
    public String toString(){
        return "El precio base del producto es "+precio_base+
                "\n precio final del producto es "+precio_final+
                "\n El producto es de color "+color+
                "\n El consumo energetico es "+consumo_energetico+
                "\n Y su peso es de"+peso+"kg.";
    }

    public void ProductoIncorrecto() throws ProductoIncorrecto {
        throw new ProductoIncorrecto("Ha introducido datos incompatibles.");
    }

    // getter's y setter's necesarios
    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}