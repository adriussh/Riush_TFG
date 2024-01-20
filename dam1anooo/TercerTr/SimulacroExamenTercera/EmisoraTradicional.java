package PrimerAnyo.TercerTr.SimulacroExamenTercera;

public class EmisoraTradicional extends Emisora{
    double num_frecuencia;
    Frecuencia frecuencia;

    public EmisoraTradicional(int num_emisora, String nombre_emisora, double beneficios, String frecuencia, double num_frecuencia) throws AccionInvalida {
        super(num_emisora, nombre_emisora, beneficios);
        if (Frecuencia.AM.equals(frecuencia.toUpperCase())||Frecuencia.FM.equals(frecuencia.toUpperCase())){
            this.frecuencia = Frecuencia.valueOf(frecuencia.toUpperCase());
        }
        else{
            throw new AccionInvalida("no ha introducido frecuencia correcta");
        }
    }

    public double getNum_frecuencia() {
        return num_frecuencia;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    @Override
    double ganancias() {
        return num_oyentes*0.023;
    }

    @Override
    public String toString() {
        return "EmisoraTradicional{" +
                "frecuencia=" + frecuencia +
                ", num_emisora=" + num_emisora +
                ", nombre_emisora='" + nombre_emisora + '\'' +
                ", emitiendo=" + emitiendo +
                ", beneficios=" + beneficios +
                ", num_oyentes=" + num_oyentes +
                "} " + super.toString();
    }
}
