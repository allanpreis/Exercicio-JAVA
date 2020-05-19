package java_classless;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+". Informe abaixo 3 produtos, a quantia que deseja, seu preço e o valor desconto que receberá");

        System.out.print("1º produto: ");
        String p1 = scanner.next();
        System.out.print("Quantia: ");
        int quantidade1 = scanner.nextInt();
        System.out.print("Preço: R$");
        double preco1 = scanner.nextDouble();
        System.out.print("Quantos porcento de desconto por produto? ");
        double desconto1 = scanner.nextDouble();

        double precocomdesconto = (preco1 * desconto1)/100;
        double precofinal = precocomdesconto * quantidade1;

        System.out.print("\n2º produto: ");
        String p2 = scanner.next();
        System.out.print("Quantia: ");
        int q2 = scanner.nextInt();
        System.out.print("Preço: R$");
        double pr2 = scanner.nextFloat();
        System.out.print("Quantos porcento de desconto por produto? ");
        double d2 = scanner.nextInt();

        double resultado2 = (pr2 * d2)/100;
        double precofinal2 = resultado2 * q2;

        System.out.print("\n3º produto: ");
        String p3 = scanner.next();
        System.out.print("Quantia: ");
        int q3 = scanner.nextInt();
        System.out.print("Preço: R$");
        double pr3 = scanner.nextFloat();
        System.out.print("Quantos porcento de desconto por produto? ");
        double d3 = scanner.nextInt();

        double resultado3 = (pr3 * d3)/100;
        double precofinal3 = resultado3 * q3;

        double tp = precofinal + precofinal2 + precofinal3;

        System.out.println("\nO total a ser pago será R$"+tp);
    }
}
