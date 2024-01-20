package PrimerAnyo.SegundoTr.Sesion1502.E4;

public class Paciente {

    private String nombre;
    private String dni;

    public Paciente() {
    }

    public Paciente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String ShowInfo(){
        return "*** Paciente: Nombre: "+getNombre()+
                ". DNI: "+getDni()+".";
    }





}
