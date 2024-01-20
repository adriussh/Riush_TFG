package PrimerAnyo.PrimerTr.Sesion1710.UT2EjerciciosCondicionales;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {

        double h=0;
        double t=0;
        final double G=9.81;

        System.out.println("vamos PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a calcular el tiempo q tarda en caer un objeto PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a partir de la formula t=√2h/g (g=9.81 m/s^2");
        System.out.println("Introduzca la altura (h)");
        Scanner sc = new Scanner(System.in);
        h = sc.nextDouble();

        double raiz=Math.sqrt(2*h/G);
        t=raiz;

        System.out.println("el tiempo que tarda en caer es "+t+" s");
    }
}
