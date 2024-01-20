package PrimerAnyo.SegundoTr.Sesion0602.EjercicioPracticoII.Viajero;

import java.util.Scanner;

public class UsoViajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 MODALIDAD_objeto con constructor por defecto
        Viajero V1 = new Viajero();

        //2 MODALIDAD_objeto con constructor parametrizdo metiendole los valores en duro
        Viajero V2 = new Viajero("12313N", "Juan", "García Blanco", "Española", "Fuenlabrada");
        System.out.println("Introduzca su DNI");
        String dni = sc.nextLine();
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduzca sus apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Introduzca su nacionalidad");
        String nacionaldad = sc.nextLine();
        System.out.println("Introduzca su dirección");
        String direccion = sc.nextLine();

        //3 MODALIDAD_objeto creado con constructor parametrizando metiendole los valores que el usuario ha introducido por teclado.
        Viajero viajero3 = new Viajero(dni,nombre,apellidos,nacionaldad,direccion);

        //4 MODALIDAD_objeto creado con constructor por defecto y luego con los setteres vamos dandole valor
        Viajero viajero4= new Viajero();
        System.out.println("Introduzcame su dni");
        viajero4.setDNI(sc.nextLine());
        System.out.println("Introduzcame su nombre");
        viajero4.setNombre(sc.nextLine());
        System.out.println("Introduzcame sus apellidos");
        viajero4.setApellidos(sc.nextLine());
        System.out.println("Introduzca su nacionalidad");
        viajero4.setNacionalidad(sc.nextLine());
        System.out.println("Introduzcame su direccion");
        viajero4.setDireccion(sc.nextLine());

        System.out.println("Info del viajero 1");
        System.out.println("El nombre del viajero es "+V1.getNombre());
        System.out.println("Los apellidos del viajero es "+V1.getApellidos());
        System.out.println("El DNI del viajero es "+V1.getDNI());
        System.out.println("La nacionalidad del viajero es "+V1.getNacionalidad());
        System.out.println("La direccion del viajero es "+V1.getDireccion());

        System.out.println("¿Cuál es el formato de impresión para el viajero 2?");

        Formato formato = Formato.valueOf(sc.next().toLowerCase());
        V2.getInfo(formato);

        System.out.println("¿Cuál es el formato de impresión para el viajero 3?");

        Formato formato1 = Formato.valueOf(sc.next().toLowerCase());
        viajero3.getInfo(formato1);

        System.out.println("¿Cuál es el formato de impresión para el viajero 4?");

        Formato formato2 = Formato.valueOf(sc.next().toLowerCase());
        viajero4.getInfo(formato2);

    }
}
