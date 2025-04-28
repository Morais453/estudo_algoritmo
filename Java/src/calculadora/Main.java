package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean valido = true;

        while (valido) {
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                Calculadora Simples, opções:
                1 - adição
                2 - subtração
                3 - multiplicação
                4 - divisão
                
                0 - sair
                """);

            System.out.print("Insira a operação desejada: ");
            int opcao = sc.nextInt();
            double num1;
            double num2;

            switch (opcao) {
                case 1:
                    System.out.print("Insira o primeiro número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Insira o segundo número a ser somado: ");
                    num2 = sc.nextDouble();

                    System.out.printf("A soma dos numeros %.2f + %.2f é %.2f \n", num1, num2, Operacoes.soma(num1, num2));
                    break;
                case 2:
                    System.out.print("Insira o número a ser subtraido: ");
                    num1 = sc.nextDouble();
                    System.out.print("Insira o número a subtrair: ");
                    num2 = sc.nextDouble();

                    System.out.printf("A subtração dos numeros %.2f - %.2f é %.2f \n", num1, num2, Operacoes.subtracao(num1, num2));
                    break;
                case 3:
                    System.out.print("Insira o número a ser multiplicado: ");
                    num1 = sc.nextDouble();
                    System.out.print("Insira o número multiplicador: ");
                    num2 = sc.nextDouble();

                    System.out.printf("A multiplicação dos numeros %.2f * %.2f é %.2f \n", num1, num2, Operacoes.multiplicacao(num1, num2));
                    break;
                case 4:
                    System.out.print("Insira o número a ser dividido: ");
                    num1 = sc.nextDouble();
                    System.out.print("Insira o número divisor: ");
                    num2 = sc.nextDouble();

                    System.out.printf("A divisão dos numeros %.2f / %.2f é %.2f \n", num1, num2, Operacoes.divisao(num1, num2));
                    break;
                case 0:
                    valido = false;
                    System.out.println("""
                            Encerrando o programa, Obrigado e até a próxima...
                            """);

            sc.close();
            }
        }

    }
}
