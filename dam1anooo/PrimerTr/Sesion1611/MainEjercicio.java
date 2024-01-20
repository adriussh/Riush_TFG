package PrimerAnyo.PrimerTr.Sesion1611;

import java.util.Arrays;
import java.util.Scanner;

public class MainEjercicio {

    public static void main(String[] args) {
        String[] nombres={"Elena","Marta","Sofia"};
        int posicion = -1; //se inicializa PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a -1 porque empieza PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a leer desde 0.
        String busca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que nombre quieres buscar");
        busca = sc.next();
        posicion = buscar(nombres,busca);
        imprimir(posicion,busca,nombres);
    }

    private static void imprimir(int posicion, String nombre, String[] nombres) {
        System.out.println("el arrays introducido es: "+ Arrays.toString(nombres));
        if (posicion==-1){
            System.out.println("la posicion no es la que buscabas");
        }
        else{
            System.out.println(nombre+" esta en la posicion "+posicion);
        }
    }

    private static int buscar (String[] nombres, String busca) {
        int posicion=-1;
        for (int i=0; i<nombres.length; i++)
            if (busca.equals((nombres[i]))){
                posicion = i;
            }
        return posicion;
    }
}
