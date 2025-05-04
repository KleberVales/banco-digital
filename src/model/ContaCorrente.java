package model;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double chequeEspecial, int senha) {
        super(cliente, senha);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Cheque Especial: %.2f", this.chequeEspecial));
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + chequeEspecial)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}