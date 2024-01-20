package PrimerAnyo.PrimerTr.Sesion1710.UT2EjerciciosCondicionales;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        int horas_semanales=0;
        int salario=0;
        System.out.println("Introduzca el total de horas semanales de su empleo");
        Scanner sc = new Scanner(System.in);
        horas_semanales = sc.nextInt();
        if (horas_semanales <= 40) {
            salario=horas_semanales*12;
            System.out.println("Este es su salario: "+salario);
        } else if (horas_semanales >40) {
            salario=horas_semanales*16;
            System.out.println("Este es su salario: "+salario);
        }
    }
}
