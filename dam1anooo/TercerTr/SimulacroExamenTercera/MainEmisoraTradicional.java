package PrimerAnyo.TercerTr.SimulacroExamenTercera;

import java.sql.*;
import java.util.Scanner;

public class MainEmisoraTradicional {
    static Connection conn;
    static EmisoraTradicional[] array_estatico;
    static Scanner sc = new Scanner(System.in);
    static{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws AccionInvalida, SQLException {
        int opcion = 0;
        do {
            System.out.println("0. Si desea salir del programa ");
            System.out.println("1. Crear BBDD simulacroexamen");
            System.out.println("2. Crear tabla emisoratradicional");
            System.out.println("3. Insertar nuevo registro a la tabla.");
            opcion=sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el program");break;
                case 1:
                    crear_bd();break;
                case 2:
                    crear_tabla_emisora();break;
                case 3:
                    insertar_array_estatico();break;
            }
        }while (opcion != 0);
    }

    private static void insertar_array_estatico() throws AccionInvalida, SQLException {
        System.out.println("Introduzca el numero de emisoras que quiere introducir en la BBDD");
        int dimension = sc.nextInt();
        //se dimensiona el array
        array_estatico = new EmisoraTradicional[dimension];
        //rellenar array estatico
        for (int i = 0; i<array_estatico.length; i++){
            System.out.println("procedemos a la insersion en el array de la posicion "+i);
            System.out.println("Indique el identificador de la emisora");
            int num_emisora = sc.nextInt();
            System.out.println("Indique el nombre de la emisora");
            String nombre_emisora = sc.next();
            System.out.println("Introduzca el numero de oyentes");
            int num_oyentes = sc.nextInt();
            System.out.println("Indique la frecuencia de la emisora: AM o FM");
            String frecuencia = sc.next();
            System.out.println("Introduzca el numero de la frecuencia");
            double num_frecuencia = sc.nextDouble();

            EmisoraTradicional e = new EmisoraTradicional(num_emisora,nombre_emisora,num_oyentes,frecuencia,num_frecuencia);
            array_estatico[i]=e;
        }

        for (int j = 0; j<array_estatico.length; j++){
            PreparedStatement ps = conn.prepareStatement("insert into emisoratradicional values (?,?,?,?,?,?,?)");
            ps.setInt(1,array_estatico[j].getNum_emisora());
            ps.setString(2,array_estatico[j].getNombre_emisora());
            ps.setBoolean(3,array_estatico[j].isEmitiendo());
            ps.setDouble(4,array_estatico[j].getBeneficios());
            ps.setInt(5,array_estatico[j].getNum_oyentes());
            ps.setString(6,array_estatico[j].getFrecuencia().toString());
            ps.setDouble(7,array_estatico[j].getNum_frecuencia());
            ps.executeUpdate();
        }
    }

    private static void crear_tabla_emisora() throws SQLException {
        establecer_conexion();
        String query = "create table if not exists emisoratradicional(" +
                "num_emisora int not null primary key," +
                "nombre varchar(50) not null," +
                "emitiendo boolean," +
                "beneficios double," +
                "num_oyentes int," +
                "frecuencia varchar(10)," +
                "num_frecuencia double," +
                "url varchar(100)"+
                ");";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void establecer_conexion() throws SQLException {
        //conexión al sgbd

        String url = "jdbc:mysql://localhost:3306/simulacroexamen";
        String user ="root";
        String pwd="admin";
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }

    private static void crear_bd() throws SQLException {
        String query="create database if not exists simulacroexamen";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }
}
