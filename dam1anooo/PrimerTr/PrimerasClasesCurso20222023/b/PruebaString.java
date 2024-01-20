package PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b;

public class PruebaString {
    public static void main(String[] args) {
        String nombre = "Javier";
        String apellido = "ALMENDRO";

        System.out.println("voy PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a pasar el nombre PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a mayusculas: " + nombre.toUpperCase());
        System.out.println("voy PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a pasar el apellido PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a minusculas: " + apellido.toLowerCase());
        System.out.println("concatenar caracteres: " + nombre.concat(" " + apellido));
        System.out.println("mostrar la inicial de mi apellido: " + apellido.charAt(0));
        System.out.println("numero de caracteres de " + nombre + " es: " + nombre.length());
        System.out.println("numero de caracteres de " + apellido + " es: " + apellido.length());
    }
}