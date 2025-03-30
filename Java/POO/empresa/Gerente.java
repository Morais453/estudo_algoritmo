package empresa;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonificacao() {
        double bonificacaoPadrao = super.calcularBonificacao();
        return bonificacaoPadrao + 500;
    }
}
