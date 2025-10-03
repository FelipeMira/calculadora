package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5.0, calc.somar(2, 3));
        assertEquals(-1.0, calc.somar(2, -3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(-1.0, calc.subtrair(2, 3));
        assertEquals(5.0, calc.subtrair(2, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6.0, calc.multiplicar(2, 3));
        assertEquals(-6.0, calc.multiplicar(2, -3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6, 3));
        assertEquals(-2.0, calc.dividir(6, -3));
    }

    @Test
    public void testDividirPorZero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0));
        assertEquals("Divisor não pode ser zero", ex.getMessage());
    }
}
