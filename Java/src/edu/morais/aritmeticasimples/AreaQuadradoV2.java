package edu.morais.aritmeticasimples;

import java.util.Scanner;

public class AreaQuadradoV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a diagonal do quadrado: ");
        int diagonal = scan.nextInt();
        int area = (diagonal * diagonal) / 2;
        System.out.println("A área do quadrado informado é "+ area+"cm²");
    }
}
