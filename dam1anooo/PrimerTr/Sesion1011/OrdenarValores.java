package PrimerAnyo.PrimerTr.Sesion1011;

public class OrdenarValores {
    public static void main(String[] args) {
        int[] numeros = {1223, 232, 55, 9231};
        java.util.Arrays.sort(numeros);
        System.out.println("Array de numeros ordenados "+java.util.Arrays.toString(numeros));
        String[] nombres = {"Adrian","Carasa","Yassin"};
        java.util.Arrays.sort(nombres);
        System.out.println("Array de strings ordenados "+java.util.Arrays.toString(nombres));
    }
}
