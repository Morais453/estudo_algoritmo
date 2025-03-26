package SysBank;

public class Main {
    public static void main(String[] args) {
        Cliente x = new Cliente("Andre", "00123456789");
        Conta contaX = new Conta( x,123456,100);
        contaX.imprimirSaldo();

        Banco b = new Banco();

        b.sacar(contaX,10);
        contaX.imprimirSaldo();

        Cliente y = new Cliente("Lui", "00123451234");
        Conta contaY = new Conta( y,113456,100);

        b.transferir(contaY,contaX,100);

        contaY.imprimirSaldo();
        contaX.imprimirSaldo();
    }
}
