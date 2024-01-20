package PrimerAnyo.TercerTr.Sesion0805;

public class Jugador {
    private String dni;
    private String Nombre_jugador;
    private int dorsal_camiseta;
    private double salario;
    private int edad;

    public Jugador(String dni, String Nombre_jugador, int dorsal_camiseta, double salario, int edad) {
        this.dni = dni;
        this.Nombre_jugador = Nombre_jugador;
        this.dorsal_camiseta = dorsal_camiseta;
        this.salario = salario;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_jugador() {
        return Nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.Nombre_jugador = nombre_jugador;
    }

    public int getDorsal_camiseta() {
        return dorsal_camiseta;
    }

    public void setDorsal_camiseta(int dorsal_camiseta) {
        this.dorsal_camiseta = dorsal_camiseta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dni='" + dni + '\'' +
                ", Nombre_jugador='" + Nombre_jugador + '\'' +
                ", dorsal_camiseta=" + dorsal_camiseta +
                ", salario=" + salario +
                ", edad=" + edad +
                '}';
    }
}
