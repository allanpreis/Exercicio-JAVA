import java.util.Scanner;

public class PRESTACAO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+".\nInforme abaixo o valor do boleto, o percentural de juros e\no número de dias de atraso e saberá quanto é o novo valor a ser pago");

        System.out.print("\nValor do boleto: R$");
        float boleto = scanner.nextFloat();

        System.out.print("Percentual de Juros: ");
        float juros = scanner.nextFloat();

        System.out.print("Dias de atraso: ");
        int dias = scanner.nextInt();

        float vf = boleto+(boleto*(juros/100))*dias;

        System.out.printf("\nO novo valor a ser pago do boleto será R$%.2f",(vf));
    }
}
