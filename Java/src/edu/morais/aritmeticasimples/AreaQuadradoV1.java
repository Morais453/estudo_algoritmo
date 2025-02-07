package edu.morais.aritmeticasimples;
import java.util.Scanner;

public class AreaQuadradoV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a aresta: ");
        int lado = scan.nextInt();
        int area = lado * lado;
        System.out.println("A área do quadrado informado é "+ area);
    }
}
