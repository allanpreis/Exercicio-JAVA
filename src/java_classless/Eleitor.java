package java_classless;

import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome");
        String nome = scanner.next();

        System.out.println("Insira sua idade");
        int idade = scanner.nextInt();
        if (idade < 16) {
            System.out.println("Olá " + nome + ", você não pode pode votar devido sua idade");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Escolha um canditato para votar");
            System.out.println("[1] Fulano\n[2] Ciclano \n[3] Bill Gates");
            int opcao = scanner.nextInt();
            while (opcao != 4) {
                if (opcao == 1) {
                    System.out.println("Obrigado " + nome + " por votar em Fulano");
                    break;
                } else if (opcao == 2) {
                    System.out.println("Obrigado " + nome + " por votar em Ciclano");
                    break;
                } else if (opcao == 3) {
                    System.out.println("Obrigado " + nome + " por votar em Bill Gates");
                    break;
                } else {
                    System.out.println(nome + "vocÊ precisa votar em alguém");
                    break;
                }
            }
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Você é um eleitor facultativo, deseja votar? [S/N]");
            String escolha = scanner.next();
            if (escolha.equals("S")){
                System.out.println("Escolha um canditato para votar");
                System.out.println("[1] Fulano\n[2] Ciclano \n[3] Bill Gates");
                int opcao = scanner.nextInt();
                while (opcao != 4) {
                    if (opcao == 1) {
                        System.out.println("Obrigado " + nome + " por votar em Fulano");
                        break;
                    } else if (opcao == 2) {
                        System.out.println("Obrigado " + nome + " por votar em Ciclano");
                        break;
                    } else if (opcao == 3) {
                        System.out.println("Obrigado " + nome + " por votar em Bill Gates");
                        break;
                    } else {
                        System.out.println(nome + "você precisa votar em alguém");
                        break;
                    }

                }
            } else {
                System.out.println("Por ter escolhido não votar você está liberado, obrigado por consultar nossos serviços");
            }
        }
    }
}