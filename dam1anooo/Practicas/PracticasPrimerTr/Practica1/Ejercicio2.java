package PrimerAnyo.Practicas.PracticasPrimerTr.Practica1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Inicializacion variables.
        double perimetro;
        double area;
        double volumen;
        int menu;
        double radio;
        final double pi = 3.141592;
        //Mensajes introductorios
        System.out.println("\033[33mBienvenido al sistema de calculos PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a partir de un circulo");
        System.out.println("\033[31m********* >\u001B[0m M E N Ú \033[31m< **********\033[34m");
        System.out.println("1. Cálculo perímetro");
        System.out.println("2. Cálculo área");
        System.out.println("3. Cálculo volumen");
        //Inicializacion scanner
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();
        //Inicio switch
        switch (menu) {
            case 1:
                System.out.println("\033[36mInserte el valor del radio del circulo");
                radio = sc.nextDouble();
                perimetro = (2*pi*radio);
                System.out.println("RESULTADO PERÍMETRO: "+perimetro);break;
            case 2:
                System.out.println("\033[36mInserte el valor del radio del circulo");
                radio = sc.nextDouble();
                double RadioCuadrado = Math.pow(radio, 2);
                area = pi*RadioCuadrado;
                System.out.println("RESULTADO ÁREA: "+area);break;
            case 3:
                System.out.println("\033[36mInserte el valor del radio del circulo");
                radio = sc.nextDouble();
                double cubo = Math.pow(radio, 3);
                volumen = 4/3*pi*cubo;
                System.out.println("RESULTADO VOLUMEN: "+volumen);break;
            default:
                System.out.println("\033[33mDebe introducir un valor dentro del rango indicado en el menú para poder seleccionar que desea calcular y así continuar");break;
        }
    }
}

