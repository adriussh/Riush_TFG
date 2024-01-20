package PrimerAnyo.PrimerTr.Sesion1310;

import java.util.Scanner;

public class ForIncrementalDecremental {

    public static void main(String[] args) {
        //inicialización variable
        int a=0;
        //solicitud al usuario introduzca valor variable
        System.out.println("Introduzca el valor hasta el que hay que contar");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        //bucle incremental
        for (int i=1; i<=a; i++)
        {
            System.out.println(i);
        }

        //Bucle decremental
        for (int j=a; j>0; j--)
        {
            System.out.println(j);
        }
    }
}
