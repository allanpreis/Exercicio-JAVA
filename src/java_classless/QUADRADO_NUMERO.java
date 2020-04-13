package java_classless;

import java.util.Scanner;

public class QUADRADO_NUMERO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá, "+nome+". \nInsira abaixo o valor que deseja para retornar o quadrado");

        System.out.print("\nValor: ");
        int valor = scanner.nextInt();

        System.out.println("O quadrado desse número é "+ valor * valor);
    }
}
