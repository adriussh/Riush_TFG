package PrimerAnyo.Examen1TrimestreProgramacion;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int opcion = -1;
        int dimension;
        int numero = 0;

        dimension = solicitar();
        float[] array = new float[dimension];
        Scanner sc = new Scanner(System.in);
        boolean inicializado=false;
        do {
            System.out.println("Introduzca una de las siguientes opciones");
            System.out.println("0. Salir");
            System.out.println("1. Inicializar");
            System.out.println("2. Imprimir el valor máximo y su posición");
           // System.out.println("3. Imprimir el valor mínimo y su posición");
            System.out.println("4. Mostrar media");
            System.out.println("5. Imprimir array");
            System.out.println("Esperando opción...");
            opcion = sc.nextInt();


            if (opcion != 0) {

                if (!inicializado&& opcion!=1) {

                    System.out.println("Tiene que inicializar el array primero antes de hacer otras operaciones");
                } else {

                    switch (opcion) {
                        case 1:

                            inicializar(array);
                            inicializado = true;
                            break;
                        case 2:

                            float[] valores_maximo = buscar_maximo(array);
                            imprimir_resultado(valores_maximo);


                            break;
                        case 3:

                            float[] valores_minimo = buscar_minimo(array);
                            imprimir_resultado(valores_minimo);


                            break;
                        case 4:

                            float media = calcular_media(array);
                            System.out.println("la media es " + media);

                            break;
                        case 5:
                            System.out.println(Arrays.toString(array));
                            break;

                    }


                }
            }
            else
                {
                    System.out.println("Gracias por usar el programa");
                }



            } while (opcion != 0) ;



    }




    private static float calcular_media(float[] array) {
        float media=0;
        for (int i=0;i<array.length;i++){
            media= media+array[i];
        }
        media=media/array.length;
        return media;

    }

    private static float[] buscar_minimo(float[] array) {

        float[] resultado = new float[2];
        float minimo=array[0];
        int indice=0;
        for (int i=0;i<array.length;i++){
            if (array[i]<minimo){
                minimo=array[i];
            }
        }
        resultado[0]=minimo;

        indice=buscar_posicion(array,minimo);
        indice++;
        resultado[1]=indice;
        return resultado;
    }

    private static void imprimir_resultado(float[] a) {
        System.out.println("El máximo es "+a[0]+" y se encuentra en la posicion "+(int) a[1]);
    }

    private static float[] buscar_maximo(float[] array) {
        float[] resultado = new float[2];
        float maximo=0;
        int indice=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>maximo){
                maximo=array[i];
                           }
        }
        resultado[0]=maximo;

        indice=buscar_posicion(array,maximo);
        indice++;
        resultado[1]=indice;
        return resultado;
    }

    private static int buscar_posicion(float[] array, float maximo) {
        return Arrays.binarySearch(array,maximo);
    }

    public static void imprimir(float[] a){
        System.out.println(Arrays.toString(a));
    }
    public static float[] inicializar(float[] array){


        Scanner sc = new Scanner(System.in);
        //rellenar array
        for (int i=0; i<array.length;i++){

            System.out.println("Introduzca el valor del "+numeroordinal(i));
            array[i] = sc.nextFloat();

        }
        return array;

    }

    private static Ordinales numeroordinal(int i) {
        Ordinales numero=Ordinales.primero;
        switch (i){
            case 0: numero=Ordinales.primero;break;
            case 1: numero =Ordinales.segundo;break;
            case 2: numero =Ordinales.tercero;break;
            case 3: numero =Ordinales.cuarto;break;
            case 4: numero =Ordinales.quinto;break;
            case 5: numero =Ordinales.sexto;break;
            case 6: numero =Ordinales.séptimo;break;
            case 7: numero =Ordinales.octavo;break;
            case 8: numero =Ordinales.noveno;break;
            case 10: numero =Ordinales.décimo;break;
        }
        return numero;
    }

    public static int solicitar(){
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
