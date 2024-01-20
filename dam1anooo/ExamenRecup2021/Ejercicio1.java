package PrimerAnyo.ExamenRecup2021;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto="";
        texto=solicitartexto(texto);
        String[] array;
        array= hacerarray(texto);
        System.out.println("el texto convertido a array es"+ Arrays.toString(array));
        int[] arrayenteros =convertirarray(array);
        System.out.println("el nuevo array de enteros es"+ Arrays.toString(array));
        int suma = sumarvalores(arrayenteros);
        System.out.println("la suma del array de enteros es"+suma);
    }

    private static int sumarvalores(int[] arrayenteros) {
        int resultado=0;
        for (int i=0;i<arrayenteros.length;i++){
           resultado=resultado+ arrayenteros[i];
        }


        return resultado;
    }

    private static int[] convertirarray(String[] array) {
        int[] arrayenteros = new int[array.length];
        for (int i=0;i<array.length;i++){
            arrayenteros[i]=Integer.parseInt(array[i]);
        }
        return arrayenteros;
    }

    private static String[] hacerarray(String texto) {
        String[] array = texto.split(";");
        return array;
    }

    private static String solicitartexto(String texto) {
        System.out.println("Escriba numeros separados por ;");
        Scanner sc = new Scanner(System.in);
        texto=sc.next();
        return texto;
    }
}
