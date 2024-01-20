package PrimerAnyo.TercerTr.Sesion2404;

public abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String apelido1;
    protected int edad;
    protected double altura;
    protected double peso;
    protected double icm;
    protected Categoria estado;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apelido1, int edad, double altura, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apelido1 = apelido1;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.icm=CalcularICM();
        this.estado=CalcularCategoria();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.icm=CalcularICM();
        this.estado=CalcularCategoria();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.icm=CalcularICM();
        this.estado=CalcularCategoria();
    }

    public double getIcm() {
        return icm;
    }

    public void setIcm(double icm) {
        this.icm = icm;
    }

    public Categoria getEstado() {
        return estado;
    }

    public void setEstado(Categoria estado) {
        this.estado = estado;
    }

    public double CalcularICM() {
        return peso/(Math.pow(altura,2));
    }

    public abstract Categoria CalcularCategoria();
}
