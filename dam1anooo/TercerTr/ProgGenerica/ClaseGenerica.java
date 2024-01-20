package PrimerAnyo.TercerTr.ProgGenerica;

public class ClaseGenerica implements Operable{
    public double valor1;
    public double valor2;

    public ClaseGenerica() {
    }

    public ClaseGenerica(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double sumaa() {
        return valor1+valor2;
    }

    @Override
    public double resta() {
        return valor1-valor2;
    }

    @Override
    public String producto() {
        return null;
    }

    @Override
    public String division() {
        return null;
    }
}
