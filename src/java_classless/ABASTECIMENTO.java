package java_classless;

import java.util.Scanner;

public class ABASTECIMENTO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("\nOlá "+nome+". \nInforme abaixo o quanto está o preço da gasolina e quanto reais deseja abastecer, o programa lhe mostrará quantos litros dará");

        System.out.print("\nCombustível: R$");
        float combustivel = scanner.nextFloat();

        System.out.print("Quanto deseja abastecer: R$");
        float quantia = scanner.nextFloat();

        float vf = quantia / combustivel;

        System.out.printf("\nVocê irá abastecer %.2fl de combustível", (vf));
    }
}
