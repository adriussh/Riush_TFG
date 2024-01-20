package PrimerAnyo.Practicas.PracticasPrimerTr.Practica2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Inicialización scanner.
        String opcion="";
        // Mensaje introductorio previos al Do-While.
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\u001B[0m *|- \033[33m Bienvenido al sistema de gestión de temperaturas de la Comunidad de Madrid. \u001B[0m -|*");
        System.out.println("-------------------------------------------------------------------------------------------------");

        /*Redirección al método o función que toma las temperaturas con las que se va a trabajar. Las perdirá
        solo una vez y trabajará con ellas hasta que el usuario no desee continuar ("SALIR").
         */
        double[] array_temps = introduccion_temps(opcion);

        //Inicio Do-While
        do {
            //Mensajes introductorios al programa que se repetiran hasta que el usuario no desee continuar.
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("Si desea continuar escriba '\033[32mCONTINUAR\u001B[0m'. Si no desea continuar con el proceso escriba '\033[31mSALIR\u001B[0m'.");
            opcion = sc.next().toUpperCase();

            if (opcion.equals("CONTINUAR")){
                int opcion2;
                //Menú que se va a repetir siempre que desee continuar realizando operaciones con las temperaturas.
                System.out.println("\033[34m ---------\u001B[0m Aquí tiene representadas varias opciones para trabajar con dichas temperaturas. \033[34m---------\u001B[0m");
                System.out.println("-Mostrar mes con mayor temperatura.                \033[34m PRESIONE 1.\u001B[0m");
                System.out.println("-Mostrar mes con menor temperatura.                \033[34m PRESIONE 2.\u001B[0m");
                System.out.println("-Extracción de la temperatura de un mes concreto.  \033[34m PRESIONE 3.\u001B[0m");
                System.out.println("-Temperatura media de los meses de verano.         \033[34m PRESIONE 4.\u001B[0m");
                System.out.println("-Temperatura media de los meses de invierno.       \033[34m PRESIONE 5.\u001B[0m");
                System.out.println("-Comparación de la temperatura de dos meses.       \033[34m PRESIONE 6.\u001B[0m");
                System.out.println("--------------------------------------------------------------- \033[33m Esperando opcion .....\u001B[0m ------------");
                opcion2=sc.nextInt();
                switch (opcion2) {
                    //Entrada a los metodos que se corresponden con las opciones que desea el usuario
                    case 1:
                        System.out.println("\033[31m>>>>>>>>>>>>>\u001B[0m Ha elegido la opción 1. \033[31m<<<<<<<<<<<<<\u001B[0m");
                        TemperaturaMayor(array_temps); break;

                    case 2:
                        System.out.println("\033[31m>>>>>>>>>>>>>\u001B[0m Ha elegido la opción 2. \033[31m<<<<<<<<<<<<<\u001B[0m");
                        TemperaturaMenor(array_temps); break;

                    case 3:
                        System.out.println("\033[31m>>>>>>>>>>>>>\u001B[0m Ha elegido la opción 3. \033[31m<<<<<<<<<<<<<\u001B[0m");
                        String opcionmes;
                        System.out.println("<<< ¿De cual mes desea conocer la temperatura? >>>");
                        opcionmes=sc.next().toUpperCase();
                        double TemppMes = ImprimirTempMes(array_temps,opcionmes);
                        System.out.println("°°°°° El mes "+meses.valueOf(opcionmes)+" tiene una temperatura de "+TemppMes+" °C. °°°°°");
                        System.out.println(" "); break;

                    case 4:
                        System.out.println("\033[31m>>>>>>>>>>>>>\u001B[0m Ha elegido la opción 4. \033[31m<<<<<<<<<<<<<\u001B[0m");
                        double TemppMedVerano = ImprimirTempMedVerano(array_temps);
                        System.out.println("°°°°° La temperatura media de los meses de \033[33mverano\u001B[0m es: "+TemppMedVerano+" °C. °°°°°");
                        System.out.println(" "); break;

                    case 5:
                        System.out.println("\033[31m>>>>>>>>>>>>>\u001B[0m Ha elegido la opción 5. \033[31m<<<<<<<<<<<<<\u001B[0m");
                        double TemppMedInvierno = ImprimirTempMedInvierno(array_temps);
                        System.out.println("°°°°° La temperatura media de los meses de \033[34minvierno\u001B[0m es: "+TemppMedInvierno+" °C. °°°°°");
                        System.out.println(" "); break;

                    case 6:
                        System.out.println("\033[31m>>>>>>>>>>>>>\u001B[0m Ha elegido la opción 6. \033[31m<<<<<<<<<<<<<\u001B[0m");
                        String primermes="";
                        String segundomes="";
                        System.out.println("\033[34m<<<\u001B[0m Indique el primer mes que desea comparar. \033[34m>>>\u001B[0m");
                        primermes = sc.next().toUpperCase();
                        System.out.println("\033[34m<<<\u001B[0m Indique el segundo mes que desea comparar. \033[34m>>>\u001B[0m");
                        segundomes = sc.next().toUpperCase();
                        String Comparacion_Meses = CompMeses(array_temps,primermes,segundomes);
                        System.out.println(Comparacion_Meses);
                        System.out.println(" "); break;

                    default:
                        System.out.println("\033[31m>>>>>>>>>>>>> Seleccione una opción adecuada para continuar. <<<<<<<<<<<<<\u001B[0m"); break;
                }
            }
        } while (!opcion.equals("SALIR")); //Usuario no desea continuar. Fin Do-While.
        System.out.println("              \033[31m<<<<<<<<<<<<<\u001B[0m * \033[31m>>>>>>>>>>>>>\u001B[0m");
        System.out.println("\033[34m----------------\u001B[0m Gracias por participar \033[34m----------------\u001B[0m");
        System.out.println("              \033[31m<<<<<<<<<<<<<\u001B[0m * \033[31m>>>>>>>>>>>>>\u001B[0m");
    }


    //Procedimientos y Funciones (o métodos).
    private static String CompMeses(double[] array_temps, String primermes, String segundomes) {
        double resultado_comparacion=0;
        String resultado_final = "";
        int posicionA=0;  //variable que contendrá la posición del primer mes introducido tras buscarlo en el enumerado.
        int posicionB=0;  //variable que contendrá la posición del segundo mes introducido tras buscarlo en el enumerado.
        double toma_tempA=0;  //variable que guardará la temperatura del primer mes solicitado tras haberla buscado en array_temps.
        double toma_tempB=0;  //variable que guardará la temperatura del segundo mes solicitado tras haberla buscado en array_temps.

        for (int i=0; i<meses.values().length; i++){
            posicionA=meses.valueOf(primermes).ordinal()+1;  //se guarda la posición del primer mes introducido tras busqueda en enum.
            posicionB=meses.valueOf(segundomes).ordinal()+1; //lo mismo que antes, pero para el segundo mes.
            for (int j=0; j<array_temps.length; j++){
                if (j+1==posicionA){  //Si la posición de la temperatura j es igual a la posición del primer mes introducido.
                    toma_tempA=array_temps[j];  //Se guarda temperatura del primer mes introducido.
                }
            }
            for (int k=0; k<array_temps.length; k++){
                if (k+1==posicionB){  //lo mismo que el anterior 'for', pero para el segundo mes y la segunda temperatura.
                    toma_tempB=array_temps[k];
                }
            }
        }

        if (toma_tempA == toma_tempB){
            resultado_comparacion=toma_tempA;
            resultado_final="°°°°° Las temperaturas de los meses "+meses.valueOf(primermes)+ " y "+meses.valueOf(segundomes)+" son iguales: "+resultado_comparacion+" °C. °°°°°";
        } else if (toma_tempA != toma_tempB) {
            resultado_final="°°°°° Las temperaturas de los meses "+meses.valueOf(primermes)+ " y "+meses.valueOf(segundomes)+" son distintas. °°°°°";
        }
        return resultado_final;
    }

    private static double ImprimirTempMedInvierno(double[] array_temps) {
        //variables a las que se les asigna los meses correspondientes al invierno a partir de las posiciones en array_temps.
        double TempInv1=array_temps[11];
        double TempInv2=array_temps[0];
        double TempInv3=array_temps[1];
        double TempInv4=array_temps[2];
        double TempMediaInv=0;

        TempMediaInv=(TempInv1+TempInv2+TempInv3+TempInv4)/3;

        return TempMediaInv;
    }

    private static double ImprimirTempMedVerano(double[] array_temps) {
        //variables a las que se les asigna los meses correspondientes al verano a partir de las posiciones en array_temps.
        double TempVer1=array_temps[5];
        double TempVer2=array_temps[6];
        double TempVer3=array_temps[7];
        double TempMediaVer=0;

        TempMediaVer=(TempVer1+TempVer2+TempVer3)/3;

        return TempMediaVer;
    }

    private static double ImprimirTempMes(double[] array_temps, String opcionmes) {
        double TempMes=array_temps[0];
        meses[] mes = meses.values();
        for (int i=0; i<meses.values().length; i++){  //lectura enumerado 'meses'
            int posicionA=meses.valueOf(opcionmes).ordinal()+1;
            //linea de arriba busca el mes introducido por el usuario dentro del enumerado y guarda la posicion.
            for (int j=0; j<array_temps.length; j++){  //lectura del array con las temperaturas.
                if (array_temps[j]==posicionA){  //Si la posicion de la temperatura es la misma que la del mes en el enumerado.
                    TempMes=array_temps[j];
                }
            }
        }
        return TempMes;
    }

    private static void TemperaturaMenor(double[] array_temps) {
        double TempMenor=array_temps[0];
        for (int i=0; i<array_temps.length;i++){
            if (array_temps[i]<TempMenor){
                TempMenor = array_temps[i];
            }
        }
        meses[] mes = meses.values();
        for (int i=0;i<array_temps.length;i++){
            if (array_temps[i]==TempMenor){
                System.out.println("°°°°° El mes de "+mes[i]+" tiene la menor temperatura: "+TempMenor+" °C. °°°°°");
                System.out.println(" ");
            }
        }
    }

    private static void TemperaturaMayor(double[] array_temps) {
        double TempMayor=0;
        for(int i=0 ; i<array_temps.length;i++){
            if (array_temps[i]>TempMayor){
                TempMayor = array_temps[i];  //Se le asigna a TempMayor el valor de la posición i que tiene la mayor temperatura.
            }
        }
        meses[] mes = meses.values();
        for (int i=0; i < array_temps.length; i++){
            if (array_temps[i] == TempMayor){  //Si la temperatura de la posición i de array_temps es igual a la temperatura mayor.
                System.out.println("°°°°° El mes de "+mes[i]+" tiene la mayor temperatura: "+TempMayor+" °C. °°°°°");
                System.out.println(" ");
            }
        }
    }

    private static double[] introduccion_temps(String opcion) {
        //Aquí el usuario introducirá las temperaturas de cada mes. Con ellas se trabajará a continuación.
        Scanner sc = new Scanner(System.in);
        double[] array_temperaturas = new double [12];
        meses[] mes = meses.values();
        System.out.println("Por favor, introduzca las temperaturas desde enero hasta diciembre");

        for (int i=0; i < array_temperaturas.length;i++){
            System.out.println("Introduzca temperatura del mes de \033[33m"+mes[i].representaciontoString()+"\u001B[0m.");
            array_temperaturas[i] = sc.nextDouble();

        }
        return array_temperaturas;
    }
}