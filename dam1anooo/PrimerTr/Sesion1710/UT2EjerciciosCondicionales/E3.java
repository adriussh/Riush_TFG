package PrimerAnyo.PrimerTr.Sesion1710.UT2EjerciciosCondicionales;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        int hora=0;
        System.out.println("Introduzca una hora");
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();
        if (hora>6&&hora<=12) {
            System.out.println("Bueno dia");
        }

        if (hora>13 && hora<=20){
            System.out.println("buena tarde");
        }
        else {
            System.out.println("Good night");
        }
    }
}
