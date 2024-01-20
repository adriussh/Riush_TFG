package PrimerAnyo.ExtraFinalCurso.Sesion0106ExamenTercera;

import java.util.Date;

public class Hotel extends Inmueble{
    boolean isPetFriendly;

    public Hotel(int identificador, String nombre, int anyo_edificacion, String direccion, double m2, boolean isPetFriendly) throws AccionInvalida {
        super(identificador, nombre, anyo_edificacion, direccion, m2);
        this.isPetFriendly = isPetFriendly;
    }

    public boolean isPetFriendly() {
        return isPetFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        isPetFriendly = petFriendly;
    }

    @Override
    public double calcular_ibi() {
        Date date = new Date();
        return m2*100+50*(date.getYear()-anyo_edificacion);
    }
}
