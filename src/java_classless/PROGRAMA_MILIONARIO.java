package java_classless;

import java.util.Scanner;

public class PROGRAMA_MILIONARIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+".\nInforme o valor do seu salário e suas despesas mensais, o programa lhe \ndirá em quanto tempo ficará milionário");

        System.out.print("\nValor do seu salário: R$");
        float salario = scanner.nextFloat();

        System.out.print("Despesas mensais: R$");
        float despesas = scanner.nextFloat();

        float n3 = salario-despesas;
        float n4 = n3*12;
        float n5 = 1000000/n4;

        System.out.printf("\nVocê ficará milionário em %.0f anos",(n5));
    }
}
