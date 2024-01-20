package PrimerAnyo.PrimerTr.Sesion1710.UT2EjerciciosCondicionales;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        float suma, media, nota_1, nota_2, nota_3;
        System.out.println("> Se calculará la media de 3 notas las cuales usted tendra que introducir <");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca la primera");
            nota_1 = sc.nextFloat();
        } while (nota_1<=0);
        do {
            System.out.println("Introduzca la segunda");
            nota_2 = sc.nextFloat();
        } while (nota_2<=0);
        do {
            System.out.println("Introduzca la tercera y ultima nota");
            nota_3 = sc.nextFloat();
        } while (nota_3<=0);
        suma=nota_1+nota_2+nota_3;
        media=suma/3;
        System.out.println("La media de las notas es: "+media);
        if (media>=1 && media<=4.9) {
            System.out.println("Insuficiente");
        } else if (media>=5 && media<=5.9) {
            System.out.println("Bien");


        }
    }
}