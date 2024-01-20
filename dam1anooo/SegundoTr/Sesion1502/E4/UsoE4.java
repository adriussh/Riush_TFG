package PrimerAnyo.SegundoTr.Sesion1502.E4;

import java.util.Scanner;

public class UsoE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("------------------ Hospital ------------------");
        Paciente p1 = new Paciente();
        System.out.println("--- Paciente 1 ---");
        System.out.println("- Introduzca su dni: ");
        p1.setDni(sc.next());
        System.out.println("- Introduzca su nombre: ");
        p1.setNombre(sc.nextLine());

        Paciente p2 = new Paciente();
        System.out.println("- Introduzca su dni: ");
        p2.setDni(sc.next());
        System.out.println("- Introduzca su nombre: ");
        p2.setNombre(sc.nextLine());

        Paciente p3 = new Paciente();
        System.out.println("--- Paciente 3 ---");
        System.out.println("- Introduzca su dni: ");
        p3.setDni(sc.next());
        System.out.println("- Introduzca su nombre: ");
        p3.setNombre(sc.nextLine());


    }
}
