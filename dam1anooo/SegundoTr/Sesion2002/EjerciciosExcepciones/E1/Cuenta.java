package PrimerAnyo.SegundoTr.Sesion2002.EjerciciosExcepciones.E1;

public class Cuenta {
    private String titular;
    private String numero_cuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, String numero_cuenta, double saldo) {
        this.titular = titular;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString(){
        return "La cuenta con numero "+numero_cuenta+" tiene como titular a "+titular+" con un saldo disponible de "+saldo+".";
    }

    public void ingresar(double cantidad) throws CantidadIncorrecta {
        if(saldo<0){
            throw new CantidadIncorrecta("No se puede ingresar una cantidad negativa.");
        }
        saldo=saldo+cantidad;
    }
    public void retirar(double cantidad) throws CantidadIncorrecta{
        if(cantidad>saldo){
            throw new CantidadIncorrecta("No se puede retirar una cantidad negativa.");
        }
        saldo=saldo-cantidad;
    }
}
