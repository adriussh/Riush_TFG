package PrimerAnyo.SegundoTr.Sesion0303;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraParametrizedTestTest {

    @ParameterizedTest
    @CsvSource({"20,5,25","10,5,10"})
    void sumar(int a, int b, int valoresperado) {
        CalculadoraParametrizedTest cc1 = new CalculadoraParametrizedTest(a,b);
        double valorobtenido= cc1.sumar(a,b,valoresperado);
        assertEquals(valoresperado, valorobtenido, 0);

    }

    @ParameterizedTest
    @CsvSource({"20,5,25","10,5,5"})
    void restar(int a, int b, int valoresperado) {
        CalculadoraParametrizedTest cc1 = new CalculadoraParametrizedTest(a,b);
        double valorobtenido= cc1.restar(a,b,valoresperado);
        assertEquals(valoresperado,valorobtenido,0);
    }
}