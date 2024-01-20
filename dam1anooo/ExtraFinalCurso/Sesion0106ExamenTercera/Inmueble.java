package PrimerAnyo.ExtraFinalCurso.Sesion0106ExamenTercera;

public abstract class Inmueble {
    protected int identificador;
    protected String nombre;
    protected int anyo_edificacion;
    protected String direccion;
    protected double ibi;
    protected double m2;
    public abstract double calcular_ibi();

    public Inmueble(int identificador, String nombre, int anyo_edificacion, String direccion, double m2) throws AccionInvalida {
        this.identificador = identificador;
        this.nombre = nombre;
        if (anyo_edificacion<=0){
            throw new AccionInvalida("No puede ser un valor negativo.");
        }
        this.anyo_edificacion = anyo_edificacion;
        this.direccion = direccion;
        if (m2<=0){
            throw new AccionInvalida("No puede ser un valor negativo.");
        }
        this.m2 = m2;
        this.ibi = calcular_ibi();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo_edificacion() {
        return anyo_edificacion;
    }

    public void setAnyo_edificacion(int anyo_edificacion) throws AccionInvalida {
        this.anyo_edificacion = anyo_edificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getIbi() {
        return ibi;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
        this.calcular_ibi();
    }

    public void setIbi(double ibi) {
        this.ibi = calcular_ibi();
    }
}
