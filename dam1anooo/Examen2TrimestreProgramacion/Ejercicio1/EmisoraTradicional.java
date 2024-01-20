package PrimerAnyo.Examen2TrimestreProgramacion.Ejercicio1;

public class EmisoraTradicional extends Emisora{
    private Frecuencia frecuencia; //AM o FM.
    private double num_freccuencia;
    private static final double GANANCIAS_POR_OYENTE=0.023;

    //constructor

    public EmisoraTradicional(String nombre_emisora, int anyo_creacion, int num_oyentes, double num_freccuencia) throws CreacionInvalida, IllegalAccessException {
        super(nombre_emisora, anyo_creacion, num_oyentes);
        if (num_freccuencia>=540 && num_freccuencia<1600){
            this.frecuencia=Frecuencia.AM;

        } else if (num_freccuencia>88.1&&num_freccuencia<108.1){
            this.frecuencia=Frecuencia.FM;

        } else {
            throw new IllegalAccessException("El numero de frecuencia introducido es incorrecto.");
        }
        this.num_freccuencia = num_freccuencia;
    }
    public double ganancias(){
        return num_oyentes*GANANCIAS_POR_OYENTE;
    }

    public String getNum_oyentes() {
        return null;
    }

    public void iniciarEmision() throws OpcionInvalida{
        if (emitiendo){
            throw new OpcionInvalida("No se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciando emision "+nombre_emisora+" en "+num_freccuencia);
        emitiendo=true;
    }
    public void finalizarEmision() throws OpcionInvalida{
        if (emitiendo){
            throw new OpcionInvalida("No se puede finalizar una emision ya finalizada");
        }
        System.out.println("Finalizando emision "+nombre_emisora+" en "+num_freccuencia);
        emitiendo=false;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public double getNum_freccuencia() {
        return num_freccuencia;
    }

    public void setNum_freccuencia(double num_freccuencia) {
        if (num_freccuencia>=540 && num_freccuencia<1600) {
            this.frecuencia = Frecuencia.AM;
        } else if (num_freccuencia>88.1 && num_freccuencia<108.1) {
            this.frecuencia=Frecuencia.FM;
        }
        else {
            throw new IllegalArgumentException("El numero de frecuencia introducido es incorrecto");
        }
        this.num_freccuencia = num_freccuencia;
    }
}
