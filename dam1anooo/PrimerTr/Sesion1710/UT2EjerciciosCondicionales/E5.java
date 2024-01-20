package PrimerAnyo.PrimerTr.Sesion1710.UT2EjerciciosCondicionales;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {
        //ax+b = 0
        float a = 0;
        float b = 0;
        float X = 0;
        System.out.println("Calcular el valor de X en la ecuacion de primer grado ax+b = 0");
        System.out.println("Introduzca el valor de PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        System.out.println("Introduzca el valor de b");
        b = sc.nextFloat();
        X=b/a;
        System.out.println("El valor de X es: "+X);
    }
}