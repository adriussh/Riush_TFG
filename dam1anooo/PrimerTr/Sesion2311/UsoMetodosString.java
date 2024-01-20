package PrimerAnyo.PrimerTr.Sesion2311;

public class UsoMetodosString {
    public static void main(String[] args) {
        String pais="Francia";
        String pais2="Ecuador";
        String pais3="Marruecos";
        String pais4="España";
        String pais2_2="ecuador";
        String pais8="";
        //Declaracion de una variabel enumerada
        DiasSemana variable_dia = DiasSemana.DOMINGO;
        System.out.println(variable_dia);
        // charAt
        System.out.println("La inicial de este pais es "+pais.charAt(0));//dice la letra de la posicion que indiques
        System.out.println("La letra del pais "+pais.charAt(pais.length()-1));//dice la ultima letra de un String
        System.out.println("El pais en mayusculas es "+pais.toUpperCase());
        System.out.println("El pais en minusculas es "+pais.toLowerCase());
        System.out.println("¿Es igual "+pais2+" y "+pais2_2.toLowerCase()+ "? = "+pais2.toLowerCase().equals(pais2_2.toLowerCase()));
        // System.out.println("¿Es igual "+pais2.toLowerCase()+" y "+pais2_2+ pais2.compareTo(pais2_2));
        if (pais2.compareToIgnoreCase(pais2_2)== 0){  //compara dos Strings sin contar mayusculas y minusculas
            //el compareTo si tiene en cuenta las mayusculas y minusculas
            System.out.println("Son iguales");
        }
        else{
            System.out.println("no son iguales");
        }
        System.out.println("Es subcadena "+pais3.contains("ruu"));//dice si el String contiene los caracteres indicados
        System.out.println("El sufijo de "+pais4+" es "+pais4.endsWith("eña"));//dice si el String acaba en lo que le digamos
        System.out.println("Esta vacio el "+pais4+ " ?= "+pais4.isEmpty());
        System.out.println("Esta vacio el "+pais8+ " ?= "+pais8.isEmpty());//detecta si una variable esta vacia o no(los espacios cuentas como que no esta vacio
        System.out.println(pais4.indexOf("a"));//cuenta la posicion de un char desde el principio
        System.out.println(pais4.lastIndexOf("a"));//cuenta la posicion de un chart desde el final
        String animal="perro";
       // System.out.println(animal.replace('o', "PrimerAnyo.PrimerTr.PrimerasClasesCurso20222023.b.a"));// sustituye todas las letras que indeques por la otra que indiques
        System.out.println(animal.substring(0,2));//saca los prefijos desde el rango de posicion que indiques
        System.out.println(animal.startsWith("pa"));
        String pais20=" Qatar ";
        System.out.println(pais20.length());
        System.out.println(pais20);
        System.out.println(pais20.trim());
        System.out.println(pais20.trim().length());//elimina espacios
    }
}
