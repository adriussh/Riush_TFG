package PrimerAnyo.SegundoTr.Sesion1502.E1;

public class Gato extends Animal {
    private String color;


    public Gato(int edad,String color){
        this.edad=edad;

        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void saySomething (){
        System.out.println("miau");
    }


    public String showInfo() {
        return "Gato{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
