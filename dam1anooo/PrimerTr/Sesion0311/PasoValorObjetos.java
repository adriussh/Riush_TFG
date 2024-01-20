package PrimerAnyo.PrimerTr.Sesion0311;

import PrimerAnyo.PrimerTr.Sesion0211.Persona;

public class PasoValorObjetos {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre="Elena";
        System.out.println(p1.nombre);
        transformarNombre(p1);
        System.out.println("Despúes de pasarle el método tranformarNombre...");
        System.out.println("El nombre es "+p1.nombre);
    }
    static void transformarNombre(Persona p) {
        p.nombre = "Javier";
    }
}
