package PrimerAnyo.Practicas.PracticasSegundoTr.Ejercicio1Correccion;

public class UsoElectrodomestico {
    public static void main(String[] args) {
        //crear un array de 5 posiciones
        Electrodomestico[] l_electro = new Electrodomestico[5];

        //o bien lavadoras o bien televisores
        Television t1=new Television(200,5,50,true);
        Television t2=new Television(35,25,50,true);
        Television t3=new Television(15,60,50,true);

        Lavadora l1=new Lavadora(55,60,35);
        Lavadora l2=new Lavadora(300,85,50);

        l_electro[0]=t1;
        l_electro[1]=t2;
        l_electro[2]=t3;
        l_electro[3]=l1;
        l_electro[4]=l2;

        float precio_televisiones=0;
        float precio_lavadoras=0;
        float precio_total=0;

        for (int i=0;i<l_electro.length;i++){
            System.out.println("El electrodomestico "+l_electro[i].getClass().getSimpleName()+" tiene un precio final de "+l_electro[i].getPrecio_final());
            if (l_electro[i] instanceof Lavadora){
                precio_lavadoras+=l_electro[i].precio_final;
            } else if (l_electro[i] instanceof Television) {
                precio_televisiones+=l_electro[i].precio_final;
            }
            precio_total=precio_lavadoras+precio_televisiones;
        }
        System.out.println(" ");
        System.out.println("El precio final de todas las lavadoras es "+precio_lavadoras);
        System.out.println("El precio final de todas las televisiones es "+precio_televisiones);
        System.out.println("El precio total de todos los electrodomesticos es "+precio_total);
    }
}

