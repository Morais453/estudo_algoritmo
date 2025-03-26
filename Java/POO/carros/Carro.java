package carros;

public class Carro {
    int cavalos;
    String cor;
    String transmissao;
    String montadora;
    int capacidadeTanque;
    int combustivel;
    int kmPorLitro;

    public Carro(int cavalos, String cor, String transmissao, String montadora, int capacidadeTanque, int combustivel, int kmPorLitro) {
        this.cavalos = cavalos;
        this.cor = cor;
        this.transmissao = transmissao;
        this.montadora = montadora;
        this.capacidadeTanque = capacidadeTanque;
        this.combustivel = combustivel;
        this.kmPorLitro = kmPorLitro;
    }

    void abastecer(int litros){
        int soma = combustivel + litros;
        if (soma > capacidadeTanque){
            combustivel = capacidadeTanque;
            int resto = soma - capacidadeTanque;
            System.out.println("Combustivel atingiu a capacidade maxima do tanque " + capacidadeTanque + "L, restaram " + resto + "L");
        } else {
            combustivel = soma;
            System.out.println("Carro abastecido, combustivel atual " + combustivel + "L");
        }
    }

    int autonomiaCombustivel(){
        int autonomia = kmPorLitro * combustivel;
        return autonomia;
    }
}
