import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {


        //            FOR --> Quando necessitar de x interações
        //contagem de 0 a 9
        for (int i = 0; i < 10; i++){
            System.out.println("Número "+i);
        }

        //contagem de 0 a 10
        for (int j = 0; j <= 10; j++) {
            System.out.println("\nNúmero "+j);
        }


        //         FOR EACH --> Quando quiser e iterar pelos itens da Collentions
        List<String> lisraDePalavras = new ArrayList<>();
        lisraDePalavras.add("Allan");
        lisraDePalavras.add("Reis");

        for(String palavra: lisraDePalavras){
            System.out.println("A palavra é "+palavra);
        }


        //          WHILE  --> Quando tiver uma condição variável (mais flexível)
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 3){
            System.out.println("Escolha a opcão: ");
            System.out.println("Opcao 1: Votacao");
            System.out.println("Opcao 2: Cadastro");
            System.out.println("Opcao 3: Sair");
            opcao = scanner.nextInt();
        }

        //        DO WHILE  --> Executa pelo menos uma vez
        int numero = 100;
        do {
            System.out.println("numero "+numero);
            numero = numero + 1;
        } while (numero < 10);
    }

}
