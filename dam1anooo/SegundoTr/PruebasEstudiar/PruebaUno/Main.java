package PrimerAnyo.SegundoTr.PruebasEstudiar.PruebaUno;

public class Main {
    public static void main(String[] args) throws TipoMotorIncorrecto {
        Camion C1 = new Camion(4,"combustion","azul",6,1500.2,605.253);
        System.out.println("El camion tiene "+C1.getPuertas()+" puertas. El motor es "+C1.getTipoDeMotor()+
                ". El color es "+C1.getColor()+". Su numero de ruedas es "+C1.getNumeroRuedas()+
                ". La carga maxima que puede llevar es "+C1.getCargaMaxima()+". Y su kilometraje "+C1.getKilometraje()+". El kilometraje tras un año sera "+C1.NuevoKilometraje());

        Camion c2 = new Camion(4,"gas","azul",6,1500.2,605.253);
        System.out.println("El camion tiene "+c2.getPuertas()+" puertas. El motor es "+c2.getTipoDeMotor()+
                ". El color es "+c2.getColor()+". Su numero de ruedas es "+c2.getNumeroRuedas()+
                ". La carga maxima que puede llevar es "+c2.getCargaMaxima()+". Y su kilometraje "+c2.getKilometraje());

    }
}
