package PrimerAnyo.TercerTr.Sesion2604.EjArrayList2.E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Double> ListaReales = new ArrayList<>();
    public static void main(String[] args) {
        int opcion=0;
        double numero=0;
        double numero_old=0;
        double numero_new=0;
        int posicion=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("0. Salir del programa");
            System.out.println("1. Agregar un número al ArrayList");
            System.out.println("2. Buscar un número en el ArrayList");
            System.out.println("3. Modificar un número del ArrayList");
            System.out.println("4. Eliminar un número del ArrayList");
            System.out.println("5. Insertar un número en una posición dada");
            System.out.println("6. Imprimir ArrayList");
            System.out.println("......................");
            opcion=sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Muchas thenkius jiji"); break;
                case 1:
                    System.out.println("Que número desea añadir???????");
                    numero=sc.nextDouble();
                    add(numero);break;
                case 2:
                    System.out.println("Que número desea buscar???????");
                    numero=sc.nextDouble();
                    buscar(numero);break;
                case 3:
                    System.out.println("Que número desea modificar???????");
                    numero_old=sc.nextDouble();
                    System.out.println("Ahora introduzca el nuevo numero");
                    numero_new=sc.nextDouble();
                    modificar(numero_old,numero_new); break;
                case 4:
                    System.out.println("Introduzca el numero del ArrayList que desae eliminar");
                    numero=sc.nextDouble();
                    eliminar(numero); break;
                case 5:
                    System.out.println("Introduzca el numero a insertar.");
                    numero=sc.nextDouble();
                    System.out.println("En que posicion desea establecerlo?");
                    posicion=sc.nextInt();
                    add_por_posicion(numero,posicion);break;
                case 6:
                    imprimir_array(ListaReales);break;
                default:
                    System.out.println("Ha introducido una opcion incorrecta");
            }
        }while (opcion!=0);
    }

    private static void imprimir_array(ArrayList<Double> listaReales) {
        System.out.println(ListaReales.toString());
    }

    private static void add_por_posicion(double numero, int posicion) {
        ListaReales.set(posicion,numero);
    }

    private static void eliminar(double numero) {
        ListaReales.remove(numero);
        //ListaReales.remove(ListaReales.indexOf(numero));
    }

    private static void modificar(double numero_old, double numero_new) {
        if (ListaReales.contains(numero_old)){
            int posicion = ListaReales.indexOf(numero_old);
            ListaReales.set(posicion,numero_new);
        }
    }

    private static void buscar(double numero) {
        int posicion = ListaReales.indexOf(numero);
        if (posicion != -1) {
            System.out.println("Está");
        }else {
            System.out.println("No está");
        }
        /*
        int contador=0;
        for (double e: ListaReales) {
            if (e==numero){
                contador++;
            }
        }
        if (contador>=1){
            System.out.println("El numero "+numero+" está "+contador+" veces.");
        }
        else{
            System.out.println("El numero "+numero+" no esta");
        }
        */
    }

    private static void add(double numero) {
        ListaReales.add(numero);
    }
}
