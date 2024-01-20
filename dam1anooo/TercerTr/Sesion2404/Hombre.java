package PrimerAnyo.TercerTr.Sesion2404;

public class Hombre extends Persona{
    private boolean bbara;

    public Hombre(String dni, String nombre, String apelido1, int edad, double altura, double peso, boolean bbara) {
        super(dni, nombre, apelido1, edad, altura, peso);
        this.bbara = bbara;
    }

    public boolean isBbara() {
        return bbara;
    }

    public void setBbara(boolean bbara) {
        this.bbara = bbara;
    }

    @Override
    public Categoria CalcularCategoria() {
        Categoria cat = null;
        if(icm<20){
            cat=Categoria.ANOREXIA;

        } else if (icm>=20&&icm<26.5) {
            cat=Categoria.IDEAL;
        }else {
            cat=Categoria.SOBREPESO;
        }
        return cat;
    }
}
