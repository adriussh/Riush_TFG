package PrimerAnyo.TercerTr.Sesion2604.EjArrayList2.E2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //arraylist
        ArrayList<E2Alumno> lista_alumnos = new ArrayList<>();
        //creacion alumnos
        E2Alumno al1 = new E2Alumno("Jose Jorge",9);
        E2Alumno al2 = new E2Alumno("Adriush",11);
        E2Alumno al3 = new E2Alumno("Chema",6);

        //añadir alumnos al arraylist
        lista_alumnos.add(al1);
        lista_alumnos.add(new E2Alumno("Biley",8));
        lista_alumnos.add(new E2Alumno("Elias", 6));

        System.out.println("Ordenacion por orden alfabeticos ascendente");
        lista_alumnos.sort(Comparator.comparing(E2Alumno::getNombre));
        System.out.println(lista_alumnos.toString());
        System.out.println("Ordenacion por orden alfabeticos descendente");
        lista_alumnos.sort(Comparator.comparing(E2Alumno::getNombre).reversed());
        System.out.println(lista_alumnos.toString());
        System.out.println("Ordenacion por nota ascendente");
        lista_alumnos.sort(Comparator.comparingDouble(E2Alumno::getNota));
        System.out.println(lista_alumnos.toString());
        System.out.println("Ordenacion por nota descendente");
        lista_alumnos.sort(Comparator.comparingDouble(E2Alumno::getNota).reversed());
        System.out.println(lista_alumnos.toString());
        System.out.println("Ordenacion por ambas");
        lista_alumnos.sort(Comparator.comparing(E2Alumno::getNombre).thenComparing(E2Alumno::getNota));
        System.out.println(lista_alumnos.toString());
        System.out.println("Ordenacion por ambas, nota descendente");
        lista_alumnos.sort(Comparator.comparing(E2Alumno::getNombre).reversed().thenComparing(E2Alumno::getNota));
        System.out.println(lista_alumnos.toString());

    }
}
