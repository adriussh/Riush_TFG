package PrimerAnyo.SegundoTr.Sesion0901;

public class UsoPersona {
    public static void main(String[] args) {
        System.out.println("---------Persona 1--------");
        Persona p1 = new Persona();
        p1.setDni("49453341R");
        p1.setNombre("Alejandro");
        p1.setApellidos("Ramiréz");
        System.out.println("NOMBRE:      "+p1.getNombre());
        System.out.println("APELLIDOS:   "+p1.getApellidos());
        System.out.println("DNI:         "+p1.getDni());
        System.out.println("EDAD:        "+p1.getEdad());

        Persona p2 = new Persona();
        System.out.println("---------Persona 2--------");
        p2.setDni("51263349M");
        p2.setNombre("Freddy");
        p2.setApellidos("Mercurio");
        System.out.println("NOMBRE:      "+p2.getNombre());
        System.out.println("APELLIDOS:   "+p2.getApellidos());
        System.out.println("DNI:         "+p2.getDni());
        System.out.println("EDAD:        "+p2.getEdad());
    }
}
