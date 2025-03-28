package conceitoheranca;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.setCorSecundaria("Preto");
        panda.setNome("Po");
        panda.setIdade(10);
        panda.setSexo("M");
        panda.setCor("Branco");

        panda.imprimirDados();
    }
}
