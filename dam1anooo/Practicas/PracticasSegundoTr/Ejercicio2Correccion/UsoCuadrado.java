package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio2Correccion;

public class UsoCuadrado {
    public static void main(String[] args) throws ExcepcionCuadrado {
        try {
            //Figura f1 = new Figura();
            //Cuadrado cc1 = new Cuadrado(0);
            //Cuadrado cc2 = new Cuadrado(-5);
        /*Cuadrado cc3 = new Cuadrado(5);
        System.out.println("Dibujando cuadrado.....");
        System.out.println(" ");
        cc3.dibujar();
        System.out.println(" ");
        System.out.println("El area del cuadrado es: "+cc3.area());
        System.out.println("El volumen del cuadrado es: "+cc3.volumen());
        System.out.println("El lado del cuadrado es: "+cc3.getLado());
        System.out.println("Introduzca un nuevo valor para el lado.");
        Scanner sc = new Scanner(System.in);
        cc3.setLado(sc.nextInt());
        System.out.println("El area del cuadrado con el nuevo lado es: "+cc3.area());
        System.out.println("El volumen del cuadrado con el nuevo lado es: "+cc3.volumen());
        System.out.println("El lado del cuadrado con el nuevo lado es: "+cc3.getLado());*/
            Cuadrado A1 = new Cuadrado(1);
            Cuadrado A2 = new Cuadrado(2);
            Cuadrado A3 = new Cuadrado(3);

            Cuadrado[] l_cuadrado  = {A1,A2,A3};
            for (int i=0;i<l_cuadrado.length;i++){
                System.out.println("El cuadrado "+(i+1)+" tiene un area de "+l_cuadrado[i].area()+" y un volumen de "+l_cuadrado[i].volumen());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
