package PrimerAnyo.TercerTr.Sesion1704.EjerciciosSet.E1;

public class UsoHashSetJugadores {
    public static void main(String[] args) {
        HashSetJugador obj = new HashSetJugador();
        obj.initialize();
        Jugador jugador = new Jugador("B",33,"DELANTERO");
        obj.add(jugador);
        if (obj.contains(jugador)) {
            System.out.println("El jugador esta contenido");
        } else {
            System.out.println("El jugador no esta contenido");
        }
        System.out.println("Añadir nuevo conjunto");
        obj.add2();
        System.out.println("Unir ambos conjuntos");
        obj.merge();
        System.out.println("Mostrar ambos conjuntos");
        obj.showBetis();
    }
}
