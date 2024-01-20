package PrimerAnyo.PrimerTr.Sesion2411;

import java.util.Scanner;

public class RegistroNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[2][3];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (i==0) {
                    switch (j){
                        case 0:
                            System.out.println("Introduzca la nota de la primera práctica de programación"); notas[i][j] = sc.nextInt(); break;
                        case 1:
                            System.out.println("Introduzca la nota de la segunda práctica de programación"); notas[i][j] = sc.nextInt(); break;
                        case 2:
                            System.out.println("Introduzca la nota examen de programación"); notas[i][j] = sc.nextInt(); break;
                    }
                }
                if (i==1) {
                    switch (j){
                        case 0:
                            System.out.println("Introduzca la nota de la primera práctica de BBDD"); notas[i][j] = sc.nextInt(); break;
                        case 1:
                            System.out.println("Introduzca la nota de la segunda práctica de BBDD"); notas[i][j] = sc.nextInt(); break;
                        case 2:
                            System.out.println("Introduzca la nota examen de BBDD"); notas[i][j] = sc.nextInt(); break;
                    }
                }
            }
        }
        System.out.println("------ MENÚ -------");
        System.out.println("1- Media de asignaturas");
        System.out.println("2- Media de ambas asignaturas");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:

            case 2:

        }
    }
}