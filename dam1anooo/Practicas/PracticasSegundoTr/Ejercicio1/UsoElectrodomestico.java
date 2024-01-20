package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1;
import java.util.Scanner;

public class UsoElectrodomestico{

    private static Television createTV(Scanner scanner){
        System.out.println("Introduce el precio base del TV");
        double precioBase = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el precio final del TV");
        double precioFinal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el color del TV");
        String color = scanner.nextLine();
        System.out.println("Introduce el consumo energetico del TV");
        char consumo = scanner.next().charAt(0);
        System.out.println("Introduce el peso del TV");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce la revolucion del TV");
        int revolucion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce si tiene sintonizador o no (SI/NO)");
        String sintonizador = scanner.nextLine().toLowerCase();
        boolean haySintonizador;

        if(sintonizador.equals("si")){
            haySintonizador = true;
        }else{
            haySintonizador = false;
        }

        return new Television(precioBase, precioFinal, color, consumo,peso, revolucion, haySintonizador);


    }
    private static Lavadora createLavadora(Scanner scanner){
        System.out.println("Introduce el precio base de la Lavadora");
        double precioBase = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el precio final de la Lavadora");
        double precioFinal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el color de la Lavadora");
        String color = scanner.nextLine();

        System.out.println("Introduce el consumo energetico de la Lavadora");
        char consumo = scanner.next().charAt(0);
        System.out.println("Introduce el peso del de la Lavadora");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce la carga del de la Lavadora");
        double carga = scanner.nextDouble();
        scanner.nextLine();

        return new Lavadora(precioBase, precioFinal, color, consumo, peso, carga);


    }

    public static void main(String[] args) throws ProductoIncorrecto {
        String opcion = "";
        Scanner sc = new Scanner(System.in);
        Electrodomestico[] electrodomesticos = new Electrodomestico[5];

        for (int i = 0; i < electrodomesticos.length; i++) {

            System.out.println("Introduzca el electrodomestico " + (i + 1));
            opcion = sc.next().toLowerCase();

            switch (opcion) {
                case "televisor":
                    electrodomesticos[i] = createTV(sc);
                    System.out.println("---------TELEVISOR---------");
                    System.out.println("El precio base es " + electrodomesticos[i].precio_base);
                    System.out.println("El precio final es " + electrodomesticos[i].precio_final);
                    System.out.println("El color del televisor es " + electrodomesticos[i].color);
                    System.out.println("El consumo del televisor es " + electrodomesticos[i].consumo_energetico);
                    System.out.println("Su peso es de " + electrodomesticos[i].peso + " kg.");

                    Electrodomestico electrodomestico = electrodomesticos[i];
                    Television tv = (Television) electrodomestico;
                    System.out.println("Su resolucion es de " + tv.resolucion);
                    System.out.println("Tiene sintonizador? " + tv.sintonizadorTDT);
                    break;
                case "lavadora":
                    electrodomesticos[i] = createLavadora(sc);
                    System.out.println("---------LAVADORA---------");
                    System.out.println("El precio base es " + electrodomesticos[i].precio_base);
                    System.out.println("El precio final es " + electrodomesticos[i].precio_final);
                    System.out.println("El color del televisor es " + electrodomesticos[i].color);
                    System.out.println("El consumo del televisor es " + electrodomesticos[i].consumo_energetico);

                    Lavadora lavadora = (Lavadora) electrodomesticos[i];
                    System.out.println("Su peso es de " + electrodomesticos[i].peso + " kg.");
                    System.out.println("Su carga es de " + lavadora.carga + " kg.");
                    break;
                default:
                    System.out.println("Introduzca un producto valido.");
                    break;
            }
        }
    }
}