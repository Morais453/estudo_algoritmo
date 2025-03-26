package SysBank;

public class Banco {
    void depositar(Conta conta, double valor) {
        conta.saldo += valor;
        System.out.println("Deposito realizado com sucesso!, saldo: " + conta.saldo);
    }

    void sacar(Conta conta, double valor) {
        if (conta.saldo >= valor) {
            conta.saldo -= valor;
            System.out.println("Saque realizado com sucesso!, saldo: " + conta.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    void transferir(Conta origem,Conta destino, double valor) {
        if (origem.saldo >= valor) {
            origem.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia realizada com sucesso!, saldo: " + origem.saldo);
        } else {
            System.out.println("Saldo insuficiente! Transferencia não realizada!");
        }

    }
}
