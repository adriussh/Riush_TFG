package PrimerAnyo.PrimerTr.Sesion0510;

public class OperadorInstance {

    public static void main(String[] args) {

        Integer i=5;
        String nombre="Javier";
        System.out.println("La variable i es instancia de clase envoltorio (Wrapper) Integer");
        System.out.println(i instanceof Integer);
        //System.out.prinln(i.getClass());
        System.out.println(i.getClass());
        System.out.println("La variable nombre es instancia de clase String");
        System.out.println(nombre instanceof String);
        //nombre.getClass();

    }
}
