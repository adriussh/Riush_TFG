package PrimerAnyo.SegundoTr.Sesion1502.E4;

public class Cirujano extends Medico{

    private String hospital;
    private int n_box;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getN_box() {
        return n_box;
    }

    public void setN_box(int n_box) {
        this.n_box = n_box;
    }

    public String ShowInfo(){
        return "*** Medico Cirujano. Nombre: "+getNombre()+". Apellidos: "+getApellidos()+". Numero de colegiado: "+getN_colegiado()+". Hospital: "+getHospital()+". Numero de box: "+getN_box()+".";
    }
}
