package PrimerAnyo.PrimerTr.Sesion1011;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarElementosArrayEstatico {

    public static void main(String[] args) {
        int[] lista = {1, 2, 3};
        int[] nuevalista = new int[2];
        System.out.println("el array es: " + java.util.Arrays.toString(lista));
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que valor de los mostrados desea eliminar?");
        int valor = sc.nextInt();
        int posicion = java.util.Arrays.binarySearch(lista, valor);
        if (posicion<-1) {
            System.out.println("Introduzca un valor dentro del rango");
        }
        else{
            int remainingElements = lista.length - (posicion + 1);
            System.arraycopy(lista,0,nuevalista,0,posicion);
            System.arraycopy(lista, posicion+1,nuevalista,posicion,remainingElements);

            System.out.println("Se elimino el valor");
            System.out.println("Nuevo rango: "+Arrays.toString(nuevalista));
        }
    }
}