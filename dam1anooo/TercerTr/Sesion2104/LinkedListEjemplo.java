package PrimerAnyo.TercerTr.Sesion2104;

import java.util.LinkedList;

public class LinkedListEjemplo {
    public static void main(String[] args) {
        LinkedList<Integer> cola = new LinkedList<>();
        cola.addLast(1);
        cola.add(2);
        cola.addFirst(3);
        System.out.println(cola.toString());
        System.out.println("Eliminar primero de la cola "+cola.remove());
        System.out.println(cola.add(3));
        System.out.println(cola.toString());
        System.out.println("Eliminar la ocurrencia primera "+cola.removeFirstOccurrence(1));
    }
}
