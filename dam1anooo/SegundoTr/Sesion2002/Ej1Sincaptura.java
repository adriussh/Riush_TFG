package PrimerAnyo.SegundoTr.Sesion2002;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1Sincaptura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Introduzca el dividendo");
            int dividendo=sc.nextInt();
            System.out.println("Introduzca el divisor");
            int divisor=sc.nextInt();
            System.out.println("El cocientes es "+dividendo/divisor+".");
        }
        catch(InputMismatchException error_compatibilidad_dato){
            System.out.println("Has introducido un valor que no es valido.");
        }
        catch (ArithmeticException error_aritmetico){
            System.out.println("No es posible dividir entre 0.");
        }
        finally {
            sc.close();
        }


    }
}
