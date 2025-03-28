package conceitoheranca;

public class Panda extends Animal{
    private String cor;
    private String corSecundaria;

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

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Cores: " + getCor() + " e " + getCorSecundaria());
    }
}
