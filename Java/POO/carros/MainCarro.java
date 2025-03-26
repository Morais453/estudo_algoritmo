package carros;

public class MainCarro {
    public static void main(String[] args) {
        Carro x = new Carro(160,"Preto", "Manual", "Fiat", 80,0,20);
        x.abastecer(30);
        System.out.println("Autonomia de " + x.autonomiaCombustivel() + "km");
        x.abastecer(60);
        System.out.println("Autonomia de " + x.autonomiaCombustivel() + "km");
    }
}
