package PrimerAnyo.SegundoTr.SimulacroExamenSegundoTr;

public class Vehiculo {

    private final int anio_actual=2023;
    private final int kms_per_anio=15000;
    protected static int contador=0;
    protected int num_bast;
    protected String matricula;
    protected Tipo_marca marca;
    protected String modelo;
    protected int fecha_fabricacion;
    protected int edad;
    protected int num_kms_realizados;
    protected int num_puertas;
    protected String color;
    protected int potencia;
    protected double consumo=0;
    protected boolean estado=false;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, String modelo, int fecha_fabricacion, int num_puertas, String color, int potencia) throws MarcaInvalida {
        this.num_bast=contador++;
        this.matricula = matricula.toUpperCase();
        if (!esta(marca.toUpperCase())){
            throw new MarcaInvalida("No ha introducido una marca valida.");
        }
        this.marca = Tipo_marca.valueOf(marca.toUpperCase());
        this.modelo = modelo;
        this.fecha_fabricacion = fecha_fabricacion;
        this.edad=calcular_edad();
        this.num_kms_realizados=calcularKmsRecorridos();
        this.num_puertas = num_puertas;
        this.color = color;
        this.potencia = potencia;
        this.consumo = calcularConsumo();
    }

    private double calcularConsumo() {
        double cons_final=0;

        return cons_final;
    }

    private int calcularKmsRecorridos() {
        int kilometros_final=0;

        return kilometros_final;
    }

    private boolean esta(String marca){
        boolean esta=false;
        if (Tipo_marca.DS.toString().equals(marca)||Tipo_marca.CITROEN.toString().equals(marca)||Tipo_marca.OPEL.toString().equals(marca)||Tipo_marca.JEEP.toString().equals(marca)||Tipo_marca.PEUGEOT.toString().equals(marca));
        return esta;
    }

    private int calcular_edad() {
        int edad_final;
        edad_final=anio_actual-fecha_fabricacion;

        return edad_final;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Tipo_marca getMarca() {
        return marca;
    }

    public void setMarca(Tipo_marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(int fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNum_bast() {
        return num_bast;
    }

    public int getEdad() {
        return edad;
    }

    public int getNum_kms_realizados() {
        return num_kms_realizados;
    }

    public double getConsumo() {
        return consumo;
    }

    public boolean isEstado() {
        return estado;
    }
}

