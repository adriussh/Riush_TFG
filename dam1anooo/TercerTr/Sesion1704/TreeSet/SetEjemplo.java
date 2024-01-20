package PrimerAnyo.TercerTr.Sesion1704.TreeSet;

import java.util.*;

public class SetEjemplo {
    public static void main(String[] args) {
        /*System.out.println("Conjunto de TreeSet");
        TreeSet<Integer> conjunto_TS_numeros = new TreeSet<>();
        conjunto_TS_numeros.add(3);
        conjunto_TS_numeros.add(2);
        conjunto_TS_numeros.add(2);
        conjunto_TS_numeros.add(1);
        conjunto_TS_numeros.add(4);
        conjunto_TS_numeros.add(5);
        conjunto_TS_numeros.add(null);

        Iterator<Integer> itr3=conjunto_TS_numeros.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("Saca el menor "+conjunto_TS_numeros.first());
        System.out.println("Saca el mayor "+conjunto_TS_numeros.last());
        System.out.println("Conjunto TreeSet menores a 3");
        SortedSet<Integer> conjunto_TS_menores=conjunto_TS_numeros.headSet(3);
        Iterator<Integer> itr4=conjunto_TS_menores.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }
        System.out.println("Conjunto TreeSet descendente");
        Iterator<Integer> conjunto_TS_descendente = conjunto_TS_numeros.descendingIterator();

        while (conjunto_TS_descendente.hasNext()){
            System.out.println(conjunto_TS_descendente.next());
        }
        */

        TreeSet<Persona> conjunto_TS_persona = new TreeSet<>(Comparator.comparing(Persona::getNombre));
        conjunto_TS_persona.add(new Persona("Antonio", "32423244A", 25));
        conjunto_TS_persona.add(new Persona("Juan", "123456D", 35));
        conjunto_TS_persona.add(new Persona("Marco", "1234567B", 29));
        conjunto_TS_persona.add(new Persona("Javier", "1234567C", 23));
        Iterator<Persona> itr5 = conjunto_TS_persona.iterator();
        while (itr5.hasNext()) {
            System.out.println(itr5.next().getNombre());
        }
        System.out.println("TreeSet Descendente");
        Iterator<Persona> itr6 = conjunto_TS_persona.descendingIterator();
        while (itr6.hasNext()) {
            System.out.println(itr6.next().getNombre());
        }
    }
}
