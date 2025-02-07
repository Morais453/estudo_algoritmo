package edu.morais.aritmeticasimples;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o diametro da esfera: ");
        double diametro = scan.nextDouble();
        double volume = (Math.PI * Math.pow(diametro,3)) / 6 ;

        System.out.printf("O volume da esfera é %.2f%n", volume);
    }
}
