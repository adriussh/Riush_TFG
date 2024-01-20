package PrimerAnyo.TercerTr.Sesion0805;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Connection conn = null;
    public static Jugador j = null;
    public static Jugador[] array_estatico_jugadores;
    public static ArrayList<Jugador> array_dinamico_jugadores = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        int opcion = 0;

        do {
            System.out.println("0. Salir programa");
            System.out.println("1. Crear base de datos EjercicioPractico");
            System.out.println("2. Crear la tabla jugador");
            System.out.println("3. Vaciar tabla ");
            System.out.println("4. Eliminar tabla");
            System.out.println("5. Insertar jugador");
            System.out.println("6. Buscar jugador por dorsal y lo almacenamos en un objeto jugador e imprimos ese objeto");
            System.out.println("7. Muestra contenido BBDD por array estatico.");
            System.out.println("8. Muestra contenido BBDD por array dinamico.");
            System.out.println("9. Mostrar tablas de la BBDD EjercicioPractico");
            System.out.println("Introduzca una opcion por favor");
            opcion=sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:crear_bd();break;
                case 2:crear_tabla_jugador();break;
                case 3:vaciar_tabla_jugador();break;
                case 4: break;
                case 5:
                    System.out.println("Introduzca su dni");
                    String dni = sc.next();
                    System.out.println("Introduzca su nombre");
                    String nombre = sc.next();
                    System.out.println("Introduzca dorsal camsieta");
                    int dorsal = sc.nextInt();
                    System.out.println("Introduzca salario");
                    double salario = sc.nextDouble();
                    System.out.println("Introduzca edad");
                    int edad = sc.nextInt();
                    Jugador j1 = new Jugador(dni,nombre,dorsal,salario,edad);
                    insertar_jugador(j1);break;
                case 6:
                    System.out.println("Introduzca el dorsal del jugaodr a buscar en la BBDD");
                    dorsal = sc.nextInt();
                    Jugador j2 = buscar_por_dorsal(dorsal);
                    System.out.println(j.toString());break;
                case 7:
                    //Array estatico (Es el array normal de siempre)
                    array_estatico_jugadores = almacenar_array_estatico();
                    System.out.println(Arrays.toString(array_estatico_jugadores));
                    System.out.println(" ");break;

                case 8:
                    //Array dinamico (Es el ArrayList)
                    ArrayList<Jugador> arrayList = almacenar_array_dinamico();
                    for (Jugador e:array_dinamico_jugadores){
                        System.out.println(e.toString());
                    }
                    System.out.println(" ");
                    break;
                case 9:
                    mostrar_tablas();
                    break;
                default:
                    break;
            }
        }while (opcion!=0);
    }

    private static void mostrar_tablas() throws SQLException {
        DatabaseMetaData dm = conn.getMetaData();
        ResultSet rs = dm.getCatalogs();
        while (rs.next()){
            System.out.println(rs.getString(1));
        }
        //ResultSet rs = dm.getTables();
    }

    private static ArrayList<Jugador> almacenar_array_dinamico() throws SQLException {
        PreparedStatement st = conn.prepareStatement("select * from jugador");
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            Jugador j = new Jugador(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
            array_dinamico_jugadores.add(j);
        }
        return array_dinamico_jugadores;
    }

    private static Jugador[] almacenar_array_estatico() throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select count(*) from jugador");
        ResultSet rs = ps.executeQuery();
        int dimension=0;
        while (rs.next()){
            dimension=rs.getInt(1);
        }
        array_estatico_jugadores = new Jugador[dimension];
        ps = conn.prepareStatement("select * from jugador");
        rs = ps.executeQuery();
        int i = 0;
        while (rs.next()){
            Jugador j = new Jugador(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
            array_estatico_jugadores[i]=j;
            i++;
        }
        return array_estatico_jugadores;
    }

    private static Jugador buscar_por_dorsal(int dorsal) throws SQLException {

        PreparedStatement ps = conn.prepareStatement("select * from jugador where dorsal_camiseta = ?");
        ps.setInt(1,dorsal);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            j = new Jugador(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5));
        }
        return j;
    }

    private static void insertar_jugador(Jugador j1) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into jugador (dni,nombre_jugador,dorsal_camiseta,salario,edad) values (?,?,?,?,?)");
        ps.setString(1,j1.getDni());
        ps.setString(2,j1.getNombre_jugador());
        ps.setInt(3,j1.getDorsal_camiseta());
        ps.setDouble(4,j1.getSalario());
        ps.setInt(5,j1.getEdad());
        ps.executeUpdate();
    }

    private static void vaciar_tabla_jugador() throws SQLException {

        String query = "truncate jugador";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void crear_tabla_jugador() throws SQLException {

        String query = "create table if not exists jugador(" +
                "dni varchar(9) not null," +
                "nombre_jugador varchar(25)," +
                "dorsal_camiseta int," +
                "salario double," +
                "edad int," +
                "constraint pk_jugador primary key(dni))";

        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void crear_bd() throws SQLException {
        establecer_conexion();
        String query = "create database if not exists EjercicioPractico";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        uso_bd();
    }

    private static void uso_bd() throws SQLException {
        String query = "use EjercicioPractico";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void establecer_conexion() throws SQLException {
        //conexión al sgbd

        String url = "jdbc:mysql://localhost:3306/";
        String user ="root";
        String pwd="03122002jaAR.";
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

