package PrimerAnyo.SegundoTr.Sesion1502.E4;

public class DeFamilia extends Medico{

    private String nombre_centro_salud;

    public String getNombre_centro_salud() {
        return nombre_centro_salud;
    }

    public void setNombre_centro_salud(String nombre_centro_salud) {
        this.nombre_centro_salud = nombre_centro_salud;
    }

    public String ShowInfo(){
        return "*** Medico Cirujano. Nombre: "+getNombre()+". Apellidos: "+getApellidos()+". Numero de colegiado: "+getN_colegiado()+". Nombre centro de salud: "+getNombre_centro_salud()+".";
    }
}
