package PrimerAnyo.SegundoTr.Sesion0202.EjerciciosIniciacionPOO.E2;

public class UsoLibro {
    public static void main(String[] args) {
        Libro L1 = new Libro();
        Editorial E1 = new Editorial();
        System.out.println("---------------------- LIBRO 1 ----------------------");
        System.out.println("El titulo del libro es: "+L1.getTitulo());
        System.out.println("El autor del libro es: "+L1.getAutor());
        System.out.println("El libro pertenece a la "+L1.getEdicion()+" edicion.");
        System.out.println("El libro se publico en el año: "+L1.getAño_public());
        System.out.println("El libro pertence a la categoría: "+L1.getCategoria());
        System.out.println("El precio del libro es de: "+L1.getPrecio()+"€.");
        System.out.println("El ISBN del libro es: "+L1.getIsbn());
        System.out.println("La editorial a la que pertenece es: "+E1.getNombre()+" que tiene como codigo: "+E1.getCodigo());
        System.out.println("La editorial fue fundada en el año: "+E1.getAño());
        System.out.println(" ");

        Libro L2 = new Libro("La Caida de La Casa Usher.", "Edgar Alan Poe.", 4, 1839, "Ficción, Terror.",39.99,"123C",E1);
        Editorial E2 = new Editorial(112313123, "FantasyHouse", 1999);
        System.out.println("---------------------- LIBRO 2 ----------------------");
        System.out.println("El titulo del libro es: "+L2.getTitulo());
        System.out.println("El autor del libro es: "+L2.getAutor());
        System.out.println("El libro pertenece a la "+L2.getEdicion()+" edicion.");
        System.out.println("El libro se publico en el año: "+L2.getAño_public());
        System.out.println("El libro pertence a la categoría: "+L2.getCategoria());
        System.out.println("El precio del libro es de: "+L2.getPrecio()+"€.");
        System.out.println("El ISBN del libro es: "+L2.getIsbn());
        System.out.println("La editorial a la que pertenece es: "+E2.getNombre()+" que tiene como codigo: "+E2.getCodigo());
        System.out.println("La editorial fue fundada en el año: "+E2.getAño());
    }
}
