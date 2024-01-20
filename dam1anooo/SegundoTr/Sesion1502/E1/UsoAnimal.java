package PrimerAnyo.SegundoTr.Sesion1502.E1;

import java.util.Scanner;

public class UsoAnimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione un animal");
        System.out.println("perro");
        System.out.println("gato");
        System.out.println("cerdo");

        String opcion = sc.next().toLowerCase();


        System.out.println("-----------------");

        switch (opcion){
            case "perro":
                Perro animal1=new Perro(32,"pastor alemán");
                animal1.saySomething();
                System.out.println(animal1.showInfo());
                break;
            case "gato":
                Gato animal2=new Gato(11,"rojo");
                animal2.saySomething();
                System.out.println(animal2.showInfo());break;
            case "cerdo":
                Cerdo animal3=new Cerdo(17,"pienso");
                animal3.saySomething();
                System.out.println(animal3.showInfo());

        }






    }




}
