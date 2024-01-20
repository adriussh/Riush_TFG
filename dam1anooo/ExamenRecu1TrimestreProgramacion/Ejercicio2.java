package PrimerAnyo.ExamenRecu1TrimestreProgramacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("> Bienvenido al programa de gestión de lenguajes de programación <");
        System.out.println("Primero debera introducir los nombres de los lenguajes con los que va a trabajar.");

        String[] array_leng = solicitar_texto(sc);

        System.out.println(Arrays.toString(array_leng));
        do{
            System.out.println(" ");
            System.out.println("----------------------------------------------------");
            System.out.println("0 - Salir.");
            System.out.println("3 - Busqueda lenguaje en Array.");
            System.out.println("4 - Indicar paradigma.");
            System.out.println("5 - Buscar número de veces de un lenguaje en Array.");
            System.out.println("6 - Intercambiar valores.");
            System.out.println("7 - Imprimir array.");
            System.out.println("------------------------------Esperando opción...---");

            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    break;

                case 3:
                    posicionleng(array_leng,sc);break;

                case 4:
                    indicar_paradigma(sc);break;

                case 5:
                    String leng_ocurrencias;
                    System.out.println("¿De qué lenguaje desea ver sus ocurrencias?");
                    leng_ocurrencias=sc.next().toUpperCase();
                    int n_ocurrencias = ocurrencias(array_leng,leng_ocurrencias);
                    System.out.println("El numero de ocurencias de "+leng_ocurrencias+" es de "+n_ocurrencias+".");break;

                case 6:
                    String[] new_array = intercambiar(array_leng,sc);
                    System.out.println(Arrays.toString(new_array));break;

                case 7:
                    System.out.println(Arrays.toString(array_leng));break;

                default:
                    System.out.println("Introduzca una opción valida.");break;
            }
        }while (opcion!=0);
        System.out.println("Gracias por usar el programa.");
    }

    private static String[] intercambiar(String[] array_leng, Scanner sc) {
        String new_lenguaje;
        String lenguaje_reemplazar;
        System.out.println("Indique que lenguaje desea intercambiar de la lista.");
        lenguaje_reemplazar=sc.next().toUpperCase();
        System.out.println("Ahora indique por cual nuevo lenguaje desea intercambiarlo.");
        new_lenguaje=sc.next().toUpperCase();
        for (int i=0; i<array_leng.length; i++){
            if (array_leng[i].equals(lenguaje_reemplazar)){
                array_leng[i]=new_lenguaje;
            }
        }
        return array_leng;
    }

    private static int ocurrencias(String[] array_leng, String leng_ocurencias) {
        int n_final=0;
        for (int i=0; i<array_leng.length; i++){
            if (array_leng[i].equals(leng_ocurencias)){
                n_final=n_final+1;
            }
        }
        return n_final;
    }

    private static void indicar_paradigma(Scanner sc) {
        String parag_buscar;
        System.out.println("Indique el lenguaje del que desea conocer su paradigma.");
        parag_buscar=sc.next().toUpperCase();
        switch (parag_buscar){
            case "JAVA":
                System.out.println("\u001B[32m"+Paradigma.IMPERATIVA_POO+"\u001B[0m");break;
            case "PASCAL":
                System.out.println("\u001B[32m"+Paradigma.IMPERACTIVA_ESTRUCTURADA+"\u001B[0m");break;
            case "PROLOG":
                System.out.println("\u001B[31m"+Paradigma.DECLARATIVA_LOGICA+"\u001B[0m");break;
            case "LISP":
                System.out.println("\u001B[31m"+Paradigma.DECLARATIVA_FUNCIONAL+"\u001B[0m");break;
            default:
                System.out.println("Paradigma no identificado.");break;
        }
    }

    private static void posicionleng(String[] array_leng, Scanner sc) {
        String leng_buscar;
        System.out.println("Indique el lenguaje que desea buscar dentro de la lista.");
        leng_buscar = sc.next().toUpperCase();
        for (int i=0; i<array_leng.length; i++){
            int casilla=i+1;
            if (leng_buscar.equals(array_leng[i])){
                System.out.println("El lenguaje se encuentra en la posición "+casilla+" de la lista.");break;
            } else if (array_leng[i].equals(array_leng[array_leng.length-1]) && !leng_buscar.equals(array_leng[i])) {
                System.out.println("El lenguaje no se encuentra en la lista.");break;
            }
        }
    }

    private static String[] solicitar_texto(Scanner sc) {
        int lenguajes_totales;
        System.out.println("-------------------------------");
        System.out.println("Indique el número total de lenguajes con los que va a trabajar.");
        lenguajes_totales=sc.nextInt();
        String[] lenguajes_list = new String[lenguajes_totales];
        for (int i=0; i<lenguajes_list.length; i++){
            int casilla= i+1;
            System.out.println("Introduzca el nombre del lenguaje para la casilla número "+casilla+" de la lista." );
            lenguajes_list[i]=sc.next().toUpperCase();
        }
        return lenguajes_list;
    }
}
