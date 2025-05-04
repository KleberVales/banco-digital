
import model.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Digital Bank");

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        Conta cc = new ContaCorrente(cliente1, 1000, 1234);  // Adicionada senha
        Conta cp = new ContaPoupanca(cliente2, 0.05, 5678);  // Adicionada senha

        // Testando autenticação
        System.out.println("Autenticação CC: " + cc.autenticar(1234));  // true
        System.out.println("Autenticação CC: " + cc.autenticar(0000));  // false
    }
}