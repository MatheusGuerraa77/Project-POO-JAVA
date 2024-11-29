package com.uniube.service;

// PagamentoPIX.java
public class PagamentoPIX implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}
