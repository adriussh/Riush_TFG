package PrimerAnyo.Examen2TrimestreProgramacion.Ejercicio1;

public class UsoEmisoras {
    public static void main(String[] args) throws CreacionInvalida, IllegalAccessException, OpcionInvalida {
        EmisoraTradicional et1= new EmisoraTradicional("Los 40",1993,5000,93.9);
        EmisoraTradicional et2= new EmisoraTradicional("Cadena Dial",2000,50000,540);

        EmisoraOnLine eo1=new EmisoraOnLine("RN5 Todo Noticias", 1985, 800000, "www.rn5.es");
        EmisoraOnLine eo2=new EmisoraOnLine("China FM", 2018,6000,"www.chinafm.es");

        et1.iniciarEmision();
        et1.finalizarEmision();

        // Emisora[] lista_emisora = new Emisora[4]
        // lista_emisora[0]=et1;

        Emisora[] lista_emisoras = {et1,et2,eo1,eo2};
        for (int i=0; i<lista_emisoras.length;i++){
            System.out.println("La "+lista_emisoras.getClass().getSimpleName()+" tiene "+lista_emisoras[i].getNum_oyentes()+" con ganancias de "+lista_emisoras[i].ganancias());
        }
        //forzar excepciones

        //1. iniciar una emision ya iniciada
        //eo1.iniciarEmision();
        //eo1.iniciarEmision();
        //2. iniciar una emision ya iniciada
        //eo1.finalizarEmision();
        //eo1.finalizarEmision();
        //3. el año de creacion de la emisora es menor a 1879
        //EmisoraOnLine eo3 = new EmisoraOnLine("China FM",1500,6000,"www.chinafm.es");
        //4. elegir un num_frecuencia que no este en rango
        EmisoraTradicional et4=new EmisoraTradicional("Es radio",1500,1000,200);
    }
}
