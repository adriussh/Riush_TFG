package PrimerAnyo.PrimerTr.Sesion0211;

import java.util.Scanner;

public class UsoPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("Introduzca el nombre de la persona");
        Scanner sc = new Scanner(System.in);
        persona.nombre=sc.next();
        System.out.println("Introduzca la eda de la persona");
        persona.edad=sc.nextInt();
        System.out.println(persona.nombre+" nació en el año "+persona.obtenerAnyo(persona.edad));
    }
}
