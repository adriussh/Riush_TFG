package PrimerAnyo.Practicas.PracticasTercerTr.Practica1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Peliculas implements PeliculasInterface {
    public static Scanner sc = new Scanner(System.in);
    public static Connection conn; // Varible SQL necesaria para la conexión y realización de consultas a la BBDD.
    public static ArrayList<Pelicula> DatosBBDD = new ArrayList<>();
    // ArrayList que contendra los registros tras consulta. Se utilizará también para rellenar ArrayList 'listado_peliculas' en el 'Main'.
    public static Pelicula p = null; // Objeto necesario para la creación de Peliculas tras consultas y rellenar con las mismas el ArrayList 'DatosBBDD'.

    //Conexion con la base de datos.
    static{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica3","root","03122002jaAR.");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //Metodos implementados de la interfaz "PeliculasInterface".
    //Funciones y procedimientos.
    @Override
    public void crearTabla() throws SQLException {
        //Creacion de tabla
        String query = "create table if not exists peliculas(" +
                "id int primary key," +
                "titulo varchar(100)," +
                "genero varchar(25)," +
                "estreno int)";
        Statement st = conn.createStatement();
        st.execute(query);
        System.out.println("\033[32m¡La tabla se ha creado con exito!\u001B[0m");
        System.out.println(" ");
    }

    @Override
    public void eliminarTabla() throws SQLException {
        //Eliminacion de tabla
        String query = "drop table peliculas;";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("\033[32m¡La tabla se ha borrado con exito!\u001B[0m");
        System.out.println(" ");
    }

    @Override
    public void crearPelicula(Pelicula p) throws SQLException {
        //Insertar datos en la tabla
        PreparedStatement ps = conn.prepareStatement("insert into peliculas values (?,?,?,?)");
        ps.setInt(1,p.getId());
        ps.setString(2,p.getTitulo());
        ps.setString(3, String.valueOf(p.getGenero()));
        ps.setInt(4,p.getEstreno());
        ps.executeUpdate();
        System.out.println("\033[32m¡La pelicula "+p.getTitulo()+" ha sido insertada correctamente!\u001B[0m");
        System.out.println(" ");
    }

    @Override
    public void eliminarPelicula(int id) throws SQLException {
        //Eliminar datos en la tabla
        PreparedStatement ps = conn.prepareStatement("delete from peliculas where id=?");
        ps.setInt(1,id);
        ps.executeUpdate();
        System.out.println("\033[32m¡La pelicula con id "+id+" se ha eliminado con exito.\u001B[0m");
        System.out.println(" ");
    }

    @Override
    public Pelicula buscarPelicula(int id) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from peliculas where id = ?");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            /* Mientras halla registros, entonces se genera una nueva pelicula y se agrega al ArrayList 'DatosBBDD'. */
            p = new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            DatosBBDD.add(p);
            System.out.println(rs.getInt(1));
        }
        System.out.println("\033[32m¡La pelicula con id "+id+" se ha encontrado.\u001B[0m");
        for (Pelicula e:DatosBBDD){
            //Se mostra por pantalla la película mediante el uso de 'for:each'
            System.out.println(e.toString());
            System.out.println(" ");
        }
        return p;
    }

    @Override
    public ArrayList<Pelicula> buscarTodo() throws SQLException {
        //Consulta de la tabla "peliculas" para que retorne todos los registros existentes y los inserte en el ArrayList "DatosBBDD"
        DatosBBDD.clear();//Vacia el ArrayList para insertar nuevos datos actualizados tras hacer una nueva consulta.
        PreparedStatement st = conn.prepareStatement("select * from peliculas");
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            /* Mientras halla registros, entonces se genera una nueva pelicula y se agrega al ArrayList 'DatosBBDD'. */
            p=new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            DatosBBDD.add(p);
        }
        return DatosBBDD;
    }

    @Override
    public ArrayList<Pelicula> buscarPorGeneroyEstreno(String genero) throws SQLException {
        DatosBBDD.clear();//Vacia el ArrayList para insertar nuevos datos actualizados tras hacer una nueva consulta.
        PreparedStatement st = conn.prepareStatement("select * from peliculas where genero like '"+genero+"'");
        ResultSet rs = st.executeQuery();
        while (rs.next()){
            /* Mientras halla registros, si el genero en la tabla 'Peliculas' es igual al genero introducido por el usuario
             * entonces se genera una nueva pelicula y se agrega al ArrayList 'DatosBBDD'*/
            if (rs.getString(3).equals(genero)){
                p=new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                DatosBBDD.add(p);
            }
        }
        return DatosBBDD;
    }
}
