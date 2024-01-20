package PrimerAnyo.SegundoTr.Sesion1502.E1;

public class Cerdo extends Animal {

    private String alimentacion;

    public Cerdo (int edad, String alimentacion){
        this.alimentacion=alimentacion;
        this.edad=edad;
    }

    public void saySomething (){
        System.out.println("oink, oink");
    }

    public String showInfo() {
        return "Cerdo{" +
                "alimentacion='" + alimentacion + '\'' +
                "} " + super.toString();
    }
}
