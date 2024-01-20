package PrimerAnyo.Examen2TrimestreProgramacion.Ejercicio1;
/* m* *
 * @author javier
 * @version 1.0
 * Esta clase Emisora permite almacenar informacion sobre emisoras
 */
public abstract class Emisora implements Emitible{
    protected static int num_emisoras=0;
    protected int identificador;
    protected String nombre_emisora;
    protected int anyo_creacion;
    protected boolean emitiendo=false;
    protected int num_oyentes;

    //constructor

    /* *
     *
     * @param1 nombre_emisora
     * @param2 anyo_creacion
     * @param3 num_oyentes
     * este constructor permite crear una emisora a partir de los parametros de entrada indicados
     * */
    public Emisora(String nombre_emisora, int anyo_creacion, int num_oyentes) throws CreacionInvalida {
        this.nombre_emisora = nombre_emisora.toUpperCase();
        this.identificador=num_emisoras++;
        if (anyo_creacion<1879){
            throw new CreacionInvalida("La radio no existia antes de 1879. Dato erroneo.");
        }
        this.anyo_creacion = anyo_creacion;
        this.num_oyentes = num_oyentes;
        System.out.println("Se ha creado la emisora "+identificador);
    }
    public abstract double ganancias();
    public boolean estaEmitiendo(){
        return emitiendo;
    }

    public abstract String getNum_oyentes();
}
