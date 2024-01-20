package PrimerAnyo.SesionesGrupales.TercerTr;

import java.util.Vector;

public class Sesion1404 {
    public static void main(String[] args) {
        Vector<Integer> miVector = new Vector<Integer>(3, 2);
// Agregar tres elementos al Vector

        System.out.println("------------------- AÑADIR -------------------");

        miVector.add(1);
        miVector.add(2);
        miVector.add(3);
        System.out.println("Capacidad inicial: " + miVector.capacity());
        miVector.add(40);
        System.out.println("Capacidad al añadir un elemento más: " + miVector.capacity());
        System.out.println("Mi Vector: " + miVector);

        System.out.println("------------------- ELIMINAR -------------------");

        miVector.remove(3);
        System.out.println("Capacidad al eliminar un elemento: " + miVector.capacity());
        System.out.println("Mi Vector: " + miVector);

        System.out.println("------------------- BUSCAR -------------------");

        Vector<String> miVector2 = new Vector<String>();
        miVector2.add("Hola");
        miVector2.add("Clase");
        miVector2.add("!");
        System.out.println("Mi Vector 2: " + miVector2);


        // Buscar un elemento en el Vector
        String elementoBuscado = "Clase";
        int indice = miVector2.indexOf(elementoBuscado);

        // Imprimir el resultado
        if (indice == -1) {
            System.out.println("El elemento " + elementoBuscado + " no está en el Vector");
        } else {
            System.out.println("El elemento " + elementoBuscado + " está en el índice " + indice + " del Vector");
        }
    }
}
