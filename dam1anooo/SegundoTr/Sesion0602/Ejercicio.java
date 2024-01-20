package PrimerAnyo.SegundoTr.Sesion0602;

import java.util.Random;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Random numero = new Random();
        int numero1 = numero.nextInt();
        int numero2 = numero.nextInt();
        System.out.println("El primer numero es "+numero1);
        System.out.println("El segundo numero es "+numero2);
        System.out.println("El maximo es "+Math.max(numero1, numero2));
    }
}
