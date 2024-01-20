package PrimerAnyo.ExtraFinalCurso.CorrecionExamenOrdinaria;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static Connection conn;
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Jugador> lista_futbolistas = new ArrayList<>();
    public static Jugador j1;

    public static void main(String[] args) throws SQLException, AccionIncorrecta {
        int opcion = 0;
        do {
            System.out.println("0. Salir del programa.");
            System.out.println("1. Conectar con el SGBD.");
            System.out.println("2. Crear la base de datos y selecconarla.");
            System.out.println("3. Crear la tabla jugador en BBDD.");
            System.out.println("4. Insertar registro en BBDD a partir de un objeto de la clase jugador introducido por teclado.");
            System.out.println("5. Consultar jugador por id y almacenarlo en un objeto de la clase jugador. Se mostrara por pantalla info.");
            System.out.println("6. Insertar jugadores de la tabla en un ArayList filtrando por la posicion indicada por teclado por el usuario. Se mostrara por pantalla info.");
            System.out.println("7. Ordenador ArrayList por salario de manera descendente y por años de experiencia de manera ascendente. Se mostrara por pantalla info.");
            System.out.println("8. Insertar en BBDD un array estatico de jugadores, se solicitara al usuario la dimension del array estatico a crear.");
            System.out.println("9. Mostrar la url de la conexion, la version del SGBD empleado.");
            System.out.println("Introduzca opcion.");
            opcion=sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    conectarBD();break;
                case 2:
                    crearBD();break;
                case 3:
                    crearTabla();break;
                case 4:
                    System.out.println("Inserte id del jugador");
                    int id = sc.nextInt();
                    System.out.println("Inserte el nombre");
                    String nombre = sc.next();
                    System.out.println("Inserte los apellidos");
                    String apellidos = sc.next();
                    System.out.println("Inserta su edad");
                    int edad = sc.nextInt();
                    System.out.println("Inserte años experiencia");
                    int anyos_experiencia = sc.nextInt();
                    System.out.println("Inserte posicion");
                    String posicion = sc.next().toUpperCase();
                    j1 = new Jugador(id,nombre,apellidos,edad,anyos_experiencia,Posicion.valueOf(posicion));
                    insertarRegistro(j1);break;
                case 5:
                    System.out.println("Indique el id del jugador a consultar");
                    id = sc.nextInt();
                    Jugador j2 = consultarJugador(id);
                    System.out.println(j2.toString());break;
                case  6:
                    System.out.println("Indique la posicion por la que desea filtrar");
                    posicion = sc.next().toUpperCase();
                    insertar_arraylist(posicion);
                    imprimirArrayList();break;
                case 7:
                    ordenar_arraylist();
                    imprimirArrayList();
                    break;
                case 8:
                    System.out.println("Dimension del array estatico");
                    int dimension = sc.nextInt();
                    Jugador[] lista = new Jugador[dimension];
                    for (int i=0; i<dimension-1; i++){
                        System.out.println("Introduzca el id del jugador");
                        id = sc.nextInt();
                        System.out.println("Introduzca el nombre del jugador");
                        nombre = sc.next();
                        System.out.println("Apellidos");
                        apellidos = sc.next();
                        System.out.println("edad");
                        edad = sc.nextInt();
                        System.out.println("años experiencia");
                        anyos_experiencia = sc.nextInt();
                        System.out.println("Posicion");
                        posicion = sc.next().toUpperCase();
                        j1=new Jugador(id,nombre,apellidos,edad,anyos_experiencia,Posicion.valueOf(posicion));
                        lista[i]=j1;
                    }
                    insertar_arrayestatico(lista);break;
                case 9:
                    String cadena = mostrar_metadatos();
                    System.out.println(cadena);break;
                default:
                    System.out.println("Inserte una opcion correcta");break;
            }
        } while (opcion != 0);

    }



    public static void conectarBD() throws SQLException {
        String url="jdbc:mysql://localhost:3306/";
        String user="root";
        String password="admin";
        conn = DriverManager.getConnection(url,user,password);
        System.out.println("¡Conexion establecida!");
    }

    public static void crearBD() throws SQLException {
        String query = "create database if not exists examen_ordinaria";
        Statement st = conn.createStatement();
        st.execute(query);
        query = "use examen_ordinaria";
        st.execute(query);
        System.out.println("Base de datos creada y asignada correctamente.");
    }

    public static void crearTabla() throws SQLException {
        String query = "create table if not exists jugador(" +
                "id int primary key," +
                "nombre varchar(25)," +
                "apellidos varchar(25)," +
                "edad int," +
                "anyo_experiencia int," +
                "salario double," +
                "lesionado boolean," +
                "posi varchar(50)" +
                ")";
        Statement st = conn.createStatement();
        st.execute(query);
        System.out.println("Tabla creada correctamente.");
    }

    public static void insertarRegistro(Jugador j) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into jugador values (?,?,?,?,?,?,?,?)");
        ps.setInt(1,j1.getId());
        ps.setString(2,j1.getNombre());
        ps.setString(3,j1.getApellidos());
        ps.setInt(4,j1.getEdad());
        ps.setInt(5,j1.getAnyo_experiencia());
        ps.setDouble(6,j1.getSalario());
        ps.setBoolean(7,j1.isLesionado());
        ps.setString(8,j1.getPosi().toString());
        ps.execute();
        System.out.println("¡Registro insertado!");
    }

    public static Jugador consultarJugador(int id) throws SQLException, AccionIncorrecta {
        PreparedStatement ps = conn.prepareStatement("select * from jugadores where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            j1 = new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),Posicion.valueOf(rs.getString(8)));
        }
        return j1;
    }

    public static void insertar_arraylist(String posicion) throws SQLException, AccionIncorrecta {
        lista_futbolistas.clear();
        PreparedStatement ps = conn.prepareStatement("select * from jugador where posicion like '?'");
        ps.setString(1,posicion);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            if (rs.getString(8).equals(posicion)){
                j1=new Jugador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),Posicion.valueOf(rs.getString(8)));
                lista_futbolistas.add(j1);
            }
        }
    }

    public static void ordenar_arraylist() {
        lista_futbolistas.sort(Comparator.comparing(Jugador::getSalario).reversed().thenComparing(Jugador::getAnyo_experiencia));
        System.out.println("Arraylist ordenado correctamente");
    }

    public static void insertar_arrayestatico(Jugador[] lista) throws SQLException {
        for (int i = 0; i<lista.length; i++){
            PreparedStatement ps = conn.prepareStatement("insert into jugador values (?,?,?,?,?,?,?,?)");
            ps.setInt(1,lista[i].getId());
            ps.setString(2,lista[i].getNombre());
            ps.setString(3,lista[i].getApellidos());
            ps.setInt(4,lista[i].getEdad());
            ps.setInt(5,lista[i].getAnyo_experiencia());
            ps.setDouble(6,lista[i].getSalario());
            ps.setBoolean(7,lista[i].isLesionado());
            ps.setString(8,lista[i].getPosi().toString());
            ps.executeUpdate();
        }
        System.out.println("¡Registro insertado!");
    }



    public static String mostrar_metadatos() throws SQLException {
        String cadena = null;
        DatabaseMetaData dm = conn.getMetaData();
        cadena = "URL: "+dm.getURL();
        cadena += " SGBD: "+dm.getDatabaseProductVersion();
        return cadena;
    }


    public static void imprimirArrayList() {
        for (Jugador j:lista_futbolistas) {
            System.out.println(j.toString());
        }
    }

}
