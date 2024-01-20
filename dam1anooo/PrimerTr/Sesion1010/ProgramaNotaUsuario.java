package PrimerAnyo.PrimerTr.Sesion1010;

import java.util.Scanner;

public class ProgramaNotaUsuario {

    public static void main(String[] args) {
        int nota=0;
        Scanner sc= new Scanner(System.in);
        nota = sc.nextInt();

        if (nota>=0 && nota<=4.99)
            System.out.println("Suspenso");

        else if (nota>=5 && nota<=5.99)
            System.out.println("Aprobao'");

        else if (nota>=6 && nota<=6.99)
            System.out.println("Bien");

        else if (nota>=6 && nota<=8.99)
            System.out.println("Notable");

        else if (nota>=9 && nota<=9.99)
            System.out.println("Sobresaliente");

        else if (nota>=10)
            System.out.println("M.H");
    }
}
