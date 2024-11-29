package com.uniube.model;

// Reserva.java
public class Reserva {
    private Cliente cliente;
    private Voo voo;

    public Reserva(Cliente cliente, Voo voo) {
        this.cliente = cliente;
        this.voo = voo;
    }

    public boolean confirmarReserva() {
        return voo.reservarAssento();
    }
}

