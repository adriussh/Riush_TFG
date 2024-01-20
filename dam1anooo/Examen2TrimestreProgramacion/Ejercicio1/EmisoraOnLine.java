package PrimerAnyo.Examen2TrimestreProgramacion.Ejercicio1;

public class EmisoraOnLine extends Emisora{
    private static final double GANANCIA_POR_OYENTE=0.023;
    private String url;

    public EmisoraOnLine(String nombre_emisora, int anyo_creacion, int num_oyentes, String url) throws CreacionInvalida {
        super(nombre_emisora, anyo_creacion, num_oyentes);
        this.url = url;
    }

    public double ganancias(){
        return num_oyentes*GANANCIA_POR_OYENTE;
    }

    public String getNum_oyentes() {
        return null;
    }

    public void iniciarEmision() throws  OpcionInvalida{
        if (!emitiendo){
            throw new OpcionInvalida("No se puede iniciar una emision ya iniciada");
        }
        System.out.println("Iniciando la emision "+nombre_emisora+" en "+url);
        emitiendo=true;
    }

    public void finalizarEmision() throws OpcionInvalida{
        if (!emitiendo){
            throw new OpcionInvalida("No se puede finalizar una emision ya finalizada");
        }
        System.out.println("Finalizando la emision "+nombre_emisora+" en "+url);
        emitiendo=false;
    }
}
