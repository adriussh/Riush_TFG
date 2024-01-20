package PrimerAnyo.PrimerTr.Sesion1011;

import java.util.Arrays;

public class ArraysComparacion2 {
    public static void main(String[] args) {
        //Si numero1 y numero2 tienen la misma cantidad de numeros, es igual.
        int[] numero1={1,2,3,4};
        int[] numero2={1,2,3};
        if (Arrays.equals(numero1,numero2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
}
