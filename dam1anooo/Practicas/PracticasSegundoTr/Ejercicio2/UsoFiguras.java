package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio2;

import java.util.Scanner;

public class UsoFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    try {
             System.out.println("Inserte el lado del cuadrado");
             int lado = sc.nextInt();
             //Instancia de objetos

            //Declaramos el lado del cuadrado
             Cuadrado cuadrado1 = new Cuadrado(lado);

             //Control de excepciones (si un lado es menor o igual a 0 te saldra un mensaje)
             cuadrado1.ExepcionCuadrado();

             cuadrado1.dibujar();


             //Calculo del area y volumen
        System.out.println("El area del cuadrado es: "+cuadrado1.area());
        System.out.println("El volumen del cuadrado es: "+cuadrado1.volumen());
    }catch (ExcepcionCuadrado e){
    System.out.println(e.getMessage());
        }
    }
}
