package app_banco;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, int diaRendimento) {
        super(cliente, numConta);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        saldo += saldo * taxaRendimento;
        System.out.println("Novo saldo após rendimento: " + saldo);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Dia de Rendimento: " + diaRendimento);
    }
}
