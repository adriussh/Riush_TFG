package PrimerAnyo.PrimerTr.Sesion0911;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //declaración del array.
        /*este array almacenará las notas de las asignaturas del primer trimestre de DAM:
        BD, ED, PROG, LM, SI, FOL.
         */
        //primera forma de inicialización (no es optima)
        int[] notas_primer_tr = new int[2];

        notas_primer_tr[0]=2;
        notas_primer_tr[1]=3;
        notas_primer_tr[2]=6;
        notas_primer_tr[3]=9;
        notas_primer_tr[4]=8;

        //segunda forma de inicialización (no es optimo)
        int[] notas_segundo_tr = {0, 1, 2, 3, 4};

        //tercera forma de inicializacion (optima)
        int[] notas_tercer_tr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas_tercer_tr.length; i++)
        {
            System.out.println("Introduzca su nota");
            notas_tercer_tr[i]= sc.nextInt();
        }
    }
}
