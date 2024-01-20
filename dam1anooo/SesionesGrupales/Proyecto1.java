package PrimerAnyo.SesionesGrupales;

import java.util.Scanner;

    //Javier Almendro y Alejandro Carasa.
    public class Proyecto1 {

        public static void main(String[] args) {
            //Inicializacion de varibles.
            int num = 0;
            //Activación escaner para informaci´pn de entrada.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enseñaremos las fichas del domino");
            System.out.println("Introduzca un numero menor o igual que 12");
            num = sc.nextInt();
            //Inicio If's.
            if (num == 0)
                System.out.printf("la representacion de cero es:\ud83c\udc38");
            if (num == 1)
                System.out.printf("la representacion de uno es:\ud83c\udc32");
            if (num == 2)
                System.out.printf("la representacion    de dos es:\ud83c\udc33");
            if (num == 3)
                System.out.printf("la representacion de tres es:\ud83c\udc34");
            if (num == 4)
                System.out.printf("la representacion de cuatro es:\ud83c\udc35");
            if (num == 5)
                System.out.printf("la representacion de cinco es:\ud83c\udc36");
            if (num == 6)
                System.out.printf("la representacion de seis es:\ud83c\udc37");
            if (num == 7)
                System.out.printf("la representacion de siete es:\ud83c\udc3e");
            if (num == 8)
                System.out.printf("la representacion de ocho es:\ud83c\udc45");
            if (num == 9)
                System.out.printf("la representacion de nueve es:\ud83c\udc4c");
            if (num == 10)
                System.out.printf("la representacion de diez es:\ud83c\udc53");
            if (num == 11)
                System.out.printf("la representacion de once es:\ud83c\udc5a");
            if (num == 12)
                System.out.printf("la representacion de doce es:\ud83c\udc61");
            else
                if (num>12)
                System.out.println("Ha introducido un valor incorrecto. Debe de introducir un valor menor o igual PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a 12");
        }
    }
