package SysBank;

public class Conta {
    private Cliente titular;
    private int numero;
    private double saldo;

    public Conta(Cliente titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
    }

    // Getters e Setters
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double valor) {
        this.saldo += valor;
    }

}
