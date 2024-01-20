package PrimerAnyo.PrimerTr.Sesion2811;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //declaracion variables
        int base, exponente=0;

        //solicitar los datos y asignarles PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a las variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base");
        base = sc.nextInt();
        System.out.println("Introduzca el exponente");
        exponente = sc.nextInt();
        double resultado = calcularPotencia(base,exponente);
        imprimir(resultado);
    }

    private static void imprimir(double resultado) {
        System.out.println("La potencia es "+resultado);
    }

    private static double calcularPotencia(int base, int exponente) {
        double resultado=0;

        resultado = Math.pow(base,exponente);

        return resultado;
    }
}
