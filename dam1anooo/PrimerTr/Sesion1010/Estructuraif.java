package PrimerAnyo.PrimerTr.Sesion1010;

import java.util.Scanner;

public class Estructuraif {
    public static void main(String[] args) {
        int a, b, mayor, menor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a");
        a = sc.nextInt();

        System.out.println("Introduzca e valor de b");
        b = sc.nextInt();
        mayor = a;
        menor = b;
        if (a < b) {
            mayor = b;
            menor = a;

        }
        if (a == b){
            System.out.println("Los numeros son iguales");
        }
        System.out.println("El mayor es "+mayor+" y el menor es "+menor);

    }
}
