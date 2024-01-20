package PrimerAnyo.TercerTr.Sesion0505;

import PrimerAnyo.TercerTr.Sesion0405.Paciente;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {
    public static Connection conn = null;

    public static Paciente p = null;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        int opcion = 0;
        String dni = "";
        String nombre = "";
        String apellidos = "";
        int n_operaciones = 0;
        do {
            System.out.println("0. Salir del programa.");
            System.out.println("1. Insertar nuevo registro.");
            System.out.println(".................");
            opcion=sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el progrrrrrrrrram");break;
                case 1:
                    p = construirObjeto();
                    addObjeto(p);break;
                default:
                    System.out.println("Indique una opcion correcta.");break;
            }
        }while (opcion!=0);
    }

    private static Paciente construirObjeto() {
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

    private static void addObjeto(Paciente paciente) throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into paciente values (?,?,?,?)");
        ps.setString(1,p.getDni());
        ps.setString(2,p.getNombre());
        ps.setString(3,p.getApellidos());
        ps.setInt(4,p.getN_operaciones());
        ps.executeUpdate();
        System.out.println("Registro objeto insertado correctamente");
    }

    private static void asignar_bd() throws SQLException{

        // asignar la base de datos por defautl
        String query = "use ut14";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Asignación realizada correctamente");
    }
}
