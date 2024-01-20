package PrimerAnyo.PrimerTr.Sesion1310;

import java.util.Scanner;

public class EstructuraWhile {

    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero desde el que se vamos PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a contar hasta 100");
        numero = sc.nextInt();

        if (numero > 100)
        {
            System.out.println("Introdujo un numero superior PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a 100");

        }

        while (numero<=100)
        {
            System.out.println(numero);
            numero++;

        }
    }
}
