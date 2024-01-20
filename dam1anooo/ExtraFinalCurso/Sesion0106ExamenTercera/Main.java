package PrimerAnyo.ExtraFinalCurso.Sesion0106ExamenTercera;


import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static Connection conn;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Hotel> lista_hoteles = new ArrayList<>();
    public static Hotel h1 = null;
    public static Hotel[] array_estatico_hoteles;

    public static void main(String[] args) throws Exception {


        int opcion = 0;
        do {
            System.out.println("0. Salir del programa.");
            System.out.println("1. Conectar con el SGBD.");
            System.out.println("2. Crear la base de datos y seleccionarla.");
            System.out.println("3. Crear tabla hotel en BBDD.");
            System.out.println("4. Insertar registro de BBDD.");
            System.out.println("5. Consultar por hoteles friendly en BBDD y añadirlos en un arraylist ordenado de mayor a menor segun pague ibi");
            System.out.println("6. Imprimir ArrayList.");
            System.out.println("7. Mostrar campos de la tabla hotel.");
            System.out.println("8. Insertar registros de la tabla hotel en un array estatico.");
            System.out.println(".......................................................................................... Introduzca opcion...");
            System.out.println(" ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                case 1:
                    conectarBD();
                    break;
                case 2:
                    crearBD();
                    break;
                case 3:
                    crearTabla();
                    break;
                case 4:
                    System.out.println("Introduzca el identificador");
                    int identificador = sc.nextInt();
                    System.out.println("Introduzca el nombre del hotel");
                    String nombre = sc.next();
                    System.out.println("Introduzca el año de edificacion del hotel");
                    int anyo_edif = sc.nextInt();
                    System.out.println("Introduzca la direccion del hotel");
                    String direccion = sc.next();
                    System.out.println("Introduzca los m2 del hotel");
                    double m2 = sc.nextDouble();
                    System.out.println("¿Admite mascotas? S o N");
                    char admision_m = sc.next().toLowerCase().charAt(0);
                    boolean isPetFriendly = false;
                    if (admision_m == 's') {
                        isPetFriendly = true;
                    } else if (admision_m == 'n') {
                        isPetFriendly = false;
                    } else System.out.println("Seleccione S o N.");
                    insertarRegistro(h1 = new Hotel(identificador, nombre, anyo_edif, direccion, m2, isPetFriendly));
                    break;
                case 5:
                    filtro_hoteles();
                    break;
                case 6:
                    System.out.printf(imprimirArrayList());
                    break;
                case 7:
                    System.out.println(mostrar_columnas());
                    break;
                case 8:
                    insertar_array_estatico();
                    break;
            }

        } while (opcion != 0);
    }

    private static void insertar_array_estatico() {
    }

    private static String mostrar_columnas() {
        return null;
    }

    private static String imprimirArrayList() {
        String resultado = "";
        for (Hotel e : lista_hoteles) {
            resultado+=e.toString();
        }
        return resultado;
    }

    private static void filtro_hoteles() throws SQLException, AccionInvalida {
        lista_hoteles.clear();
        PreparedStatement ps = conn.prepareStatement("select * from hotel where isPetFriendly = 1");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            h1=new Hotel(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getDouble(5),rs.getBoolean(7));
            lista_hoteles.add(h1);
        }
        lista_hoteles.sort(Comparator.comparing(Hotel::getIbi).reversed());
    }

    private static void insertarRegistro(Hotel hotel) throws SQLException{
        PreparedStatement ps = conn.prepareStatement("insert into hotel values (?,?,?,?,?,?,?)");
        ps.setInt(1,h1.getIdentificador());
        ps.setString(2, h1.getNombre());
        ps.setInt(3, h1.getAnyo_edificacion());
        ps.setString(4, h1.getDireccion());
        ps.setDouble(5, h1.getIbi());
        ps.setDouble(6, h1.getM2());
        ps.setBoolean(7, h1.isPetFriendly);
        ps.execute();
    }

    private static void crearTabla() throws SQLException{
        String query = "create table if not exists hotel(" +
                "identificador int primary key," +
                "nombre varchar(50)," +
                "anyo_edificacion int," +
                "direccion varchar(100)," +
                "ibi double," +
                "m2 double," +
                "isPetFriendly boolean" +
                ")";
        Statement st = conn.createStatement();
        st.execute(query);
    }

    private static void crearBD() throws SQLException {
        String query = "create database if not exists examen_tercera";
        Statement st = conn.createStatement();
        st.execute(query);
        query = "use examen_tercera";
        st.execute(query);
    }

    private static void conectarBD() throws SQLException {
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","03122002jaAR.");
    }
}