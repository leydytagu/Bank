package com.bank.clientes;

public class Cliente {
    private String nombre;
    private double saldo;

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consignar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
}
