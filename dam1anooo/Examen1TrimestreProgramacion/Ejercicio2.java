package PrimerAnyo.Examen1TrimestreProgramacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] comunidad = new String[3][2];
        comunidad = inicializar(comunidad);
        imprimir_comunidad(comunidad);
        double presupuesto_total= sacar_presupuesto_total();
        System.out.println("La comunidad paga en cuotas "+presupuesto_total);
        System.out.println("¿Quiere saber si hay vecinos que se llaman igual? S/N");
        char opcion =sc.next().toUpperCase().charAt(0);
        if (opcion=='S'){
            System.out.println("Digame el nombre");
            String nombre=sc.next();
            buscarvecino(nombre,comunidad);
        }


    }

    private static void buscarvecino(String nombre, String[][] comunidad) {

        int numero_vecino=0;
        for (int i=0;i< comunidad.length;i++){
            for (int j=0;j<comunidad[i].length;j++) {

                if (comunidad[i][j].equals(nombre.toUpperCase()))
                {
                    numero_vecino++;
                }

            }
            }
        if (numero_vecino==0){
            System.out.println("No hay vecinos con ese nombre");

        }
        else {

            System.out.println("El número de vecinos llamad@s "+nombre+" es de "+numero_vecino);
        }

    }

    private static void imprimir_comunidad(String[][] comunidad) {
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< comunidad.length;i++){
            for (int j=0;j<comunidad[i].length;j++){

                if (i==0) {
                    switch (j) {
                        case 0:
                            System.out.println("El nombre del propietario del " + Ordinales.primero + " A es "+comunidad[i][j]);
                             break;
                        case 1:
                            System.out.println("El nombre del propietario del " + Ordinales.primero + " B es "+comunidad[i][j]);
                            break;

                    }
                }
                if (i==1) {
                    switch (j) {
                        case 0:
                            System.out.println("El nombre del propietario del " + Ordinales.segundo + " A es "+comunidad[i][j]);
                            break;
                        case 1:
                            System.out.println("El nombre del propietario del " + Ordinales.segundo + " B es "+comunidad[i][j]);
                            break;

                    }
                }
                if (i==2){
                    switch(j){
                        case 0:
                            System.out.println("El nombre del propietario del " + Ordinales.tercero + " A es "+comunidad[i][j]);
                            break;
                        case 1:
                            System.out.println("El nombre del propietario del " + Ordinales.tercero + " B es "+comunidad[i][j]);
                            break;
                    }
                }

            }
        }
    }

    private static double sacar_presupuesto_total() {
       // for (int i=0;)
        final double CUOTA_PRIMERO=50.25;
        final double CUOTA_SEGUNDO=78.15;
        final double CUOTA_TERCERO=96.4;
        double prespuesto=0;
        prespuesto=2*CUOTA_PRIMERO+2*CUOTA_SEGUNDO+2*CUOTA_TERCERO;
        return prespuesto;
    }

    //inicializar el bloque
    private static String[][] inicializar(String[][] comunidad) {
         Scanner sc = new Scanner(System.in);
         for (int i=0;i< comunidad.length;i++){
             for (int j=0;j<comunidad[i].length;j++){

                 if (i==0) {
                     switch (j) {
                         case 0:
                             System.out.println("Introduzcame el nombre del " + Ordinales.primero + " A");
                             comunidad[i][j] = sc.next().toUpperCase();
                             break;
                         case 1:
                             System.out.println("Introduzcame el nombre del " + Ordinales.primero + " B");
                             comunidad[i][j] = sc.next().toUpperCase();
                             break;

                     }
                 }
                    if (i==1) {
                        switch (j) {
                            case 0:
                                System.out.println("Introduzcame el nombre  del " + Ordinales.segundo + " A");
                                comunidad[i][j] = sc.next().toUpperCase();
                                break;
                            case 1:
                                System.out.println("Introduzcame el nombre del " + Ordinales.segundo + " B");
                                comunidad[i][j] = sc.next().toUpperCase();
                                break;

                        }
                    }
                    if (i==2){
                         switch(j){
                             case 0:  System.out.println("Introduzcame el nombre del "+Ordinales.tercero+" A");
                                 comunidad[i][j]= sc.next().toUpperCase();
                                 break;
                             case 1:  System.out.println("Introduzcame el nombre  del "+Ordinales.tercero+" B");
                                 comunidad[i][j]= sc.next().toUpperCase();
                                 break;

                         }
                 }

             }
         }
         return comunidad;
    }






}
