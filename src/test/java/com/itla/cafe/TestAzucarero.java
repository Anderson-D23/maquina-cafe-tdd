package com.itla.cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAzucarero {

    Azucarero azucarero;

    @Before
    public void setUp() {
        azucarero = new Azucarero(10);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(5);

        assertEquals(true, resultado);

        resultado = azucarero.hasAzucar(10);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero() {
        boolean resultado = azucarero.hasAzucar(15);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero() {
        azucarero.giveAzucar(5);

        assertEquals(5, azucarero.getCantidadAzucar());

        azucarero.giveAzucar(2);

        assertEquals(3, azucarero.getCantidadAzucar());
    }
}
