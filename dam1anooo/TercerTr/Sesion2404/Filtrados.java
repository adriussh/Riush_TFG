package PrimerAnyo.TercerTr.Sesion2404;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Filtrados {
    public static ArrayList<Persona> lista = new ArrayList<>();
    public static ArrayList<Persona> lista_filrada = new ArrayList<>();

    public static void add(Persona p){
        lista.add(p);
    }

    public static ArrayList<Persona> filteredbyICMHigher(double icm){
        lista_filrada.clear();
        for (Persona p:lista){
            if (p.getIcm()>icm){
                lista_filrada.add(p);
            }
        }
        return lista_filrada;
    }

    public static ArrayList<Persona> filterbyGenderICMLower(double icm, char c){
        lista_filrada.clear();
        for (Persona p:lista){
            if (p.getIcm()<icm&&p.getClass().getName().charAt(0)==c){
                lista_filrada.add(p);
            }
        }
        return lista_filrada;
    }

    public static void printArray(ArrayList<Persona> listado) {
        Iterator<Persona> itr = listado.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }

    public static void OrderByLowerToHigherICM(){
        lista.sort(Comparator.comparing(Persona::getIcm));
        printArray(lista);
    }

    public static void OrderByHigherToLowe(){
        lista.sort(Comparator.comparing(Persona::getIcm).reversed());
        printArray(lista);
    }
}