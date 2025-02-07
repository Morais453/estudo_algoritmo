package edu.morais.aritmeticasimples;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somaNotas = 0;

        for(int i = 0; i<4; i++) {
            System.out.printf("Informe a nota %d: ",(i+1));
            somaNotas += scan.nextDouble();
        }
        double media = somaNotas / 4;
        System.out.println("A média das notas informadas é "+media);
    }

}
