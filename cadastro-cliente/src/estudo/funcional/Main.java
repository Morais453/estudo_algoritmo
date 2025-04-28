package estudo.funcional;

public class Main {
    public static void main(String[] args) {

        //implementação via classe anonima
        Calculadora calc = new Calculadora() {
            @Override
            public int calcular(int x, int y) {
                return x + y;
            }
        };

        //expressões lambda
        /*calc = (x, y) -> {
            return x + y;
        };*/
        calc = (x, y) -> x + y;

        Calculadora subtracao = (x, y) -> x - y;


        System.out.println(calc.calcular(1, 2));

        System.out.println(subtracao.calcular(2, 3));

    }
}
