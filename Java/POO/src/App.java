public class App {
    public static void main(String[] args) {

        Funcionario carlin = new Funcionario();

        carlin.dadosFuncionario();

        //calcula e exibe o ganho anual do funcionário com base no salário atual
        carlin.calcularGanhoAnual();

        //aplica um aumento de 20% ao salário do funcionário
        carlin.receberAumento(20);

        //calcula e exibe o ganho anual atualizado após o aumento
        carlin.calcularGanhoAnual();
    }
}
