package PrimerAnyo.PrimerTr.Sesion2811;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        final double YENES  = 129.852;
        final double LIBRAS =0.86 ;
        String opcion = "";
        double monto = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------Cambio de divisas-------------------------------------");
        System.out.println("Introduzca el monto del que desea conocer el valor al cambio");
        monto = sc.nextDouble();
        System.out.println("A que moneda desea cambiarlo");
        opcion = sc.next();
        switch (opcion){
            case "DOLAR":
                cambiodolar(monto);

            case "YENES":

            case "LIBRAS":
        }

    }

    private static void cambiodolar(double monto) {
        final double DOLAR  = 1.28611;
        double cambioA=monto*DOLAR;
        System.out.println("Al cambio el valor del dinero introducido es: "+cambioA);
    }
}
