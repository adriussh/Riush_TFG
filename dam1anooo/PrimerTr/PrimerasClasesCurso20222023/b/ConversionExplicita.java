package PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b;

public class ConversionExplicita {

    public static void main(String[] args) {
        byte b;
        int i =257;
        double d=323.142;

        System.out.println("Convertir un integer PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a byte de manera explícita");
        b = (byte) i ;
        System.out.println("i= "+i+" b="+b);

        System.out.println("Convertir un double PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a byte de manera explícita");
        b = (byte) d;
        System.out.println("d= "+d+" b="+b);
    }
}
