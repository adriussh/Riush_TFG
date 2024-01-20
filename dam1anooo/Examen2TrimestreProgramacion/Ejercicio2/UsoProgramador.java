package PrimerAnyo.Examen2TrimestreProgramacion.Ejercicio2;

public class UsoProgramador {
    public static void main(String[] args) throws RetencionIncorrecta, DniInvalido {
        try{
        //crear persons
        Programador p1 = new Programador("Juan","43395044Z", 25, "javAsCript", "seNIor");
        Programador p2 = new Programador("BETIS","40555033A", 50, "C++", "JUNIor");
        Programador p3 = new Programador("eLIAS","98765598H", 20, "Pascual", "JUNIor");
        Programador p4 = new Programador("FULAnito","32507823B", 0, "Python", "JEFE_pROYECTO");
        Programador p5 = new Programador("ManuelBetis","66543024K", 30, "C+", "SENIor");

        //crear array de programadores
        Programador[] lista_pr = new Programador[5];

        //asignar el array
        /*lista_pr[0]=p1;
        lista_pr[1]=p2;
        lista_pr[2]=p3;
        lista_pr[3]=p4;
        lista_pr[4]=p5;*/

        //lista_pr[3]=new Programador("Hinde", "56968879H", 30, "PYTHON", "junior");

        //recorrer e imprimir el array
            for (int i=0;i<lista_pr.length;i++){
             System.out.println(lista_pr[i].toString());
            }
            //forzar excepciones:

            //1) IllegalArgument
            //Programador prr4 = new Programador ("Hinde", "56968879H", 30, "PYTHON", "junior");

            //2) DNI INVALIDO
            //Programador ppr= new Programador("a", "66897719C", 30, "PYTHON", "junior")

            //3) retencion
            //Programador pp5 = new Programador("Hinde", "56968879H", 100, "PYTHON", "junior");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
