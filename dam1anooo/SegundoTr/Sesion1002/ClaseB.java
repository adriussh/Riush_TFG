package PrimerAnyo.SegundoTr.Sesion1002;

public class ClaseB extends ClaseA{
    ClaseB(){
        System.out.println("El constructor B");
    }
    ClaseB(String mensaje){
        super(mensaje);
        System.out.println(mensaje);
    }
    ClaseB(int numero){
        super(numero);
        System.out.println(numero);
    }
}
