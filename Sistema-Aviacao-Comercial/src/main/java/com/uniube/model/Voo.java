package com.uniube.model;

// Voo.java
public class Voo {
    private String origem;
    private String destino;
    private String data;
    private int assentosDisponiveis;

    public Voo(String origem, String destino, String data, int assentosDisponiveis) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public boolean reservarAssento() {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            return true;
        }
        return false;
    }

    public String getDetalhes() {
        return "Voo de " + origem + " para " + destino + " em " + data + " - Assentos disponíveis: " + assentosDisponiveis;
    }
}

