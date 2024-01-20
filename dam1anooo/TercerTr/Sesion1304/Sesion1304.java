package PrimerAnyo.TercerTr.Sesion1304;

import PrimerAnyo.TercerTr.ProgGenerica.Personaa;

import java.util.ArrayList;

public class Sesion1304 {
    //Programación genérica introducción
    public static void main(String[] args) {
        ArrayList<String> arraydinamicostring = new ArrayList<>();
        ArrayList<Integer> arraydinamicointeger = new ArrayList<>();
        ArrayList<Personaa> arraydinamicopersona = new ArrayList<>();

        arraydinamicostring.add("Stalin");
        arraydinamicostring.add("Shaomi");
        arraydinamicostring.add("AAAAAA");
        System.out.println(arraydinamicostring.toString());

        arraydinamicointeger.add(1);
        arraydinamicointeger.add(2);
        arraydinamicointeger.add(3);
        System.out.println(arraydinamicointeger.toString());

        arraydinamicopersona.add(new Personaa("asdasdasd213123123"));
        Personaa pp = new Personaa("123456WASD");
        arraydinamicopersona.add(pp);
        arraydinamicopersona.add(new Personaa("equisdeeent574"));
        System.out.println(arraydinamicopersona.toString());

        Personaa[] p1 = new Personaa[3];
    }
}
