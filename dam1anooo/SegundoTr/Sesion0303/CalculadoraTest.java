package PrimerAnyo.SegundoTr.Sesion0303;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        double valorEsperado=200;
        Calculadora ggs = new Calculadora(100,100);
        double valorEjecutador= ggs.sumar(100,100);
        assertEquals(valorEsperado,valorEjecutador,0);
    }

    @org.junit.jupiter.api.Test
    void restar() {
        double valorEsperado=50;
        Calculadora ggs = new Calculadora(100,50);
        double valorEjecutador= ggs.restar(100,50);
        assertEquals(valorEsperado,valorEjecutador,0);
    }

    @org.junit.jupiter.api.Test
    void multi() {
        double valorEsperado=10;
        Calculadora ggs = new Calculadora(5,2);
        double valorEjecutador= ggs.multi(5,2);
        assertEquals(valorEsperado,valorEjecutador,0);
    }

    @org.junit.jupiter.api.Test
    void dividir_ok() {
        double valorEsperado=5;
        Calculadora ggs = new Calculadora(10,2);
        double valorEjecutador= ggs.dividir(10,2);
        assertEquals(valorEsperado,valorEjecutador,0);
    }

    @org.junit.jupiter.api.Test
    void dividir_ko() {
        Calculadora ggs = new Calculadora(10,2);
        Assertions.assertThrows(ArithmeticException.class,()->ggs.dividir(10,0));
    }
}