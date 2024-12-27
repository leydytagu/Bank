package com.bank.clientes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BancoTest {
    private Banco banco;

    @Before
    public void setUp() {
        banco = new Banco();
        banco.agregarCliente(new Cliente("Pedro", 2000));
        banco.agregarCliente(new Cliente("Maria", 3000));
    }

    @Test
    public void testTotalCaja() {
        Assert.assertEquals(5000, banco.getTotalCaja(), 0);
    }

    @Test
    public void testAgregarCliente() {
        banco.agregarCliente(new Cliente("Luis", 1000));
        Assert.assertEquals(3, banco.getClientes().size());
        Assert.assertEquals(6000, banco.getTotalCaja(), 0);
    }
}
