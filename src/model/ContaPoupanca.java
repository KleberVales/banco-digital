package model;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(Cliente cliente, double rendimento, int senha) {
        super(cliente, senha);
        this.rendimento = rendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimento;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de Rendimento: %.2f%%", this.rendimento * 100));
    }
}