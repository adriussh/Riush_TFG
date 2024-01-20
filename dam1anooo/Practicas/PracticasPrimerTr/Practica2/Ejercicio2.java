package PrimerAnyo.Practicas.PracticasPrimerTr.Practica2;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Inicialización scanner.
        String opcion="";
        // Mensaje introductorio previos al Do-While.
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\u001B[0m *|- \033[33m Bienvenido al sistema de gestión de compras. \u001B[0m -|*");
        System.out.println("-------------------------------------------------------------------------------------------------");

                /*Redirección al método o función que toma las temperaturas con las que se va a trabajar. Las perdirá
        solo una vez y trabajará con ellas hasta que el usuario no desee continuar ("SALIR").
         */
        int numero_items = introduccion_num_productos(opcion);
        String[] array_lista_productos = introduccion_lista_productos(numero_items);
        System.out.println(Arrays.toString(array_lista_productos));

        //Inicio Do-While
        do {
            //Mensajes introductorios al programa que se repetiran hasta que el usuario no desee continuar.
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("Si desea continuar escriba '\033[32mCONTINUAR\u001B[0m'. Si no desea continuar con el proceso escriba '\033[31mSALIR\u001B[0m'.");
            opcion = sc.next().toUpperCase();

            if (opcion.equals("CONTINUAR")){
                int opcion2;
                //Menú que se va a repetir siempre que desee continuar realizando operaciones con las temperaturas.
                System.out.println("\033[34m ---------\u001B[0m Aquí tiene representadas varias opciones para trabajar con dichas temperaturas. \033[34m---------\u001B[0m");
                System.out.println("-Mostrar número total de items de la lista.        \033[34m PRESIONE 1.\u001B[0m");
                System.out.println("-Mostrar lista de la compra.                       \033[34m PRESIONE 2.\u001B[0m");
                System.out.println("-Buscar un producto en concreto de la lista.       \033[34m PRESIONE 3.\u001B[0m");
                System.out.println("-Comprobar si algún producto se repite.            \033[34m PRESIONE 4.\u001B[0m");
                System.out.println("-Número de vocales de un producto en concreto.     \033[34m PRESIONE 5.\u001B[0m");
                System.out.println("-Eliminar un producto de la lista.                 \033[34m PRESIONE 6.\u001B[0m");
                System.out.println("-Insertar nuevo producto en la lista.              \033[34m PRESIONE 7.\u001B[0m");
                System.out.println("--------------------------------------------------------------- \033[33m Esperando opcion .....\u001B[0m ------------");
                opcion2=sc.nextInt();

                switch (opcion2){
                    case 1:
                        System.out.println("°°°°° En la lista hay "+numero_items+" productos en total. °°°°°"); break;

                    case 2:
                        System.out.println("°°°°° Su lista es compuesta por: "+Arrays.toString(array_lista_productos)+". Buena eleccion. ;) °°°°°");
                        break;

                    case 3:
                        String produc_abuscar;
                        System.out.println(">->> ¿Qué producto desea buscar en la lista? <<-< °°°°°");
                        produc_abuscar=sc.next().toUpperCase();
                        buscar_productoo(produc_abuscar,array_lista_productos);
                        break;

                    case 4:

                        break;

                    case 5:
                        break;

                    case 6:
                        break;

                    case 7:
                        break;

                    default:
                        System.out.println("\033[31m>>>>>>>>>>>>> Seleccione una opción adecuada para continuar. <<<<<<<<<<<<<\u001B[0m"); break;
                }
            }
        } while (!opcion.equals("SALIR")); //Usuario no desea continuar. Fin Do-While.
        System.out.println("              \033[31m<<<<<<<<<<<<<\u001B[0m * \033[31m>>>>>>>>>>>>>\u001B[0m");
        System.out.println("\033[34m----------------\u001B[0m Gracias por participar \033[34m----------------\u001B[0m");
        System.out.println("              \033[31m<<<<<<<<<<<<<\u001B[0m * \033[31m>>>>>>>>>>>>>\u001B[0m");
    }

    private static void buscar_productoo(String produc_abuscar, String[] array_lista_productos) {
        int posicion_producto_buscado;  //Variable que guardará la posición del producto tras haberlo buscado en el arrays.

        for (int i=0; i<array_lista_productos.length; i++) {
            if (array_lista_productos[i].equals(produc_abuscar)){  //Si el contenido de la posicion i es igual al producto buscado.
                posicion_producto_buscado=i+1;  //Se le suma 1 para que aparezca la posición adecuada.
                System.out.println("°°°°° El producto \033[33m"+produc_abuscar+"\u001B[0m se encuentra en la posición "+posicion_producto_buscado+" de la lista. °°°°°");

            } else if (array_lista_productos[i].equals(array_lista_productos[array_lista_productos.length-1]) && !produc_abuscar.equals(array_lista_productos[i])) {
                //Si el prod a buscar no esta en la posición i del arrays y la última posición del arrays es igual a la posición i.
                System.out.println(">->> \033[31mEl producto no se encuentra en la lista. \u001B[0m<<-<"); break;
            }
        }
    }

    private static String[] introduccion_lista_productos(int numero_items) {
        Scanner sc= new Scanner(System.in);
        int posicion;
        String[] array_lista_compra = new String[numero_items];  /*Inicializacion de array que contendra el listado de
                                                                     productos introducidos como String y los asignará por
                                                                     orden a cada casilla del array. A su vez se le indica
                                                                     el tamaño que debe tener tras haberle preguntado al usuario
                                                                     el número total de productos*/
        System.out.println("------> Ahora, escriba los productos de la lista con los que desea trabajar. <------");
        for (int i=0; i<array_lista_compra.length; i++){  //recorrido
            posicion = i+1;     //teniendo en cuenta que la primera posición del array es 0, se le suma 1 para mostrar la posicion adecuadamente.
            System.out.println(">->> Introduzca nombre del producto número: "+posicion+". <<-<");
            array_lista_compra[i]=sc.next().toUpperCase();  //Se asignan productos tipo "String" a cada casilla del array.
        }
        return array_lista_compra;
    }

    private static int introduccion_num_productos(String opcion) {
        Scanner sc= new Scanner(System.in);
        int numero_productos;

        System.out.println("Introduzca el número total de productos.");
        numero_productos=sc.nextInt();

        return numero_productos;
    }
}
