package PrimerAnyo.TercerTr.Sesion2104;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEjemploRecorrido {
    public static void main(String[] args) {
        ArrayList<Integer> ali= new ArrayList<>();
        ali.add(3);
        ali.add(4);
        ali.add(5);
        ali.add(8);
        ali.add(6);
        ali.add(1);
        ali.add(2);
        System.out.println("Recorrer la lista con iterador");
        Iterator<Integer> itr = ali.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("-");
        }
        System.out.println('\n');
        System.out.println("Recorrer la lista con un \'for\' tradicional ascendente");
        for (int i = 0 ;i< ali.size();i++){
            System.out.print(ali.get(i));
            System.out.print("-");
        }
        System.out.println('\n');
        System.out.println("Recorrer la lista con un \'for\' tradicional descendente");
        for (int j = ali.size()-1 ;j>=0;j--){
            System.out.print(ali.get(j));
            System.out.print("-");
        }
        System.out.println('\n');
        System.out.println("Recorrer la lista con \'for-each\'");
        for (int e: ali){
            System.out.print(e);
            System.out.print("-");
        }
    }
}
