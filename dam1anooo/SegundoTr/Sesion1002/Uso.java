package PrimerAnyo.SegundoTr.Sesion1002;

public class Uso {
    public static void main(String[] args) {
        //Objeto de la clase hija Taxi
        Taxi Uber = new Taxi();
        Uber.setMatricula("GDZ01Z");
        Uber.setModelo("Toyota Prius");
        Uber.setPotenciaCV(110);
        Uber.setNumero_licencia(1356);

        System.out.println("El taxi tiene "+
                "\n matricula "+Uber.getMatricula()+
                "\n modelo "+Uber.getModelo()+
                "\n con potencia "+Uber.getPotenciaCV()+" cv"+
                "\n y numero de licencia "+Uber.getNumero_licencia());
    }
}
