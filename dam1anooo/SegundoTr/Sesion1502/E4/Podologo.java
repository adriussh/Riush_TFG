package PrimerAnyo.SegundoTr.Sesion1502.E4;

public class Podologo extends Medico{

    private String hospital;
    private int planta;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String ShowInfo(){
        return "*** Medico Cirujano. Nombre: "+getNombre()+". Apellidos: "+getApellidos()+". Numero de colegiado: "+getN_colegiado()+". Hospital: "+getHospital()+". Numero de planta: "+getPlanta()+".";
    }
}
