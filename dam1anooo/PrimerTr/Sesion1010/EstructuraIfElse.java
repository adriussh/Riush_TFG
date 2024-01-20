package PrimerAnyo.PrimerTr.Sesion1010;

import java.util.Scanner;

public class EstructuraIfElse {
    public static void main(String[] args) {
        int a, b, mayor, menor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a");
        a = sc.nextInt();

        System.out.println("Introduzca e valor de b");
        b = sc.nextInt();
        mayor = a;
        menor = b;
        if (a == b) {

            System.out.println("Los numeros son iguales");
        } else {
            if (a > b) {
                mayor = a;
                menor = b;

            } else {
                mayor = b;
                menor = a;

            }
            System.out.println("El mayor es " +mayor+ " y el meno es " +menor);
        }
    }
}