# ✈️ Sistema de Reserva de Passagens Aéreas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)

## 📜 Descrição

Este projeto é um **Sistema de Reserva de Passagens Aéreas** desenvolvido em **Java** com foco em **Programação Orientada a Objetos (POO)**. O objetivo é permitir que os usuários realizem reservas e compras de passagens de forma intuitiva e funcional, simulando um sistema real com interações diretas via console.

---

## 🚀 Funcionalidades Implementadas

### 🧑‍💻 Cadastro de Usuário
- Permite que o cliente informe **nome**, **e-mail** e **senha** para criar um perfil no sistema.
- Confirma o cadastro com uma mensagem personalizada.

### ✈️ Exibição de Voos Disponíveis
- Lista os voos disponíveis, incluindo:
  - Origem e destino.
  - Data do voo.
  - Número de assentos disponíveis (gerados aleatoriamente).

### 🎟️ Reserva de Assentos
- O cliente pode escolher o voo e a quantidade de assentos que deseja reservar.
- Verifica automaticamente a disponibilidade e confirma a reserva com uma mensagem.

### 💳 Pagamento de Passagens
- Oferece dois métodos de pagamento:
  1. **Cartão de Crédito**.
  2. **PIX**.
- Calcula o valor total com base na quantidade de assentos reservados (R$ 300,00 por assento).
- Gera um número único de bilhete após a confirmação do pagamento.

### 🛑 Encerramento do Sistema
- O cliente pode optar por não pagar e encerrar o sistema de forma segura.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **IDE:** IntelliJ IDEA
- **Conceitos Aplicados:**
  - Programação Orientada a Objetos (POO)
  - Herança e Polimorfismo
  - Interfaces
  - Encapsulamento
  - Geração de números aleatórios para simular dados dinâmicos

---

## 📖 Detalhes da Implementação

### 🔑 Programação Orientada a Objetos
- **Herança:** `Cliente` e `Administrador` herdam de `Usuario`.
- **Polimorfismo:** Interface `Pagamento` com diferentes implementações para cartão de crédito e PIX.
- **Encapsulamento:** Uso de getters e setters para acesso aos atributos privados.
- **Classes Abstratas:** Generalização de comportamentos em `Usuario`.

### 🎲 Interatividade
- Uso de `Scanner` para entrada de dados do usuário.
- Geração de números aleatórios para simular assentos disponíveis e IDs de bilhetes.

### 💡 Funcionalidade Dinâmica
- O sistema valida automaticamente a disponibilidade de assentos antes de confirmar a reserva.
- Gera um ID de bilhete único para cada transação de pagamento.

---

## 📝 Autor

**Matheus Guerra**  
📧 E-mail: [matheusaraujoguerra2603@outlook.com](matheusaraujoguerra2603@outlook.com)  
🌐 LinkedIn: [Matheus Guerra](https://www.linkedin.com/in/matheus-guerra-485070277/)  



