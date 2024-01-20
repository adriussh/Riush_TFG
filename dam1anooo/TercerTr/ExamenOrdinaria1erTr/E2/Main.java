package PrimerAnyo.TercerTr.ExamenOrdinaria1erTr.E2;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static Double[][] array = null;
    static Connection conn=null;
    static Scanner sc = new Scanner(System.in);
    static Asignatura n1;
    public static void main(String[] args) throws SQLException {
        int opcion=0;

        int dimension = 0;
        do {
            System.out.println("0. Salir.");
            System.out.println("1. Crear array estatico de notas");
            System.out.println("2. Rellenar array estatico con elementos.");
            System.out.println("3. EnViar ARRAY datos a BBDD");
            System.out.println("4. Nota media por asignatura. 1.Programacion, 2.BBDD, 3.EEDD");
            System.out.println("5. Nota media de las asignaturas.");
            System.out.println("Introduzca opción.");
            opcion=sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Bye's");break;
                case 1:
                    crear_array();break;
                case 2:
                    rellenar_array();break;
                case 3:
                    insertar_array_enbbdd();break;
                case 4:
                    crear_Tabla();
                    double media=nota_media_per_asignatura();
                    System.out.println(media+" como nota media");break;
                case 5: ;break;
                default:
                    System.out.println("Opcion incorrecta");break;
            }

        }while (opcion!=0);
    }

    private static void establish_connection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/notas","root","admin");
    }

    private static void insertar_array_enbbdd() throws SQLException {
        establish_connection();
        crear_database();
        crear_Tabla();
        PreparedStatement ps = conn.prepareStatement("insert into asignatura values (?,?,?,?)");
        String asignatura="";
        int id=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                switch (i){
                    case 0:
                        asignatura="Programacion";break;
                    case 1:
                        asignatura="BBDD";break;
                    case 2:
                        asignatura="EEDD";break;
                }
                n1=new Asignatura(id,asignatura,array[i][0],array[i][1]);
                ps.setInt(1,id);
                ps.setString(2,asignatura);
                ps.setDouble(3,array[i][0]);
                ps.setDouble(4,array[i][1]);
                ps.executeUpdate();
            }
        }
    }

    private static void crear_Tabla() throws SQLException {
        establish_connection();
        String query=  "create table if not exists asignatura(" +
                "id int primary key," +
                "nombre varchar(25)," +
                "nota_examen double," +
                "nota_practica double" +
                ")";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static void crear_database() throws SQLException {
        establish_connection();
        String query = "create database if not exists notas";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }

    private static double nota_media_per_asignatura() {
        double total = 0;
        System.out.println("> De que asignatura desea saber la nota media.");
        String asignatura=sc.next().toUpperCase();
        switch (asignatura){
            case "PROGRAMACION":
                total=(array[0][0]*array[0][1])/2;break;
            case "BBDD":
                total=(array[1][0]*array[1][2])/2;break;
            case "EEDD":
                total=(array[2][0]*array[2][3])/2;break;
            default:
                System.out.println("opcion incorrecta");break;
        }
        return total;
    }


    private static void rellenar_array() {

        for (int i = 0; i< Main.array.length; i++){

            for (int j = 0; j< Main.array[i].length; j++){
                if (i==0){
                    switch (j){
                        case 0:
                            System.out.println("Introduzca la nota de examen de programacion");
                            Main.array[i][j] = sc.nextDouble();
                            break;
                        case 1:
                            System.out.println("Introduzca la nota de practica de programacion");
                            Main.array[i][j] = sc.nextDouble();
                            break;
                    }
                }
                if (i==1){
                    switch (j) {
                        case 0:
                            System.out.println("Introduzca la nota de examen de BBDD");
                            Main.array[i][j] = sc.nextDouble();
                            break;
                        case 1:
                            System.out.println("Introduzca la nota de practica de BBDD");
                            Main.array[i][j] = sc.nextDouble();
                            break;
                    }
                }
                if (i==2){
                    switch (j) {
                        case 0:
                            System.out.println("Introduzca la nota de examen de Entornos");
                            Main.array[i][j] = sc.nextDouble();
                            break;
                        case 1:
                            System.out.println("Introduzca la nota de practica de Entornos");
                            Main.array[i][j] = sc.nextDouble();
                            break;
                    }
                }

            }
        }
    }

    private static void crear_array() {
        array = new Double[3][2];
    }
}
