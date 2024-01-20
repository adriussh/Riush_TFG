package PrimerAnyo.SegundoTr.Sesion0202.EjerciciosIniciacionPOO.E1;

import java.util.Scanner;

public class UsoPlaneta {
    public static void main(String[] args) {

        Planeta JUPITER = new Planeta("JUPITER", 4, Math.pow(1.898, 27), Math.pow(1.4313, 15), 139, 778000000, TipoPlaneta.TERRESTRE,true);
        System.out.println("--------------- PLANETA 1 ---------------");
        System.out.println("- Su nombre es "+JUPITER.getNombre());
        System.out.println("- Número de satelites: "+JUPITER.getN_satelites());
        System.out.println("- Su masa es: "+JUPITER.getMasa()+" km2.");
        System.out.println("- Su volumen es: "+JUPITER.getVolumen()+" km3.");
        System.out.println("- Su diametro es: "+JUPITER.getDiametro()+" km.");
        System.out.println("- Su densidad es: "+JUPITER.densidaad()+" kg/m3.");
        System.out.println("- Distancia entre el planeta y el Sol: "+JUPITER.getDist_sol()+" km.");
        System.out.println("- Tipo de planeta: "+JUPITER.getTipo_planeta());
        System.out.println("- ¿Es visible a simple vista?: "+JUPITER.esPlanetaExterior());

        System.out.println("--------------- PLANETA 2 ---------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nombre del planeta.");
        String nombre=sc.next();
        System.out.println("¿Cuántos satelites tiene?");
        int satelites=sc.nextInt();
        System.out.println("Indique su masa.");
        double masa = sc.nextDouble();
        System.out.println("Indique su volumen.");
        double volumen = sc.nextDouble();
        System.out.println("Indique su diametro.");
        int diametro = sc.nextInt();
        System.out.println("Distancia entre el Sol y el planeta en cuestión.");
        int distancia_sol = sc.nextInt();
        System.out.println("¿Qué tipo de planeta es?");
        String tip_p = sc.next().toUpperCase();
        System.out.println("¿Es visible a simple vista?");
        char opcion = sc.next().toUpperCase().charAt(0);
        boolean obsevable=false;
        if (opcion=='S'){
            obsevable=true;
        }
    }
}
