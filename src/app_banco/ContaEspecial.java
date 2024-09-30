package app_banco;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int numConta, float limite) {
        super(cliente, numConta);
        this.limite = limite;
    }

    
    public void sacar(float valor) {
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }
}
