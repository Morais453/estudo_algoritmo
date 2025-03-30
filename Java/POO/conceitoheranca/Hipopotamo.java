package conceitoheranca;

public class Hipopotamo extends Animal{
    private int forcaMordida;

    public Hipopotamo(String nome, int idade, String sexo) {
        super();
    }

    public void nadar(){
        System.out.println("Nadando");
    }

    public int getForcaMordida() {
        return forcaMordida;
    }

    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }
}
