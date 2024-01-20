package PrimerAnyo.PrimerTr.Sesion1011;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarElementosArrayEstatico {
    public static void main(String[] args) {
        int[] array1 = {1,2};
        int[] array1simul=new int[3];
        System.out.println("el array es "+ Arrays.toString(array1));
        System.arraycopy(array1,0,array1simul,0,array1.length);
        System.out.println("el array es "+Arrays.toString(array1simul));
        System.out.println("¿quieres insertar un nuevo elemento? ");
        Scanner sc = new Scanner(System.in);
        char opcion = sc.next().toLowerCase().charAt(0);
        if ((opcion=='s')){
            System.out.println("diga el numero");
            int newvalue = sc.nextInt();
            array1simul[array1simul.length-1]=newvalue;
            System.out.println("el array es "+Arrays.toString((array1simul)));
        }
        else{
            System.out.println("bye");
        }
    }
}
