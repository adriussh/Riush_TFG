package PrimerAnyo.ExamenRecup2021;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int opcion=0;
        do {
            System.out.println("1.Sumatorio");
            System.out.println("2.Invertir array");
            System.out.println("3.Salir");
            System.out.println("Elija una opción...");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion){
                case 1: sumatorio();
                case 2: invertir_array();break;
                case 3: System.out.println("Gracias por usar la aplicacion");break;
                default: System.out.println("Ha introducido una opción incorrecta");
            }

        } while (opcion!=3);
    }

    private static void invertir_array() {
        Scanner sc = new Scanner(System.in);
        double[] array;
        System.out.println("Introduzca la dimensión del array");
        int dimension = sc.nextInt();
        array= new double[dimension];
        for (int i=0;i<array.length;i++){

            System.out.println("Introduzca el valor"+i);
            array[i]= sc.nextDouble();
        }

        System.out.println("el array sin invertir es"+ Arrays.toString(array));
        double[] array_invertido=new double[dimension];
        for (int i=0;i<array.length;i++){

            array_invertido[i]=array[array.length-1-i];

        }
        System.out.println("el array invertido es"+ Arrays.toString(array_invertido));


    }

    private static void sumatorio() {
        int numero,resultado=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca un número entero positivo");
            numero = sc.nextInt();
            for (int i=0;i<=numero;i++){
                resultado = resultado+i;
            }
        }while (numero<0);
        System.out.println("El sumatorio de "+numero+" es "+resultado);



    }

}
