package PrimerAnyo.TercerTr.Sesion2104;

import java.util.Stack;

public class StackEjemplo {
    public static void main(String[] args) {
        Stack<String> pilaString = new Stack<>();
        System.out.println("Es vacio? "+pilaString.empty());
        pilaString.add("Primero");
        pilaString.add("Segundo");
        pilaString.add("Tercero");
        pilaString.add("cuarto");
        System.out.println("Es vacio? "+pilaString.empty());
        System.out.println(pilaString.toString());
        System.out.println("Cima de la pila: "+pilaString.peek());
        System.out.println("Desapilo: "+pilaString.pop());
        System.out.println("Apilo: "+pilaString.push("Quinto"));
        System.out.println(pilaString.toString());
        System.out.println("El top de la pila : "+pilaString.size());
    }


}
