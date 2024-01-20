package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1Correccion;

public abstract class Electrodomestico {
    //Atributos
    protected double precio_base= 100;
    protected double precio_final;
    protected String colores = Color.blanco.name();
    protected Consumo consumo_energetico = Consumo.F;
    protected double peso=5;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.precio_final=precioFinal();
    }

    public Electrodomestico(double precio_base, double precio_final, String colores, Consumo consumo_energetico, double peso) throws ProductoIncorrecto {
        if (comprobarConsumo(consumo_energetico.toString().charAt(0))){
            this.precio_base = precio_base;
            this.consumo_energetico = consumo_energetico;
        }
        else {
            throw new ProductoIncorrecto("No es correcta la letra con el precio");
        }
        this.precio_final = precioFinal();
        if (comprobarColor(colores)){
            this.colores= colores;
        }
        this.peso = peso;
    }

    //getters and setters
    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) throws ProductoIncorrecto {
        if (comprobarColor(colores)){
            this.colores = colores;
        }
    }

    public boolean comprobarColor(String colores) throws ProductoIncorrecto{
        if (colores.toLowerCase().equals("blanco")||colores.toLowerCase().equals("negro")||colores.toLowerCase().equals("rojo")||colores.toLowerCase().equals("azul")||colores.toLowerCase().equals("gris")){
            return true;
        }
        else{
            throw new ProductoIncorrecto("Ese color no esta dentro de la gama");
        }
    }

    public boolean comprobarConsumo(char letra){
        boolean resultado = false;
        if (Consumo.A.toString().equals(letra) && precio_base>=100||Consumo.B.toString().equals(letra) && precio_base>=80 && precio_base<100||Consumo.A.toString().equals(letra) && precio_base>=100
                ||Consumo.C.toString().equals(letra) && precio_base>=60 && precio_base<80||Consumo.D.toString().equals(letra) && precio_base>=50 && precio_base<60
                ||Consumo.E.toString().equals(letra) && precio_base>=30 && precio_base<50||Consumo.F.toString().equals(letra) && precio_base>=10 && precio_base<30){
            resultado=true;
        }
        return resultado;
    }
    public double precioFinal(){
        switch (consumo_energetico){
            case A: precio_final=100;break;
            case B: precio_final=80;break;
            case C: precio_final=60;break;
            case D: precio_final=50;break;
            case E: precio_final=30;break;
            case F: precio_final=10;break;
        }
        if (peso>0 && peso<=19){
            precio_final+=10;
        } else if (peso>=20 && peso<=49){
            precio_final+=80;
        }else {
            precio_final+=100;
        }
        return precio_final;
    }
}
