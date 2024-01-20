package PrimerAnyo.SegundoTr.Sesion2002.EjerciciosExcepciones.E1;

public class UsoCuenta {
    public static void main(String[] args) throws CantidadIncorrecta{

        Cuenta c1 = new Cuenta("Javier","12345", 12223.12);
        System.out.println(c1.toString());
        c1.ingresar(1200);
        System.out.println(c1.toString());
        c1.retirar(200000);
    }
}
