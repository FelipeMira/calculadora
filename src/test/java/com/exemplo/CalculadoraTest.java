package com.exemplo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5.0, calc.somar(2, 3), 0.00001);
        assertEquals(-1.0, calc.somar(2, -3), 0.00001);
    }

    @Test
    public void testSubtrair() {
        assertEquals(-1.0, calc.subtrair(2, 3), 0.00001);
        assertEquals(5.0, calc.subtrair(2, -3), 0.00001);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6.0, calc.multiplicar(2, 3), 0.00001);
        assertEquals(-6.0, calc.multiplicar(2, -3), 0.00001);
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6, 3), 0.00001);
        assertEquals(-2.0, calc.dividir(6, -3), 0.00001);
    }

    @Test
    public void testDividirPorZero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(1, 0));
        assertEquals("Divisor não pode ser zero", ex.getMessage());
    }
}
