package com.uniube.main;

import com.uniube.model.Cliente;
import com.uniube.model.Reserva;
import com.uniube.model.Voo;
import com.uniube.service.Pagamento;
import com.uniube.service.PagamentoCartaoCredito;
import com.uniube.service.PagamentoPIX;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Criar voos disponíveis
        List<Voo> voos = new ArrayList<>();
        voos.add(new Voo("São Paulo", "Rio de Janeiro", "2024-12-15", random.nextInt(20) + 5));
        voos.add(new Voo("Belo Horizonte", "Salvador", "2024-12-20", random.nextInt(20) + 5));
        voos.add(new Voo("Curitiba", "Porto Alegre", "2024-12-18", random.nextInt(20) + 5));

        // Bem-vindo ao sistema
        System.out.println("Bem-vindo ao sistema de reserva de passagens aéreas!");
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Crie uma senha: ");
        String senha = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, senha);
        System.out.println("Cadastro concluído com sucesso!");

        // Exibir voos disponíveis
        System.out.println("\nVoos disponíveis:");
        for (int i = 0; i < voos.size(); i++) {
            System.out.println((i + 1) + ". " + voos.get(i).getDetalhes());
        }

        // Escolha do voo
        System.out.print("\nEscolha o número do voo desejado: ");
        int escolhaVoo = scanner.nextInt();
        Voo vooEscolhido = voos.get(escolhaVoo - 1);

        System.out.println("Você escolheu: " + vooEscolhido.getDetalhes());

        // Escolha de assentos
        System.out.print("Informe a quantidade de assentos que deseja reservar: ");
        int quantidadeAssentos = scanner.nextInt();

        boolean reservaSucesso = true;
        for (int i = 0; i < quantidadeAssentos; i++) {
            if (!vooEscolhido.reservarAssento()) {
                reservaSucesso = false;
                System.out.println("Desculpe, não há assentos suficientes disponíveis.");
                break;
            }
        }

        if (reservaSucesso) {
            System.out.println("Reserva realizada com sucesso para " + quantidadeAssentos + " assento(s).");
            Reserva reserva = new Reserva(cliente, vooEscolhido);

            // Escolha de pagamento
            System.out.println("\nDeseja realizar o pagamento?");
            System.out.println("Digite 7 para pagar ou qualquer outro número para encerrar: ");
            int opcaoPagamento = scanner.nextInt();

            if (opcaoPagamento == 7) {
                System.out.println("Escolha o método de pagamento:");
                System.out.println("1. Cartão de Crédito");
                System.out.println("2. PIX");
                int metodoPagamento = scanner.nextInt();

                Pagamento pagamento;
                if (metodoPagamento == 1) {
                    pagamento = new PagamentoCartaoCredito();
                } else {
                    pagamento = new PagamentoPIX();
                }

                // Processar pagamento
                double valorTotal = 300.0 * quantidadeAssentos; // Valor fictício por assento
                pagamento.processarPagamento(valorTotal);

                // Gerar ID de compra
                int idCompra = random.nextInt(100000) + 1000;
                System.out.println("Pagamento realizado com sucesso!");
                System.out.println("Número do bilhete: #" + idCompra);
            } else {
                System.out.println("Operação encerrada. Obrigado por usar o sistema!");
            }
        }
    }
}

