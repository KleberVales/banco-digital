package service;

import model.Conta;

public interface OperacoesBancarias {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
}