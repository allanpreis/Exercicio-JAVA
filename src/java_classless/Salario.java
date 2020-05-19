package java_classless;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+", informe abaixo o número de horas trabalhada e o valor da hora para saber seu salário");

        System.out.print("\nInforme o número de horas trabalhadas: ");
        int ht = scanner.nextInt();

        System.out.print("Informe o valor da hora de trabalho: R$");
        float vh = scanner.nextFloat();

        float salario = ht * vh;

        System.out.println("\nO salário a ser recebido é de R$"+salario);
    }
}
