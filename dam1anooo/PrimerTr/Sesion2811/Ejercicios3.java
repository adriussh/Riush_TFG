package PrimerAnyo.PrimerTr.Sesion2811;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios3 {
    public static void main(String[] args) {

        String texto = "";
        System.out.println("1. Longitud del String");
        System.out.println("2. Inicial del String");
        System.out.println("3. Última letra del String");
        System.out.println("4. Pasar PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a mayúsculas el String");
        System.out.println("5. Pasar PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a minúsculas el String");
        System.out.println("6. Reemplazar una letra por otra que se solicita al usuario y mostrar el nuevo resultado");
        System.out.println("7. Espacio");
        System.out.println("8. Pasar PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a Array de Char");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("¿Qué opción desea realizar?");
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        opcion=sc.nextInt();
        System.out.println("Introduzca un String");
        texto = sc.next();
        switch (opcion){
            case 1:
                int resultadoA = LongText(texto);
                System.out.println("La longitud del String es de "+resultadoA+" carácteres.");
                break;

            case 2:
                char resultadoB = InicialText(texto);
                System.out.println("La inicial del String es "+resultadoB);
                break;

            case 3:
                char resultadoC = FinalText(texto);
                System.out.println("La última letra del String es "+resultadoC);
                break;

            case 4:
                String resultadoD = QuitarEsp(texto);
                System.out.println("El String sin espacios es "+resultadoD);
                break;

            case 5:
                String resultadoE = PasMayus(texto);
                System.out.println("El String en mayúsculas es "+resultadoE);
                break;

            case 6:
                String resultadoF = PasMinus(texto);
                System.out.println("El String en minúsculas es "+resultadoF);
                break;

            case 7:
                String resultadoG = NewTexto(texto);
                System.out.println("El nuevo String es "+resultadoG);
                break;

            case 8:
                boolean resultadoH;
                resultadoH=TextoVacio(texto);
                System.out.println(resultadoH);
                break;

            case 9:
                char[] resultadoI = StringDiv(texto);
                System.out.println("El String dividido por letras es "+Arrays.toString(resultadoI));
                break;

            default:
                System.out.println("Ha introducido una opcion incorrecta");

        }
    }

    private static boolean TextoVacio(String texto) {
        boolean resultadoH=false;
        resultadoH=texto.isEmpty();

        return resultadoH;
    }

    private static char[] StringDiv(String texto) {
        char[] resultadoIARRAY;
        resultadoIARRAY=texto.toCharArray();

        return resultadoIARRAY;
    }

    private static String NewTexto(String texto) {
        Scanner sc = new Scanner(System.in);
        char letra=' ';
        char newletra=' ';
        System.out.println("Introduzca que letra, PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a partir de "+texto+", quiere reemplazar.");
        letra = sc.next().charAt(0);
        System.out.println("¿Porqué letra desea reemplazar?");
        newletra = sc.next().charAt(0);
        String resultadoG = "";
        resultadoG=texto.replace(letra,newletra);

        return resultadoG;
    }

    private static String PasMinus(String texto) {
        String resultadoF = "";
        resultadoF=texto.toLowerCase();

        return resultadoF;
    }

    private static String PasMayus(String texto) {
        String resultadoE = "";
        resultadoE=texto.toUpperCase();

        return resultadoE;
    }

    private static String QuitarEsp(String texto) {
        String resultadoD = "";
        resultadoD=texto.trim();

        return resultadoD;
    }

    private static char FinalText(String texto) {
        char resultadoC=0;
        resultadoC=texto.charAt(texto.length()-1);

        return resultadoC;
    }

    private static int LongText(String texto) {
        int resultadoA=0;
        resultadoA = texto.length();

        return resultadoA;
    }

    private static char InicialText(String texto) {
        char resultadoB=0;
        resultadoB = texto.charAt(0);

        return resultadoB;
    }

}
