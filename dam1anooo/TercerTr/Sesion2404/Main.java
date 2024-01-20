package PrimerAnyo.TercerTr.Sesion2404;

public class Main {
    public static void main(String[] args) {
        Hombre h1 = new Hombre("122313D","David","Arrellano",80,1.65,70,true);
        Hombre h2 = new Hombre("13123123123N","Antonio", "Gonzalez",70,1.65,80,true);
        Mujer m1 = new Mujer("adasdasdasdA","Fulana","Fulanita", 30,1.76,60.7,false);
        Mujer m2 = new Mujer("asdasdasdssM", "Fulanota", "Fium", 26, 1.60, 70, false);

        Filtrados.add(m1);
        Filtrados.add(m2);
        Filtrados.add(h1);
        Filtrados.add(h2);
        System.out.println("Imprimir las persoans insertadas en lista");
        Filtrados.printArray(Filtrados.lista);
        System.out.println("Imprimir de mayor a menor icm");
        Filtrados.OrderByHigherToLowe();
        System.out.println("Imprimir de menor a mayor icm");
        Filtrados.OrderByLowerToHigherICM();
        System.out.println("Filtrar los chicos con icm menor a 25");
        Filtrados.printArray(Filtrados.filterbyGenderICMLower(25, 'm'));
    }

}
