package PrimerAnyo.SegundoTr.Sesion2002;

public class UsoPersona {
    public static void main(String[] args) {
        try{
            Persona p1 = new Persona("",18);
        }
        catch(IllegalArgumentException error){
            System.out.println(error.getMessage());
        }

        catch(EdadIncorrecta error) {
            System.out.println(error.getMessage());
        }
    }
}
