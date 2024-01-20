package PrimerAnyo.TercerTr.Sesion1704.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPersona {
    public static void main(String[] args) {
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
