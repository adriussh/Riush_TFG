package PrimerAnyo.PrimerTr.Sesion1710.UT2EjerciciosCondicionales;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        int dia_semana = 0;

        System.out.println("Para usted saber que asignaturas tiene PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a primera hora esta semana introduzca un valor entre el 1 y el 7.");
        Scanner sc = new Scanner(System.in);
        dia_semana = sc.nextInt();
        switch (dia_semana) {
            case 1:
                    System.out.println("El lunes toca mate PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a primera");break;
            case 2:
                    System.out.println("El martes toca lengua PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a primera");break;
            case 3:
                    System.out.println("El lunes toca lengua PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a primera");break;
            case 4:
                    System.out.println("El lunes toca ingles PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a primera");break;
            case 5:
                    System.out.println("El lunes toca historia PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a primera");break;
            case 6:
                    System.out.println("Es finde");break;
            case 7:
                    System.out.println("Es finde");break;
            default:
                System.out.println("es incorrecto");break;
        }
    }
}
