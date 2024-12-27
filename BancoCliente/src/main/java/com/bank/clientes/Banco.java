package com.bank.clientes;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public double getTotalCaja() {
        return clientes.stream().mapToDouble(Cliente::getSaldo).sum();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
