package PrimerAnyo.Practicas.PracticasTercerTr.Practica1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Pelicula p=null;
    public static ArrayList<Pelicula> listado_peliculas = new ArrayList<>();
    public static void main(String[] args) throws SQLException {
        int opcion=0;//Varible para elección de la opción.
        Peliculas p2 = new Peliculas(); //Objeto de la clase "Peliculas" para poder trabajar con los metodos contenido en la misma.
        //Menú para redirigirse a las opciones.
        do {
            System.out.println("\033[33m...................................................................");
            System.out.println("!Bienvenido al programa de de gestion de peliculas\u001B[0m");
            System.out.println("\033[34m> Opciones:\u001B[0m");
            System.out.println("0. Salir del programa.");
            System.out.println("1. Crear tabla.");
            System.out.println("2. Eliminar tabla.");
            System.out.println("3. Crear pelicula.");
            System.out.println("4. Eliminar pelicula por id.");
            System.out.println("5. Buscar pelicula por id e imprimir informacion.");
            System.out.println("6. Buscar todas las peliculas e imprimir todas las peliculas.");
            System.out.println("7. Buscar por género y por orden descendente de estreno e imprimir.");
            System.out.println("\033[33m..................................................\u001B[0m Waiting Option \033[33m...");
            opcion=sc.nextInt();

            //Switch para identificar opcion y redirigir al metodo correspondiente.
            switch (opcion){
                case 0:
                    System.out.println("\033[34mGracias por utilizar el programa.\u001B[0m");break;
                case 1:
                    p2.crearTabla();break;
                case 2:
                    p2.eliminarTabla();break;
                case 3:
                    //Introduccion de datos necesarios para creacion.
                    System.out.println("> Introduzca el id de la pelicula.");
                    int id = sc.nextInt();
                    System.out.println("> Introduzca el titulo.");
                    String titulo = sc.next();
                    System.out.println("> Introduzca el genero, solo puede ser ROMANTICA, MIEDO o COMEDIA.");
                    String genero=sc.next().toUpperCase();
                    System.out.println("> Introduzca la fecha de estreno.");
                    int estreno = sc.nextInt();
                    //Si el genero introducido esta dentro del enumerado Genero entonces
                    if (Genero.ROMANTICA.toString().equals(genero)||Genero.MIEDO.toString().equals(genero)||Genero.COMEDIA.toString().equals(genero)){
                        p = new Pelicula(id,titulo,genero,estreno);
                        p2.crearPelicula(p);break;
                    }else System.out.println("\033[31mEl genero es incorrecto.\u001B[0m");break;
                case 4:
                    System.out.println("> Inserte el id de la pelicula que desea eliminar.");
                    id = sc.nextInt();
                    p2.eliminarPelicula(id);break;
                case 5:
                    System.out.println("> Inserte el id de la pelicula a buscar.");
                    id = sc.nextInt();
                    p2.buscarPelicula(id);break;
                case 6:
                    System.out.println("\033[34mººº Aquí tiene el listado de las películas registradas en el sistema: ººº\u001B[0m");
                    System.out.println(" ");
                    listado_peliculas = p2.buscarTodo(); //Se agregará el contenido del ArrayList devuelto al ArrayList creado en el main para así, mostrar la informacion.
                    for (Pelicula e:listado_peliculas){
                        System.out.println(e.toString());
                    }
                    System.out.println(" ");break;
                case 7:
                    System.out.println("> Introduzca el genero por el que desea filtrar las peliculas. Existen: ROMANTICA, MIEDO y COMEDIA.");
                    genero=sc.next().toUpperCase();
                    if (Genero.ROMANTICA.toString().equals(genero)||Genero.MIEDO.toString().equals(genero)||Genero.COMEDIA.toString().equals(genero)){
                        System.out.println("\033[34mººº Aquí tiene el listado de las películas registradas en el sistema en la categoría "+genero+": ººº\u001B[0m");
                        listado_peliculas = p2.buscarPorGeneroyEstreno(genero); //Se agregará el contenido del ArrayList devuelto al ArrayList creado en el main para así, mostrar la informacion.
                        for (Pelicula e:listado_peliculas){
                            System.out.println(e.toString());
                        }
                    }else System.out.println("\033[31mEl genero es incorrecto.\u001B[0m");
                    System.out.println(" ");break;
                default:
                    System.out.println("\033[31mº*** Inserte una opcion valida. ***º\u001B[0m");break;
            }
        }while (opcion!=0);
    }
}
