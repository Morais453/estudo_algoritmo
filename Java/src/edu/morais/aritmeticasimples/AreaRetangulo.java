package edu.morais.aritmeticasimples;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = scan.nextInt();
        System.out.print("Informe a altura: ");
        int altura = scan.nextInt();
        int area = base * altura;
        System.out.println("A área do retangulo informado é "+ area);

    }
}
