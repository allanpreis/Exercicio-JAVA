import java.util.Scanner;

public class QUADRADO_NUMERO2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá "+nome+". \nInsira 3 valores para serem somados e depois ter o quadrado desses números");

        System.out.print("\n1º valor:");
        int n1 = scanner.nextInt();

        System.out.print("2º valor:");
        int n2 = scanner.nextInt();

        System.out.print("3º valor:");
        int n3 = scanner.nextInt();
        int resultado = n1 + n2 + n3;

        System.out.println("A soma desses valores é "+resultado+ " e o quadrado da some é "+ resultado * resultado);

    }
}
