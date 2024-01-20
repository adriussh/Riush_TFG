package PrimerAnyo.TercerTr.Sesion2604.EjArrayList2.E3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Persona> listado_personas = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        do {
            System.out.println("0. Salir programa");
            System.out.println("1. Añadir persona arraylist");
            System.out.println("2. Buscar persona por DNI");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Ordenar por apellidos");
            System.out.println("5. Ordenar por apellidos ascendente y sexo");
            System.out.println("6. Mostrar ArrayList");
            System.out.println("esperando opcion........");
            opcion=sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Muchas thenkius por use this");break;
                case 1:
                    add();break;
                case 2:
                    System.out.println("Introducir el dni del usuario");
                    String dni = sc.next();
                    search(dni);break;
                case 3:
                    System.out.println("Introducir el dni del usuaro");
                    dni = sc.next();
                    remove(dni);break;
                case 4:
                    order();break;
                case 5:
                    order2();break;
                case 6:
                    showArray();break;
                default:
                    System.out.println("Elijio una opshion incorrecta");break;
            }
        }while (opcion!=0);
        listado_personas.add(new Persona("12345D","Jose Jorge", "Calles Quevedo", 'H', 22, 60.3));
        listado_personas.add(new Persona("54321A", "Marco Antonio", "Suarez", 'H',44,65.3));
    }

    private static void order2() {
        System.out.println("Ordenacion por apellido y sexo");
        listado_personas.sort(Comparator.comparing(Persona::getApellidos).thenComparing(Persona::getSexo));
        showArray();
    }

    private static void order() {
        System.out.println("Ordenacion por apellido");
        listado_personas.sort(Comparator.comparing(Persona::getApellidos));
    }

    private static void showArray() {
        for (Persona p:listado_personas) {
            System.out.println(listado_personas.toString().toString());
        }
    }

    private static void remove(String dni) {
        for (Persona p:listado_personas){
            if (p.getDni().equals(dni)){
                listado_personas.remove(p);
            }
        }
    }

    private static void search(String dni) {
        boolean esta = false;
        for (Persona p:listado_personas) {
            if (p.getDni().equals(dni)){
                esta=true;break;
            }
        }
        if (esta) {
            System.out.println("El dni "+dni+" esta en el array list");
        }else {
            System.out.println("Los sentimos pero el dni "+dni+" no se encuentra en el array list");
        }
    }

    private static void add() {
        System.out.println("Introduzca el DNI de la persona");
        String dni = sc.next();
        System.out.println("Introduzca el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido de la persona");
        String apellido = sc.next();
        System.out.println("Introduzca el sexo H o M");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Introduzca la edad de la persona");
        int edad = sc.nextInt();
        System.out.println("Introduzca el peso de la persona");
        double peso = sc.nextDouble();
        listado_personas.add(new Persona(dni,nombre,apellido,sexo,edad,peso));
    }
}
