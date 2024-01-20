package PrimerAnyo.PrimerTr.Sesion2811;

import java.util.Scanner;

public class EjercicioString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=0;
        String palabra="";
        System.out.println("1.Buscar cierta vocal en una palabra");
        System.out.println("2.Invertir la palabra");
        System.out.println("3.Contar longitud de palabra");
        System.out.println("4.Comparar dos palabras");

        System.out.println("¿Qué opción quiere usted?");
        opcion = sc.nextInt();

        System.out.println("¿Qué palabra quiere usted?");
        palabra = sc.next();

        switch (opcion){
            case 1:
                System.out.println("Digame la vocal que quiera usted buscar en palabra");
                char vocal = sc.next().charAt(0);
                int numero_vocales = buscar_vocal_palabra(palabra,vocal);
                System.out.println("El número de "+vocal+" en la palabra "+palabra+" es "+numero_vocales);

            case 2:
                String palabra_invertida = palabra_invert(palabra);
                System.out.println("La palabra invertida es: "+palabra_invertida);

            case 3:
                int longitud_palabra = palabra_long(palabra);
                System.out.println("El número total de carácteres es: "+longitud_palabra);
        }
    }

    private static int palabra_long(String palabra) {
        int resultado=0;
        resultado=palabra.length();
        return resultado;
    }

    private static String palabra_invert(String palabra) {
        String resultado= "";
        for (int i=0;i==palabra.length()-1;i--){
            resultado += palabra.charAt(i);
        }
        return resultado;
    }

    private static int buscar_vocal_palabra(String palabra, char vocal) {
        int resultado=0;
        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i)==vocal)
            {
                resultado++;
            }
        }
        return resultado;
    }
}
