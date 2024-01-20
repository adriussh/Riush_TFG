package PrimerAnyo.SegundoTr.Sesion0102;

public class Vehiculo {

    //atributos
    private PrimerAnyo.SegundoTr.Sesion0102.Marca Marca;
    private String Referencia;
    private int Modelo;
    private String Placa;
    private String Color;
    private int Valor;
    private int Velocidad;
    private int marcha;

    //Metodos Constructores

    //Primer constructor: el de defecto.
    public Vehiculo (){

    }
    //Segundo constructor: el parametrizado.
    public Vehiculo (Marca Marca, String Referencia, int Modelo, String Placa, String Color, int Valor){
        this.Marca=Marca;
        this.Referencia=Referencia;
        this.Modelo=Modelo;
        this.Placa=Placa;
        this.Color=Color;
        this.Valor=Valor;
        this.Velocidad=0;
        this.marcha=0;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public PrimerAnyo.SegundoTr.Sesion0102.Marca getMarca() {
        return Marca;
    }

    public void setMarca(PrimerAnyo.SegundoTr.Sesion0102.Marca marca) {
        Marca = marca;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }

    public void acelerar (int Velocidad){
        System.out.println("El coche está acelerando a: "+Velocidad+" km/h.");
        this.Velocidad=this.Velocidad+Velocidad;
    }

    public void frenar (int Velocidad){
        System.out.println("El coche está ralentizando su velocidad a: "+Velocidad+" km/h.");
        this.Velocidad=this.Velocidad-Velocidad;
    }

    public void cambiarmarcha(int marcha){
        if (this.marcha==marcha){
            System.out.println("Estas en esa marcha. No podemos cambiar.");

        }else if (marcha > 7){
            System.out.println("No existe esa marcha en el coche.");

        }
        else {
            this.marcha=marcha;
            System.out.println("Cambiando de marcha a "+marcha);
        }
    }

    public void apagar(){
        System.out.println("Apagando el coche...");
        this.Velocidad=0;
        this.marcha=1;
    }
}
