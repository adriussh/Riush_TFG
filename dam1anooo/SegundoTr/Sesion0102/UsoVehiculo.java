package PrimerAnyo.SegundoTr.Sesion0102;

public class UsoVehiculo {
    public static void main(String[] args) {

        Vehiculo Veh1 = new Vehiculo();
        System.out.println("---------------------- VEHICULO 1 ----------------------");
        System.out.println("El vehiculo numero 1 es de la marca " + Veh1.getMarca());
        System.out.println("El vehiculo numero 1 tiene como referencia: " + Veh1.getReferencia());
        System.out.println("El vehiculo numero 1 es el modelo " +Veh1.getModelo()+" de la marca " + Veh1.getMarca());
        System.out.println("El vehiculo numero 1 tiene la placa " + Veh1.getPlaca());
        System.out.println("El vehiculo numero 1 es de color " + Veh1.getColor());
        System.out.println("El vehiculo numero 1 tiene un valor de " + Veh1.getValor());
        System.out.println("El vehiculo numero 1 tiene una velocidad ahora mismo de " + Veh1.getVelocidad());
        System.out.println("El vehiculo numero 1 esta circulando en la marcha " + Veh1.getMarcha());
        Veh1.apagar();

        Vehiculo Veh2 = new Vehiculo(Marca.PLYMOUTH, "PLYMOUTH CUDA", 1, "1234LLC", "Verde", 45000);
        System.out.println("---------------------- VEHICULO 2 ----------------------");
        System.out.println("El vehiculo numero 2 es de la marca " + Veh2.getMarca());
        System.out.println("El vehiculo numero 2 tiene como referencia: "+ Veh2.getReferencia());
        System.out.println("El vehiculo numero 2 es el modelo " + Veh2.getModelo());
        System.out.println("El vehiculo numero 2 tiene la placa " + Veh2.getPlaca());
        System.out.println("El vehiculo numero 2 es de color " + Veh2.getColor());
        System.out.println("El vehiculo numero 2 tiene un valor de " + Veh2.getValor());
        System.out.println("El vehiculo numero 2 tiene una velocidad ahora mismo de " + Veh2.getVelocidad());
        System.out.println("El vehiculo numero 2 esta circulando en la marcha " + Veh2.getMarcha());
        Veh2.acelerar(50);
        Veh2.cambiarmarcha(3);
        Veh2.cambiarmarcha(9);
        Veh2.frenar(30);
        Veh2.cambiarmarcha(2);
    }
}
