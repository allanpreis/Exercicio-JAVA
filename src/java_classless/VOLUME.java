package java_classless;

import java.util.Scanner;

public class VOLUME {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+".\nInforme abaixo a altura e o raio de uma lata de óleo pra saber seu volume");

        System.out.print("\nAltura: ");
        int altura = scanner.nextInt();

        System.out.print("Raio: ");
        int r = scanner.nextInt();

        double volume = 3.14*(r*r)*altura;

        System.out.printf("\nO volume da lata é %.1f m³", (volume));
    }
}
