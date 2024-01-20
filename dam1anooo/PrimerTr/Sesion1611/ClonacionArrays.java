package PrimerAnyo.PrimerTr.Sesion1611;

public class ClonacionArrays {
    public static void main(String[] args) {
        //con valores enteros int
        int[] numeros={1,2,3,4,5};
        int[] listnum=new int[4];

        System.out.println("Arrays numeros "+java.util.Arrays.toString(numeros));
        listnum=numeros.clone();
        System.out.println("Arrays listnum "+java.util.Arrays.toString(listnum));
        //con String
        String[] nombres={"eliot","elias","admin"};
        String[] listnom=new String[3];

    }
}
