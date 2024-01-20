package PrimerAnyo.SegundoTr.SimulacroExamenRecuperacionSegTr.Ejercicio2;

import java.util.Scanner;

public class Uso {
    public static void main(String[] args) throws LongitudIncorrecta {
        //preguntar el tamaño del array que almacenara los objetos de la clase password
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño que tendra el array de contraseña");
        int tamanyo=sc.nextInt();

        Password[] l_contrasena = new Password[tamanyo];
        for (int i=0;i<l_contrasena.length;i++){
            System.out.println("Introduzca la longitud que tendra la contraseña");
            int longi=sc.nextInt();
            l_contrasena[i] = new Password(longi);
        }
        boolean[] fortaleza_contrasena = new boolean[tamanyo];
        for (int i=0; i<l_contrasena.length;i++){
            fortaleza_contrasena[i]=l_contrasena[i].esFuerte();
        }
        for (int i=0; i<l_contrasena.length; i++){
            System.out.println("Contraseña: "+l_contrasena[i].getContrasena()+". Fortaleza: "+fortaleza_contrasena[i]);
        }
    }
}
