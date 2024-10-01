# Projeto Conta Bancária - Java Semana 10 - UNILASALLE

Este projeto implementa um sistema de gerenciamento de contas bancárias em Java, com classes para diferentes tipos de contas. O sistema permite realizar operações básicas como depósitos e saques, além de calcular rendimentos para contas de poupança.

## Estrutura do Projeto

### Classes

#### ContaBancaria

- **Atributos:**
  - `String cliente`: Nome do cliente.
  - `int num_conta`: Número da conta.
  - `float saldo`: Saldo atual da conta.
  
- **Métodos:**
  - `sacar(float valor)`: Realiza um saque, garantindo que o saldo não fique negativo.
  - `depositar(float valor)`: Realiza um depósito, atualizando o saldo.

#### ContaPoupança (herda de ContaBancaria)

- **Atributos:**
  - `int diaRendimento`: Dia do mês em que o rendimento é calculado.
  
- **Métodos:**
  - `calcularNovoSaldo(float taxa)`: Calcula o novo saldo da conta com base na taxa de rendimento.

#### ContaEspecial (herda de ContaBancaria)

- **Atributos:**
  - `float limite`: Limite de crédito da conta, permitindo saldo negativo.
  
- **Métodos:**
  - `sacar(float valor)`: Redefine o método para permitir saques que resultem em saldo negativo, desde que dentro do limite.

#### Contas (classe principal com método main)

- **Funcionalidades:**
  - Inclusão de dados de clientes e suas contas.
  - Saques e depósitos em contas.
  - Cálculo de novos saldos para contas poupança com base na taxa de rendimento.
  - Exibição dos dados das contas de um cliente.

## Como Usar

1. **Iniciar o Programa**: Execute a classe `Contas` para iniciar o sistema.
2. **Incluir Dados**: Insira os dados do cliente e crie uma conta bancária (com opções de conta poupança ou conta especial).
3. **Realizar Operações**: Utilize os métodos disponíveis para sacar ou depositar valores.
4. **Visualizar Saldos**: Consulte o saldo atualizado e rendimentos, se aplicável.

## Exemplo de Uso

```java
public static void main(String[] args) {
    // Criação de uma nova conta
    ContaPoupança contaPoupanca = new ContaPoupança("João", 12345, 1000.0f, 15);
    
    // Depósito
    contaPoupanca.depositar(500.0f);
    
    // Saque
    contaPoupanca.sacar(300.0f);
    
    // Cálculo de novo saldo com taxa de rendimento
    contaPoupanca.calcularNovoSaldo(0.05f);
    
    // Exibir saldo
    System.out.println("Saldo atual: " + contaPoupanca.getSaldo());
}
