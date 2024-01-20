package PrimerAnyo.Practicas.PracticasPrimerTr.Practica1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Inicializacion variable principal.
        int requisito_trabajo;
        //Mensajes introductorios dirigidos al usuario.
        System.out.println("\u001B[0m >>>>>>> \033[33m¡Sea bienvenido al procedimiento de solicitud de hipotecas!\u001B[0m <<<<<<<");
        System.out.println("Por favor, responda PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a continuacion la serie de preguntas que se mostraran por pantalla.");
        System.out.println("\033[33m¿Usted esta trabajando actualmente? Si la respuesta es afirmativa introduzca 0 y si es negativa 1.");
        Scanner rt = new Scanner(System.in);
        requisito_trabajo = rt.nextInt();
        //Inicio Switch.
        switch (requisito_trabajo) {
            case 0:
                //Inicializacion variables requeridas para los calculos.
                int monto_solicitado;
                int Valor_vivienda;
                int dinero_ahorrado;
                double porcentaje_ochenta = 80;
                double porcentaje_veinte = 20;
                System.out.println("Introduzca ahora el valor de la vivienda.");
                Scanner vv = new Scanner(System.in);
                Valor_vivienda = vv.nextInt();
                System.out.println("Inserte el monto que desea solicitar.");
                Scanner ms = new Scanner(System.in);
                monto_solicitado = ms.nextInt();
                //Inicializacion variables que contienen el resultado de los calculos.
                double multiplicacionA;
                double multiplicacionB;
                //Asignacion de valores PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a las nuevas variables.
                multiplicacionA = Valor_vivienda * porcentaje_ochenta / 100;
                multiplicacionB = Valor_vivienda * porcentaje_veinte / 100;
                //Si no cumple uno de estos If's automaticamente se cancela la solicitud.
                if (monto_solicitado <= multiplicacionA) {
                    System.out.println("Inserte el dinero que tiene ahorrado como inicial de la vivienda.");
                    Scanner da = new Scanner(System.in);
                    dinero_ahorrado = da.nextInt();
                    if (dinero_ahorrado >= multiplicacionB) {
                        System.out.println("\033[32m¡Usted cumple todos los requisitos para la tramitación de la hipoteca!");
                        return;
                    }
                }
            case 1:
                System.out.println("\033[31mLamentablemente usted no cumple los requisitos para continuar con la solicitud.");
        }
    }
}
