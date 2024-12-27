package com.bank.clientes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Juan", 1000);
    }

    @Test
    public void testConsignar() {
        cliente.consignar(500);
        Assert.assertEquals(1500, cliente.getSaldo(), 0);
    }

    @Test
    public void testRetirar() {
        cliente.retirar(200);
        Assert.assertEquals(800, cliente.getSaldo(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRetirarSaldoInsuficiente() {
        cliente.retirar(2000); // Debe lanzar una excepción
    }
}
