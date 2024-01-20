package PrimerAnyo.TercerTr.Sesion0405;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Paciente> DatosExtraidosBBDD = new ArrayList<>();
    public static Connection  conn = null;
    public static Paciente p = null;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        int opcion =0;

        do{
            System.out.println("0.Salir del programa");
            System.out.println("1. Establecer conexión con el sgbd");
            System.out.println("2. Crear la bd ut14");
            System.out.println("3. Crear la tabla paciente");
            System.out.println("4. Borrar la tabla paciente");
            System.out.println("5. Insertar registro en la tabla paciente");
            System.out.println("6. Vaciar la tabla");
            System.out.println("7. Eliminar por dni introducido por teclado");
            System.out.println("8. Actualizar el numero de operaciones de un paciente cuyo dni es introducido por teclado");
            System.out.println("9. Mostrar datos de un paciente cuyo dni se solicita por teclado");
            System.out.println("10. Insertar registro en la tabla paciente a partir de otra clase llamada 'Paciente'.");
            System.out.println("11. Almacenar los registros de la BBDD en un Arraylist");
            System.out.println("14. show databases");
            System.out.println("15. show databases with METADATAOBJECT");
            System.out.println("................................................ Introduzca una opción por favor");
            opcion = sc.nextInt();
            switch (opcion){
                case 0: System.out.println("Gracias por usar el programa");break;
                case 1: establecer_conexion();break;
                case 2: crear_bd();break;
                case 3: crear_tabla();break;
                case 4: borrar_tabla();break;
                case 5: insertar_registro();break;
                case 6: vaciar_tabla();break;
                case 7: borrar_registro();break;
                case 8: actualizar_registro(); break;
                case 9: consultar_registro();break;
                case 10: p = construirObjetoApartirDeOtraClase();addObjeto();break;
                case 11: insertar_array();break;
                case 14: mostrar_bd();break;
                case 15: mostrar_bd2();break;
                default:
                    System.out.println("Elija una opcion correcta.");break;
            }
        }while (opcion!=0);
    }

    private static void mostrar_bd2() throws SQLException {
        DatabaseMetaData databaseMetaData = conn.getMetaData();
        ResultSet resultSet = databaseMetaData.getCatalogs();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }

    private static void mostrar_bd() throws SQLException {
        String query = "SHOW DATABASES";
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString(1));
        }
    }

    private static void insertar_array() throws SQLException {
        //Este metodo realiza consulta a BBDD y guarda los registros en un ArrayList del tipo Paciente
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("select * from paciente");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            p = new Paciente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            DatosExtraidosBBDD.add(p);
        }
        // IMPRIME EN UNA SOLA LINEA TOD0 EL ARRAY LIST System.out.println(DatosExtraidosBBDD.toString());
        for (Paciente e:DatosExtraidosBBDD){
            System.out.println(e.toString());
        }
    }

    private static void addObjeto() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into paciente values (?,?,?,?)");
        ps.setString(1,p.getDni());
        ps.setString(2,p.getNombre());
        ps.setString(3,p.getApellidos());
        ps.setInt(4,p.getN_operaciones());
        ps.executeUpdate();
        System.out.println("Registro objeto insertado correctamente");
    }

    private static Paciente construirObjetoApartirDeOtraClase() {
        //generar un objeto de la clase paciente a partir de datos introducidos
        System.out.println("Introduzca el dni");
        String dni = sc.next();
        System.out.println("Introduzca el nombre");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido");
        String apellido = sc.next();
        System.out.println("Introduzca el número de operaciones");
        int n_operaciones = sc.nextInt();
        Paciente p = new Paciente(dni,nombre,apellido,n_operaciones);
        return p;
    }

    private static void consultar_registro() throws SQLException {
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("select * from paciente ");

        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("DNI "+rs.getString(1)+"Nombre "+ rs.getString(2)
                    +"Apellidos"+rs.getString(3)+"N operaciones "+rs.getInt(4));
        }
    }

    private static void actualizar_registro() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("update paciente set n_operaciones=? where dni=?");
        System.out.println("Introduzca el dni del paciente a actualizar");
        String dni = sc.next();
        System.out.println("Introduzca el valor correcto del nuevo de operaciones");
        int n_operaciones = sc.nextInt();
        ps.setInt(1,n_operaciones);
        ps.setString(2,dni);
        ps.executeUpdate();
        System.out.println("Paciente actualizado correctamente");
    }

    private static void borrar_registro() throws SQLException {
        asignar_bd();
        System.out.println("Introduzca el dni del paciente al cual quiere borrar");
        String dni = sc.next();
        PreparedStatement ps = conn.prepareStatement("delete from paciente where dni=?");
        ps.setString(1,dni);
        ps.executeUpdate();
    }

    private static void vaciar_tabla() throws SQLException {
        asignar_bd();
        String query = "truncate paciente";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Tabla vaciada correctamente");
    }

    private static void insertar_registro() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into paciente values (?,?,?,?)");
        System.out.println("Introduzca el dni");
        String dni = sc.next();
        System.out.println("Introduzca el nombre");
        String nombre = sc.next();
        System.out.println("Introduzca el apellido");
        String apellido = sc.next();
        System.out.println("Introduzca el número de operaciones");
        int n_operaciones = sc.nextInt();
        ps.setString(1,dni);
        ps.setString(2,nombre);
        ps.setString(3,apellido);
        ps.setInt(4,n_operaciones);
        ps.executeUpdate();
        System.out.println("Registro insertado correctamente");

    }

    private static void borrar_tabla() throws  SQLException{
        asignar_bd();
        String query= "drop table paciente";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Tabla borrada correctamente");
    }

    private static void crear_tabla() throws SQLException {

        //crear la tabla

       String query = "create table paciente(" +
                "dni varchar(9) primary key," +
                "nombre varchar(30) not null," +
                "apellidos varchar(100)," +
                "n_operaciones int)";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Tabla creado correctamente");


    }

    private static void crear_bd() throws SQLException {
        //crear la base de datos
        String query="create database ut14";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("BD creada correctamente");
        asignar_bd();

    }
    private static void asignar_bd() throws SQLException{

        // asignar la base de datos por defautl
        String query = "use ut14";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Asignación realizada correctamente");
    }
    private static void establecer_conexion() throws  SQLException{
        //conexión al sgbd

        String url = "jdbc:mysql://localhost:3306/";
        String user ="root";
        String pwd="03122002jaAR.";
         conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }
}