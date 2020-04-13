import java.util.Scanner;

public class PROGRAMA_CALCULOS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+".\nInforme 4 valores para que o 1º seja multiplicado pelo 3º e o 2º somado pelo 4º");

        System.out.print("\n1º número: ");
        int n1 = scanner.nextInt();

        System.out.print("2º número: ");
        int n2 = scanner.nextInt();

        System.out.print("3º número: ");
        int n3 = scanner.nextInt();

        System.out.print("4º número:");
        int n4 = scanner.nextInt();

        int multiplicacao = n1 * n3;
        int soma = n2 + n3;

        System.out.println("\nO resultado da multiplicação é "+multiplicacao+" e a soma é "+soma);
    }

}
