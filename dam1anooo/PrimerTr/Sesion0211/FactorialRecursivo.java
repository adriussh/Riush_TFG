package PrimerAnyo.PrimerTr.Sesion0211;

import java.util.Scanner;

public class FactorialRecursivo {
    public static long factorialRecursivo (long numero) {
        if (numero <=1)
            return 1;
        return numero * factorialRecursivo(numero - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero el cual desea calcular el factorial");
        long numero = 0;
        numero = sc.nextLong();
        System.out.println("El factorial de "+numero+" es "+factorialRecursivo(numero));
    }
}

