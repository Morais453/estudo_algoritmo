package SysBank;

public class Banco {
    void depositar(Conta conta, double valor) {
        if (valor > 0) {
            conta.setSaldo(+valor);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso, saldo: " + conta.getSaldo());
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(Conta conta, double valor) {
        if (valor > 0 && conta.getSaldo() >= valor) {
            conta.setSaldo(-valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso!, saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void transferir(Conta origem,Conta destino, double valor) {
        if (origem.getSaldo() >= valor) {
            origem.setSaldo(-valor);
            depositar(destino, valor);
            System.out.println("Transferencia realizada com sucesso!, saldo: " + origem.getSaldo());
        } else {
            System.out.println("Saldo insuficiente! Transferencia não realizada!");
        }

    }
}
