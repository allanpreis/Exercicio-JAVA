import java.util.Scanner;

public class COTACAO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+".\nInforme quanto está a cotação atual do dolar e quanto possui para saber a conversão");

        System.out.print("\nCotação atual do Dólar: U$");
        float dolar = scanner.nextFloat();

        System.out.print("Quanto tem na carteira: R$");
        float real = scanner.nextFloat();

        float vf = real / dolar;

        System.out.printf("\nA quantia que você possui em dolar ficará U$%.2f", (vf));
    }
}
