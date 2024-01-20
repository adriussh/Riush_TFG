package PrimerAnyo.SegundoTr.Sesion1302.Herencia;

public class UsoHerencia {
    public static void main(String[] args) {
       //Persona p1= new Persona();

        Alumno al1 = new Alumno("1234asdasd", "Xapote", 25, 1600);
        System.out.println("El alumno tiene el dni "+
                al1.getDni()+" con nombre "+
                al1.getNombre()+" con edad "+al1.getEdad()+" y ha percibido una beca de "+
                al1.getBeca()+" euros.");
        System.out.println("El toString del alumno es "+al1.toString());

        Profesor pf1 = new Profesor("1223122123d", "Vladimir", 30, 1700, 12312312);
        System.out.println("El profesor tiene el dni "+
                pf1.getDni()+" con nombre "+
                pf1.getNombre()+" con edad "+pf1.getEdad()+" y ha percibido una beca de "+
                pf1.getBeca()+" euros.");
        System.out.println("El toString del profesor es "+pf1.toString());

    }
}
