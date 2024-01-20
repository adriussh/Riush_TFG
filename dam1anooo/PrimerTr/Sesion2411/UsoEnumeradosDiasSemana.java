package PrimerAnyo.PrimerTr.Sesion2411;

import java.util.Scanner;

public class UsoEnumeradosDiasSemana {
    public static void main(String[] args) {

        int valor=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor entre 1 y 7");
        valor = sc.nextInt();
        DiasSemana dia = null;
        switch (valor){
            case 1:
                System.out.println("Es "+dia.LUNES); break;
            case 2:
                System.out.println("Es "+dia.MARTES); break;
            case 3:
                System.out.println("Es "+dia.MIERCOLES); break;
            case 4:
                System.out.println("Es "+dia.JUEVES); break;
            case 5:
                System.out.println("Es "+dia.VIERNES); break;
            case 6:
                System.out.println("Es "+dia.SABADO); break;
            case 7:
                System.out.println("Es "+dia.DOMINGO); break;
            default:
                System.out.println("No se ha introducido el número correcto");
        }
    }
}
