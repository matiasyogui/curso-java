package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    Calculadora calculadora = new Calculadora();
    @Test
    public void testSumaCalculadora() {
        Integer esperado = 10 + 13;
        assertEquals(calculadora.sumar(10, 13), esperado);
    }

    @Test
    public void testRestaCalculadora() {
        Integer esperado = 10 - 13;
        assertEquals(calculadora.restar(10, 13), esperado);
    }

    @Test
    public void testMultiplicacionCalculadora() {
        Integer esperado = 10 * 13;
        assertEquals(calculadora.multiplicar(10, 13), esperado);
    }
}
