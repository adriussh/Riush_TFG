package PrimerAnyo.PrimerTr.Sesion0510;

public class OperadoresAritméticos {
    public static void main(String[] args) {

        //declaración e inicialización de variables
        int a=25, b=5, c=2;
        int suma, resta, multiplicacion, division, resto=0;
        //operaciones con las variables.
        suma=a+b+c;
        resta=c-b;
        division=a/b;
        resto=a%b;
        multiplicacion=a*b;
        System.out.println("La suma es "+suma);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multiplicacion);
        System.out.println("La cociente es "+division);
        System.out.println("La cociente es "+resto);

        a++;
        System.out.println("El nuevo valor de PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a es "+a);
        b++;
        System.out.println("El nuevo valor de b es "+b);
    }
}
