package PrimerAnyo.PrimerTr.Sesion2811;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        double primerval=0;
        double segundoval=0;
        String opcion="";

        System.out.println("--------------------------------------------");
        System.out.println("* Area circulo: introduzca 'circulo'");
        System.out.println("* Area triangulo: introduzca 'triangulo'");
        System.out.println("* Area cuadrado: introduzca 'cuadrado'");
        System.out.println("--------------------------------------------");

        Scanner sc = new Scanner(System.in);
        opcion = sc.next().toLowerCase();

        switch (opcion){
            case "circulo":
                double resultadoA=areacirc(opcion);
                System.out.println("El area es: "+resultadoA);
                break;

            case "triangulo":
                double resultadoB=areatrian(opcion);
                System.out.println("El area es: "+resultadoB);
                break;

            case "cuadrado":
                double resultadoC=areacuadrado(opcion);
                System.out.println("El area es: "+resultadoC);
                break;

            default:
                System.out.println("Inserte una opcion valida");
                break;
        }

    }

    private static double areacuadrado(String opcion) {
        double lado=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de un lado del cuadrado");
        lado = sc.nextDouble();
        double resultadoAREACUADRADO=lado*lado;

        return resultadoAREACUADRADO;
    }

    private static double areatrian(String opcion) {
        double base=0;
        double altura=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de la base");
        base = sc.nextDouble();
        System.out.println("Introduzca el valor de la altura");
        altura = sc.nextDouble();
        double resultadoAREATRIANGULO = (base*altura)/2;

        return resultadoAREATRIANGULO;
    }

    private static double areacirc(String opcion) {
        double radio=0;
        System.out.println("Introduzca el valor del radio");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextDouble();
        double resultadoAREACIRCULO = Math.pow(radio,2)*Math.PI;

        return resultadoAREACIRCULO;
    }
}
