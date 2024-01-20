package PrimerAnyo.TercerTr.Sesion1704.EjerciciosSet.E1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJugador {
    HashSet<Jugador> FCBetis = new HashSet<>();
    HashSet<Jugador> conjunto2 = new HashSet<>();

    public void initialize(){
        FCBetis.add(new Jugador("Luis Felipe",22,"DEFENSA"));
        System.out.println("Coleccion insertada correctamente");
    }
    public void add(Jugador jugador){
        FCBetis.add(jugador);
    }

    public void showBetis(){
        Iterator<Jugador> itr1 = FCBetis.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.toString());
        }
    }

    public boolean contains(Jugador jugador){
        boolean existe=false;
        if (FCBetis.contains(jugador)){
            existe=true;
        }
        return existe;
    }

    public void add2(){
        conjunto2.add(new Jugador("C",24,"CENTROCAMPISTA"));
    }

    public void compare(){
        if (FCBetis.containsAll(conjunto2)){
            System.out.println("Los jugadores del conjunto 2 estan contenidos.");
        } else {
            System.out.println("Los jugadores no estan contenidos");
        }
    }

    public void merge(){
        FCBetis.addAll(conjunto2);
    }

    public void remove(){
        FCBetis.clear();
    }
}
