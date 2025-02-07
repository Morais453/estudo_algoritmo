/*Modele um funcionário. Ele deve ter o nome do funcionário (string), o departamento onde trabalha (string),
seu salário (double), a data de entrada no banco (String) e seu RG (String).
Crie um método recebeAumento(double percentual) que aumenta o salario do funcionário de acordo com o parâmetro passado
como argumento.
Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo o valor do salário
anual considerando 13o e férias.*/

import java.util.Scanner;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String entradaBanco;
    String rg;

    // Construtor que inicializa os atributos
    public Funcionario(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        this.nome = scan.next();

        System.out.print("Informe o salario do funcionário: ");
        this.salario = scan.nextDouble();

        System.out.print("Informe o departamento do funcionário: ");
        this.departamento = scan.next();

        System.out.print("Informe a data de cadastro bancario do funcionário: ");
        this.entradaBanco = scan.next();

        System.out.print("Informe o RG do funcionário: ");
        this.rg = scan.next();

        System.out.println("O funcionário "+nome+" foi criado com sucesso");

        scan.close();
    }
    /*public Funcionario(String nome, String departamento, double salario, String entradaBanco, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.entradaBanco = entradaBanco;
        this.rg = rg;
    }*/

    public void receberAumento(double percentual){

        salario += (salario * percentual) / 100;
    }
    public void calcularGanhoAnual(){
        /*Supondo que o funcionario trabalhou os 12 meses sendo assim 1 salario
        calculo de ferias simples salario + (salario/3)

        double decimoTerceiro = salario;
        double ferias = salario + (salario / 3);
        double ganhoAnual = (salario * 12) + decimoTerceiro + ferias;*/

        double ganhoAnual = (salario*14) + (salario/3);
        System.out.printf("Seu ganho anual é: %.2f%n", ganhoAnual);
    }
    public void dadosFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("RG: " + rg);
    }
}
