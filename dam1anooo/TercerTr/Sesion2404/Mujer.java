package PrimerAnyo.TercerTr.Sesion2404;

public class Mujer extends Persona{
    private boolean luz;

    public Mujer(String dni, String nombre, String apelido1, int edad, double altura, double peso, boolean luz) {
        super(dni, nombre, apelido1, edad, altura, peso);
        this.luz = luz;
    }

    public boolean isLuz() {
        return luz;
    }

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    @Override
    public Categoria CalcularCategoria() {
        Categoria cat = null;
        if(icm<18.5){
            cat=Categoria.ANOREXIA;

        } else if (icm>=18.5&&icm<24.9) {
            cat=Categoria.IDEAL;
        }else {
            cat=Categoria.SOBREPESO;
        }
        return cat;
    }
}
