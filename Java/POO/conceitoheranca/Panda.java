package conceitoheranca;

public class Panda extends Animal{
    private String cor;
    private String corSecundaria;

    public Panda(String nome, int idade, String sexo) {
        super();
    }

    public Panda() {
        super();
    }

    public void subirArvore(){
        System.out.println("Subir Arvore");
    }

    public String getCorSecundaria() {
        return corSecundaria;
    }

    public void setCorSecundaria(String corSecundaria) {
        this.corSecundaria = corSecundaria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cor primaria: " + this.getCor());
        System.out.println("Cor secundaria: " + this.getCorSecundaria());
    }
}
