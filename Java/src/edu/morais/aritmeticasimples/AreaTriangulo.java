package edu.morais.aritmeticasimples;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = scan.nextInt();
        System.out.print("Informe a altura: ");
        int altura = scan.nextInt();
        int area = (base * altura) / 2;
        System.out.println("A área do triangulo informado é "+ area);
    }
}
