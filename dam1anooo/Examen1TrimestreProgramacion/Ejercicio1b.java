package PrimerAnyo.Examen1TrimestreProgramacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dimension = solicitardimension();
        int array[]= new int[dimension];
        int opcion=0;
        do {
            System.out.println("Introduzca una de las siguientes opciones");
            System.out.println("0. Salir");
            System.out.println("1. Inicializar array aleatoriamente");
            System.out.println("2. Comprobar si es múltiplo de 3 y 5 a la vez");
            System.out.println("3. Indicar el número de negativos en el array");
            System.out.println("4. Verificar si es capicúa el array");
            System.out.println("Esperando opción...");
            opcion = sc.nextInt();
            switch (opcion){
                case 0: System.out.println("Gracias por usar la app");break;
                case 1: inicializar(array);
                        System.out.println(Arrays.toString(array));
                        break;
                case 2: int[] array3={15,16,25,30};
                        imprimir_multiplos(array3);
                        break;
                case 3: numeros_negativos(array);
                    break;
                case 4: int[] array2 = {1,6,2,4};
                    comprobar_capicula(array2);
                    break;
                default:System.out.println("La opción no es válida");

            }

        }while (opcion!=0);

    }

    private static void comprobar_capicula(int[] array) {
        int[] array_invertido= new int[array.length];

       // int j= array.length;
        int i=0;
        System.out.println("El array  es"+Arrays.toString(array));
        for (int j=array.length-1;j>=0;j--){
                  array_invertido[i]=array[j];
                  i++;

        }
        System.out.println("El array invertido es"+Arrays.toString(array_invertido));
        if (Arrays.equals(array,array_invertido)){
            System.out.println("Es capicua");
        }
        else{
            System.out.println("No es capicúa");
        }
    }

    private static void numeros_negativos(int[] array) {
        int contador=0;
              for (int i=0;i<array.length;i++){
                  if (array[i]<0){
                      contador++;
                  }
              }
           System.out.println("La cantidad de números negativos es "+contador);

    }

    private static void imprimir_multiplos(int[] array) {
        for (int i=0;i<array.length;i++){

            if ((array[i] % 3 ==0 )&&(array[i] % 5 ==0 )){
                System.out.println("\u001B[31m"+array[i]+"\u001B[0m");

            }


        }

    }

    private static void inicializar(int[] array) {
        final int MAX=100;
        final int MIN=-100;
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*((MAX-MIN)+1))+MIN;
        }
        //return array;

    }

    private static int solicitardimension() {
        int numero =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduzca la dimensión del array entre 1 y 10");
            numero=sc.nextInt();

        }
        while(numero<1||numero>10);
        return numero;
    }

}
