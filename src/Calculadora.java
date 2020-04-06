import java.util.Scanner;

public class Calculadora {

    
    public int soma(int n1, int n2) {

        return n1 + n2;

    }

    public int subtracao(int n1, int n2) {

        return n1 - n2;

    }

    public int divisao(int n1, int n2) {

        return n1 / n2;

    }

    public int multiplicacao(int n1, int n2) {

        return n1 * n2;

    }


    public static void main(String args[]) {

        Calculadora cal = new Calculadora();

        int opcao = 5;
        int n1;
        int n2;

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha qual operação deseja executar:");
        System.out.println("1 --> Soma");
        System.out.println("2 --> Subtração");
        System.out.println("3 --> Multiplicação");
        System.out.println("4 --> Divisão");

        opcao = input.nextInt();

        while (opcao != 0) {

            if (opcao == 1) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Primeiro valor: ");
                n1 = input1.nextInt();
                System.out.println("Segundo valor: ");
                n2 = input1.nextInt();


                int operacao = cal.soma(n1, n2);

                System.out.println(operacao);
                break;
            }
            if (opcao == 2) {

                Scanner input1 = new Scanner(System.in);

                System.out.println("Primeiro valor: ");
                n1 = input1.nextInt();
                System.out.println("Segundo valor: ");
                n2 = input1.nextInt();
                int operacao = cal.subtracao(n1, n2);

                System.out.println(operacao);

                break;
            }
            if (opcao == 3) {
                Scanner input1 = new Scanner(System.in);

                System.out.println("Primeiro valor: ");
                n1 = input1.nextInt();
                System.out.println("Segundo valor: ");
                n2 = input1.nextInt();
                int operacao = cal.multiplicacao(n1, n2);

                System.out.println(operacao);
                break;
            }
            if (opcao == 4) {
                Scanner input1 = new Scanner(System.in);

                System.out.println("Primeiro valor: ");
                n1 = input1.nextInt();
                System.out.println("Segundo valor: ");
                n2 = input1.nextInt();
                int operacao = cal.divisao(n1, n2);

                System.out.println(operacao);
                break;
            }
        }
    }
}
