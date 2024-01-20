package PrimerAnyo.PrimerTr.Sesion0311.PracticaUT2_Calculadora;

import java.util.Scanner;

public class Simulacion {

    public static void main(String[] args) {

        float valor1 = 0;
        float valor2 = 0;
        String opcion = "";
        System.out.println("Welcome PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a la calculadora");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el primer número con el que quiere operar");
        valor1 = sc.nextFloat();
        System.out.println("Inserte el segundo número con el que quiere operar");
        valor2 = sc.nextFloat();
        Calculadora calculadora = new Calculadora();
        System.out.println("¿Que desea calcular con estos números?");
        opcion = sc.next();
        switch (opcion) {
            case "suma": {
                if (opcion.equals("suma")) {
                    System.out.println(calculadora.suma(valor1, valor2));
                }
            }
            case "resta": {
                if (opcion.equals("resta")) {
                    System.out.println(calculadora.resta(valor1, valor2));
                }
            }
            case "multiplicacion": {
                if (opcion.equals("multiplicacion")) {
                    System.out.println(calculadora.multiplicacion(valor1, valor2));
                }
            }
            case "division": {
                if (opcion.equals("division")) {
                    System.out.println(calculadora.division(valor1, valor2));
                }
            }
        }
    }
}
