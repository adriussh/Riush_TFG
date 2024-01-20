package PrimerAnyo.TercerTr.SimulacroExamenTercera;

public abstract class Emisora {
    //atributos
    protected int num_emisora;
    protected String nombre_emisora;
    protected boolean emitiendo;
    protected double beneficios;

    protected int num_oyentes;

    //Metodo abstracto
    abstract double ganancias();

    //Constructor


    public Emisora(int num_emisora, String nombre_emisora, double beneficios) throws AccionInvalida {
        this.num_emisora = num_emisora;
        this.nombre_emisora = nombre_emisora;
        if (num_oyentes<0){
            throw new AccionInvalida("No puede valores negativos");
        }
        this.num_oyentes = num_oyentes;
        this.beneficios = ganancias();
    }

    public int getNum_emisora() {
        return num_emisora;
    }

    public void setNum_emisora(int num_emisora) {
        this.num_emisora = num_emisora;
    }

    public String getNombre_emisora() {
        return nombre_emisora;
    }

    public void setNombre_emisora(String nombre_emisora) {
        this.nombre_emisora = nombre_emisora;
    }

    public boolean isEmitiendo() {
        return emitiendo;
    }

    public void setEmitiendo(boolean emitiendo) {
        this.emitiendo = emitiendo;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

    public int getNum_oyentes() {
        return num_oyentes;
    }

    public void setNum_oyentes(int num_oyentes) {
        this.num_oyentes = num_oyentes;
        this.beneficios=ganancias();
    }

    @Override
    public String toString() {
        return "Emisora{" +
                "num_emisora=" + num_emisora +
                ", nombre_emisora='" + nombre_emisora + '\'' +
                ", emitiendo=" + emitiendo +
                ", beneficios=" + beneficios +
                ", num_oyentes=" + num_oyentes +
                '}';
    }
}
