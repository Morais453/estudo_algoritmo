package empresa;

public class Tecnico extends Funcionario {
    private String especialidade;

    public Tecnico(String nome, String cpf, double salario, String especialidade) {
        super(nome, cpf, salario);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
