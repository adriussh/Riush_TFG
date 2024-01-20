package PrimerAnyo.SegundoTr.Sesion0303;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c1= new Calculadora(5,6);
        System.out.println("Introduzca el primer numero");
        int num1=sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2=sc.nextInt();
        Calculadora c2 = new Calculadora(num1,num2);
        System.out.println("La suma de c1 es "+c1.sumar(c1.getNum1(),c1.getNum2()));
        System.out.println("La resta de c1 es "+c1.restar(c1.getNum1(),c1.getNum2()));
        System.out.println("La multiplicacion de c1 es "+c1.multi(c1.getNum1(),c1.getNum2()));
        System.out.println("La division de c1 es "+c1.dividir(c1.getNum1(),c1.getNum2()));
    }
}
