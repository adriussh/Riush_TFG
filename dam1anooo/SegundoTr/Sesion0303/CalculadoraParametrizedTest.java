package PrimerAnyo.SegundoTr.Sesion0303;

class CalculadoraParametrizedTest {
    private int num1;
    private int num2;

    public CalculadoraParametrizedTest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int sumar(int num1, int num2, int valoresperado) {
        valoresperado=num1+num2;
        return valoresperado;
    }

    int restar(int num1, int num2, int valoresperado) {
        valoresperado=num1-num2;
        return valoresperado;
    }
}