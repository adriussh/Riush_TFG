package PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b;

public class    ConversionPrimitivoWrapper {

    public static void main(String[] args) {

        //declaración de variable
        Integer a = 6;
        int b = 7;
        int c = 8;
        Byte d = null;

        System.out.println("el valor de la variable Wrapper PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a es: "+b);
        System.out.println("el valor de la variable tipo primitivo int b es: "+b);
        System.out.println("el valor de la variable tipo primitivo int PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.c es: "+c);

        //vamos al autoboxing

        System.out.println("Autoboxing:");
        a=b;
        System.out.println("la variable tipo primitivo int PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a vale ahora: "+b);

        //vamos al unboxing

        System.out.println("Unboxing:");
        c=a;

        System.out.println("la variable tipo primitivo int PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.c vale ahora:"+c);

        //beneficios de usar clases envoltorio o wrappers
        System.out.println("este metodo permite pasar la variable de tipo integer PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a string"+a.toString());
        System.out.println("¿es "+a+" igual PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a=>"+b+a.equals(b));
        System.out.println("¿es PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a igual PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a b?"+a.equals(d));
        System.out.println("Convertir la variable b en float=> "+d.floatValue());

    }//fin del main

}//fin de la clase
