package PrimerAnyo.PrimerTr.Sesion1010;

import java.util.Scanner;

public class EstructuraIfAnidado {

    public static void main(String[] args) {
        int cv=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los caballos de fuerza de su vehiculo");
        cv = sc.nextInt();
        if (cv>=20 && cv<=70) {
            System.out.println("Vehiculo de bajos caballos de fuerza");
        }
        else if (cv>=70 && cv<=100) {
            System.out.println("Vehiculo con cantidad media de caballos de fuerza");
        }
        else if (cv>=100 && cv<=150) {
            System.out.println("Vehiculo con bastantes caballos de fuerza");
        }
        else if (cv>=150 && cv<=450) {
            System.out.println("Vehiculo con una cantidad de caballos de fuerza fuera de la media");
        }
    }
}
