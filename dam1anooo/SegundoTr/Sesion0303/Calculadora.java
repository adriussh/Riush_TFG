package PrimerAnyo.SegundoTr.Sesion0303;

public class Calculadora {
    //atributos
    private int num1;
    private int num2;

    public Calculadora() {
    }
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sumar(int num1, int num2){
        return num1+num2;
    }

    public int restar(int num1, int num2){
        return num1-num2;
    }

    public int multi(int num1, int num2){
        return num1*num2;
    }

    public int dividir(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("division por 0");
        } else {
            return num1/num2;
        }
    }
}
