package PrimerAnyo.SegundoTr.Sesion1502.E1;

public class Perro extends Animal {

    private String raza;

    public Perro(int edad, String raza) {
        this.raza=raza;
        this.edad=edad;
    }

    public void saySomething (){
        System.out.println("guau, guau");
    }


    public String showInfo() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                "} " + super.toString();
    }
}
