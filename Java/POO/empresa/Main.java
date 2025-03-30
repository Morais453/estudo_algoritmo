package empresa;

public class Main {
    public static void main(String[] args) {
        Tecnico junin = new Tecnico("Junin", "00123456789", 1400, "DBA");
        junin.imprimirRemuneracao();

        Gerente jorgin = new Gerente("Jorgin", "00123456789", 2500);
        jorgin.imprimirRemuneracao();
    }
}
