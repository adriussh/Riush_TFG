package PrimerAnyo.SegundoTr.Sesion0602.EjercicioPracticoII.Viajero;

import java.util.Scanner;

public class Viajero {

    public static int contador;
    public String DNI;
    public String Nombre;
    public String Apellidos;
    public String Nacionalidad;
    public String Direccion;

    private static int num_ojos=2;



    public Viajero(String DNI, String Nombre, String Apellidos, String Nacionalidad, String Direccion){
        this.DNI=DNI;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Nacionalidad=Nacionalidad;
        this.Direccion=Direccion;
        contador++;
    }

    public Viajero() {
        contador++;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void getInfo(Formato modo){
        Scanner sc = new Scanner(System.in);
        String entrada="";
        switch (modo){
            case normal:
                System.out.println("El DNI del pasajero es "+DNI);
                System.out.println(("Su nombre es "+Nombre));
                System.out.println("Su apellido "+Apellidos);
                System.out.println("Su nacionalidad "+Nacionalidad);
                System.out.println("Su dirección "+Direccion);
                break;
            case pausado:
                System.out.println("El DNI del pasajero es "+DNI);
                entrada=sc.nextLine();
                System.out.println(("Su nombre es "+Nombre));
                entrada=sc.nextLine();
                System.out.println("Su apellido "+Apellidos);
                entrada=sc.nextLine();
                System.out.println("Su nacionalidad "+Nacionalidad);
                entrada=sc.nextLine();
                System.out.println("Su dirección "+Direccion);
                entrada=sc.nextLine();
            default:
                System.out.println("ta mal.");break;
        }
    }
}
