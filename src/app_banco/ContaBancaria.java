package app_banco;

public class ContaBancaria {
    protected String cliente;
    protected int numConta;
    protected float saldo;

    public ContaBancaria(String cliente, int numConta) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = 0.0f; 
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public float getSaldo() {
        return saldo;
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}

