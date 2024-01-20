package PrimerAnyo.TercerTr.Sesion2604.EjArrayList2.E3;

public class Persona {
    String dni;
    String nombre;
    String apellidos;
    char sexo;
    int edad;
    double peso;

    public Persona(String dni, String nombre, String apellidos, char sexo, int edad, double peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
