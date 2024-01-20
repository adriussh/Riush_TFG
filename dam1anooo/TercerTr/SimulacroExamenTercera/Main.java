package PrimerAnyo.TercerTr.SimulacroExamenTercera;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static EmisoraOnline[] listado_emisoras;
    static ArrayList<EmisoraOnline> arrayList_emisora = new ArrayList<>();
    static Connection conn = null;
    public static void main(String[] args) throws SQLException, AccionInvalida {
        int opcion = 0;

        do {
            System.out.println("0. Salir programa");
            System.out.println("1. Crear base de datos simulacroexamen");
            System.out.println("2. Crear la tabla emisoraonline");
            System.out.println("3. Insertar jugador");
            System.out.println("4. Buscar emisora por url introducida por teclado y añadirlo a un array estatico");
            System.out.println("5. Almacenar en el arraylist emisoras con beneficios superiores a 4000 pavos");
            System.out.println("6. Sacar la version del SGBD");
            System.out.println("Introduzca una opcion por favor");
            opcion=sc.nextInt();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","admin");
            establecer_conexion();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");break;
                case 1:
                    crear_bd();break;
                case 2:
                    crear_tabla_emisora();break;
                case 3://crear objeto de la clase emisora
                    EmisoraOnline e = new EmisoraOnline(1,"Los 40",1000,"www.los40.com");
                    insertar_emisora(e);break;
                case 4:
                    System.out.println("Inserte el numero de oyentes maximo para el filtrado");
                    int num_oyentes = sc.nextInt();
                    buscar_anadir_array_estatico(num_oyentes);break;
                case 5:
                    anadir_arraylist_beneficios();break;
                case 6:
                    String versionSGBD = sacar_versionSGBD();
                    System.out.println("La version SGBD: "+versionSGBD);break;
                default:
                    System.out.println("opcion invalida");break;
            }
        }while (opcion!=0);
    }

    private static void buscar_anadir_array_estatico(int num_oyentes) throws SQLException, AccionInvalida {
        PreparedStatement ps = conn.prepareStatement("select count(*) from emisoraonline where num_oyentes < ?");
        ps.setInt(1,num_oyentes);
        ResultSet rs = ps.executeQuery();
        int dimension=0;
        while (rs.next()){
            dimension = rs.getInt(1);
        }
        listado_emisoras = new EmisoraOnline[dimension];
        ps = conn.prepareStatement("select * from emisoraonline where num_oyentes<?");
        ps.setInt(1,num_oyentes);
        rs = ps.executeQuery();
        int i = 0;
        while (rs.next()){
            EmisoraOnline e = new EmisoraOnline(rs.getInt(1),rs.getString(2),rs.getInt(5),rs.getString(6));
            listado_emisoras[i]=e;
            i++;
        }
        for (int j=0; j<listado_emisoras.length; j++){
            System.out.println(listado_emisoras[j].toString());
        }
        System.out.println(Arrays.toString(listado_emisoras));
    }

    private static void anadir_arraylist_beneficios() throws SQLException, AccionInvalida {
        PreparedStatement ps = conn.prepareStatement("select * from emisoraonline where beneficios>3000");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            if (rs.getDouble(4)>3000){
                EmisoraOnline e = new EmisoraOnline(rs.getInt(1),rs.getString(2),rs.getInt(5),rs.getString(6));
                arrayList_emisora.add(e);
            }
        }
        for (EmisoraOnline e:arrayList_emisora){
            System.out.println(e.toString());
        }

    }

    private static void insertar_emisora(EmisoraOnline e) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into emisoraonline values (?,?,?,?,?,?)");
        ps.setInt(1,e.getNum_emisora());
        ps.setString(2,e.getNombre_emisora());
        ps.setBoolean(3,e.emitiendo);
        ps.setDouble(4,e.getBeneficios());
        ps.setInt(5,e.getNum_oyentes());
        ps.setString(6,e.getUrl());
        ps.executeUpdate();
        System.out.println("El registro se inserto correctamente");
    }

    private static void crear_tabla_emisora() throws SQLException {
        establecer_conexion();
        String query = "create table emisoraonline(" +
                "num_emisora int not null primary key," +
                "nombre varchar(50) not null," +
                "emitiendo boolean," +
                "beneficios double," +
                "num_oyentes int," +
                "url varchar(100)"+
                ");";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void crear_bd() throws SQLException {
        String query="create database if not exists simulacroexamen";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static String sacar_versionSGBD() throws SQLException {
        DatabaseMetaData dt = conn.getMetaData();
        return dt.getDatabaseProductVersion();
    }

    private static void establecer_conexion() throws SQLException {
        //conexión al sgbd

        String url = "jdbc:mysql://localhost:3306/simulacroexamen";
        String user ="root";
        String pwd="admin";
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }
}
