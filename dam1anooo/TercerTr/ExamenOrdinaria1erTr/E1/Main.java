package PrimerAnyo.TercerTr.ExamenOrdinaria1erTr.E1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        String[] array = null;
        int dimension = 0;
        do {
            System.out.println("0. Salir.");
            System.out.println("1. Crear array estatico de tipo String");
            System.out.println("2. Rellenar array estatico con elementos.");
            System.out.println("3. Imprimir array estatico por pantalla.");
            System.out.println("4. Ver número de consonantes.");
            System.out.println("5. Ver número de vocales.");
            System.out.println("Introduzca opción.");
            opcion=sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Bye's");break;
                case 1:
                    System.out.println("Introduzca el tamaño que desea dimensionar el array");
                    dimension = sc.nextInt();
                    array=crear_array(array,dimension);break;
                case 2:
                    array=rellenar_array(array);break;
                case 3:
                    String resultado=imprimir_array(array);
                    System.out.println(resultado);break;
                case 4:
                    System.out.println("Indique la posición de la palabra de la que quiere saber la cantidad de consonantes");
                    int pos=sc.nextInt();
                    int numeroConsonantes=calcula_consonantes(pos,array);
                    System.out.println("la palabra "+array[pos]+" tiene "+numeroConsonantes+" consonantes");break;
                case 5:
                    System.out.println("Indique la posición de la palabra de la que quiere saber la cantidad de consonantes");
                    pos=sc.nextInt();
                    int numeroVocales=calcula_vocales(pos,array);
                    System.out.println("la palabra "+array[pos]+" tiene "+numeroVocales+" vocales");break;
                default:
                    System.out.println("Opcion incorrecta");break;
            }

        }while (opcion!=0);
    }

    private static int calcula_vocales(int pos, String[] array) {
        String palabra_rescatada = array[pos];
        int contador=0;

        for (int i=0; i<palabra_rescatada.length(); i++){
            if (palabra_rescatada.charAt(i)=='a'||palabra_rescatada.charAt(i)=='e'||palabra_rescatada.charAt(i)=='i'||palabra_rescatada.charAt(i)=='o'||palabra_rescatada.charAt(i)=='u') {
                contador += 1;
            }
        }
        return contador;
    }

    private static int calcula_consonantes(int pos, String[] array) {
        String palabra_rescatada = array[pos];
        int contador=0;

        for (int i=0; i<palabra_rescatada.length(); i++){
            if (palabra_rescatada.charAt(i)!='a'||palabra_rescatada.charAt(i)!='e'||palabra_rescatada.charAt(i)!='i'||palabra_rescatada.charAt(i)!='o'||palabra_rescatada.charAt(i)!='u') {
                contador += 1;
            }
        }
        return contador;
    }

    private static String imprimir_array(String[] array) {
    return Arrays.toString(array);
    }

    private static String[] rellenar_array(String[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println("Inserte una palabra en la posicion "+i);
            array[i]=sc.next();
        }
        return array;
    }


    private static String[] crear_array(String[] array, int dimension) {
        array = new String[dimension];
        return array;
    }
}
