package PrimerAnyo.ExtraFinalCurso.Sesion1406;

import java.sql.*;
import java.util.*;

public class Main {
    static Profesor p1 = null;
    static ArrayList<Profesor> lista_profesores = new ArrayList<>();
    static Connection conn = null;
    static ArrayList<Profesor> profesores_bd= null;
    static Categoria[] categoriaas = Categoria.values();
    static Nivel[] niveel = Nivel.values();
    static Grado[] gradoo = Grado.values();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws AccionIncorrecta, SQLException {
        int opcion =0;
        do {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------");
            System.out.println("0.  Salir del programa.");
            System.out.println("1.  Conectar al SGBD.");
            System.out.println("2.  Crear BBDD.");
            System.out.println("3.  Crear tabla profesor.");
            System.out.println("4.  Insertar registro.");
            System.out.println("5.  Consultar registro por id e insertar en ArrayList.");
            System.out.println("6.  Insertar registros que tengan un salario mayor al indicado por parametria e insertarlo en ArrayList.");
            System.out.println("7.  Imprimir ArrayList ordenado por por experiencia ascendente y salario descendente");
            System.out.println("8.  Crear un arraylist a partir de los datos que ya hay almacenados en la BD.");
            System.out.println("9.  Insertar en bd un array estático. Se le preguntará al usuario su dimensión para luego ir solicitando los datos.");
            System.out.println("10. Comparar el contenido de lista_profesores y profesores_bd e imprimir “todo correcto” si ambos poseen el mismo contenido.");
            System.out.println("11. Mostrar la url de la conexión y la versión del SGBD empleado.");
            System.out.println("-----------------------------Waiting option--------------------------------------------------------------------------------");
            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("Grax por usar el programa.");break;

                case 1:
                    conectarSGBD();break;

                case 2:
                    crearBBDD();break;

                case 3:
                    crearTable();break;

                case 4:
                    System.out.println("Inserte el id del profesor");
                    int id = sc.nextInt();
                    System.out.println("La categoria: "+ Arrays.toString(categoriaas));
                    String categoria = sc.next().toUpperCase();
                    System.out.println("El nivel: "+Arrays.toString(niveel));
                    String nivel = sc.next().toLowerCase();
                    System.out.println("Años de experiencia");
                    int anyo_experiencia = sc.nextInt();
                    System.out.println("Fecha del contrato. Tiene que ser en formato ingles YYYY-MM-DD");
                    String fecha_contrato = sc.next();
                    System.out.println("Instituto del profesor");
                    String ies = sc.next();
                    System.out.println("Esta activo? true o false.");
                    boolean activo = sc.nextBoolean();
                    System.out.println("Grado del profesor: "+Arrays.toString(gradoo));
                    String grado = sc.next().toUpperCase();
                    p1 = new Profesor(id,Categoria.valueOf(categoria),Nivel.valueOf(nivel),anyo_experiencia,fecha_contrato,ies,activo,Grado.valueOf(grado));
                    insertarRegistroBD(p1);break;

                case 5:
                    System.out.println("Inserte el id del profesor");
                    id = sc.nextInt();
                    p1 = retornarRegistroEnArrayList(id);
                    System.out.println(p1.toString());
                    System.out.println(" ");break;

                case 6:
                    System.out.println("Indique el valor MÍNIMO por el que desea filtrar los registros.");
                    double valorMax = sc.nextDouble();
                    insertarEnArrayList(valorMax);break;

                case 7:
                    ordenarArrayList();break;

                case 8:
                    profesores_bd = creacionArrayList2();
                    for (Profesor p:profesores_bd){
                        System.out.println(" ");
                        System.out.println(p.toString());
                        System.out.println(" ");
                    }
                    break;

                case 9:

                    System.out.println("Indique la dimension del array estatico");
                    int dimension = sc.nextInt();
                    Profesor[] lista_profesores_estatico = new Profesor[dimension];
                    for (int i=0; i < dimension; i++){
                        System.out.println("Inserte el id del profesor");
                        id = sc.nextInt();
                        System.out.println("La categoria: "+Arrays.toString(categoriaas));
                        categoria = sc.next().toUpperCase();
                        System.out.println("El nivel: "+Arrays.toString(niveel));
                        nivel = sc.next().toLowerCase();
                        System.out.println("Años de experiencia");
                        anyo_experiencia = sc.nextInt();
                        System.out.println("Fecha del contrato. Tiene que ser en formato ingles YYYY-MM-DD");
                        fecha_contrato = sc.next();
                        System.out.println("Instituto del profesor");
                        ies = sc.next();
                        System.out.println("Esta activo? true o false.");
                        activo = sc.nextBoolean();
                        System.out.println("Grado del profesor: "+Arrays.toString(gradoo));
                        grado = sc.next().toUpperCase();
                        p1 = new Profesor(id,Categoria.valueOf(categoria),Nivel.valueOf(nivel),anyo_experiencia,fecha_contrato,ies,activo,Grado.valueOf(grado));
                        lista_profesores_estatico[i]=p1;
                    }
                    insertarEnArrayEstatico(lista_profesores_estatico);
                    break;
                case 10:
                    comparacionArrayLists();break;
                case 11:
                    mostrarMetadatos();break;
                default:
                    System.out.println("Inserte una opcion correcta.");
                    System.out.println(" ");break;
            }
        }while (opcion!=0);
    }

    private static void mostrarMetadatos() throws SQLException {
        DatabaseMetaData dm = conn.getMetaData();
        String texto = "-URL: " + dm.getURL();
        texto += " -SGBD: " + dm.getDatabaseProductVersion();
        System.out.println(texto);
        System.out.println(" ");
    }

    private static void comparacionArrayLists() {
        if (lista_profesores.equals(profesores_bd)){
            System.out.println("¡Todo correcto!");
            System.out.println(" ");
        }
        else {
            System.out.println("No esta correcto...");
            System.out.println(" ");
        }
    }


    private static void insertarEnArrayEstatico(Profesor[] lista_profesores_estatico) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into profesor values (?,?,?,?,?,?,?,?,?)");
        for (int i=0; i<lista_profesores_estatico.length; i++){
            ps.setString(1,lista_profesores_estatico[i].getGrado().toString());
            ps.setString(2,lista_profesores_estatico[i].getIes());
            ps.setBoolean(3,lista_profesores_estatico[i].isActivo());
            ps.setDouble(4,lista_profesores_estatico[i].getSalario());
            ps.setString(5,lista_profesores_estatico[i].getCategoria().toString());
            ps.setString(6,lista_profesores_estatico[i].getNivel().toString());
            ps.setInt(7,lista_profesores_estatico[i].getId());
            ps.setInt(8,lista_profesores_estatico[i].getAnyo_experiencia());
            ps.setString(9,lista_profesores_estatico[i].getFecha_contrato());
            ps.execute();
        }
        System.out.println("Registro Insertado.");
        System.out.println(" ");
    }

    private static ArrayList<Profesor> creacionArrayList2() throws SQLException, AccionIncorrecta {
        lista_profesores.clear();
        PreparedStatement ps = conn.prepareStatement("select * from profesor");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            p1=new Profesor(rs.getInt(7), Categoria.valueOf(rs.getString(5)),Nivel.valueOf(rs.getString(6)),rs.getInt(8),rs.getString(9),rs.getString(2),rs.getBoolean(3),Grado.valueOf(rs.getString(1)));
            lista_profesores.add(p1);
        }
        return lista_profesores;
    }

    private static void ordenarArrayList() {
        lista_profesores.sort(Comparator.comparing(Funcionario::getAnyo_experiencia).thenComparing(Funcionario::getSalario).reversed());
        imprimirArrayList();
    }

    private static void insertarEnArrayList(double valorMax) throws SQLException, AccionIncorrecta {
        lista_profesores.clear();
        PreparedStatement ps = conn.prepareStatement("select * from profesor where salario >= ?");
        ps.setDouble(1,valorMax);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            p1=new Profesor(rs.getInt(7), Categoria.valueOf(rs.getString(5)),Nivel.valueOf(rs.getString(6)),rs.getInt(8),rs.getString(9),rs.getString(2),rs.getBoolean(3),Grado.valueOf(rs.getString(1)));
            lista_profesores.add(p1);
        }
        imprimirArrayList();
    }

    private static void imprimirArrayList() {
        for (Profesor p:lista_profesores){
            System.out.println(" ");
            System.out.println(p.toString());
            System.out.println(" ");
        }
    }

    private static Profesor retornarRegistroEnArrayList(int id) throws SQLException, AccionIncorrecta {
        Profesor pp = null;
        PreparedStatement ps = conn.prepareStatement("select * from profesor where id = ?");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            pp = new Profesor(rs.getInt(7), Categoria.valueOf(rs.getString(5)),Nivel.valueOf(rs.getString(6)),rs.getInt(8),rs.getString(9),rs.getString(2),rs.getBoolean(3),Grado.valueOf(rs.getString(1)));
        }
        return pp;
    }

    private static void insertarRegistroBD(Profesor p1) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into profesor values (?,?,?,?,?,?,?,?,?)");
        ps.setString(1,p1.getGrado().toString());
        ps.setString(2,p1.getIes());
        ps.setBoolean(3,p1.isActivo());
        ps.setDouble(4,p1.getSalario());
        ps.setString(5,p1.getCategoria().toString());
        ps.setString(6,p1.getNivel().toString());
        ps.setInt(7,p1.getId());
        ps.setInt(8,p1.getAnyo_experiencia());
        ps.setString(9,p1.getFecha_contrato());
        ps.execute();
        System.out.println("Registro Insertado.");
        System.out.println(" ");
    }

    private static void crearBBDD() throws SQLException {
        String query = "create database if not exists ejercicio_repaso";
        Statement st = conn.createStatement();
        st.execute(query);
        query = "use ejercicio_repaso";
        st.execute(query);
        System.out.println("Creacion y asignacion realizada.");
        System.out.println(" ");
    }

    private static void crearTable() throws SQLException {
        String query = "create table if not exists profesor(" +
                "grado varchar(50)," +
                "ies varchar(50)," +
                "activo boolean," +
                "salario double," +
                "categoria varchar(2)," +
                "nivel varchar(5)," +
                "id int primary key," +
                "anyos_experiencia int," +
                "fecha_contrato varchar(25)" +
                ")";
        Statement st = conn.createStatement();
        st.execute(query);
        System.out.println("Tabla creada con exito");
        System.out.println(" ");
    }

    private static void conectarSGBD() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "admin";
        conn = DriverManager.getConnection(url,user,pass);
        System.out.println("Conexion hecha.");
        System.out.println("");
    }
}
