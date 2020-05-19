package java_classless;

import java.util.Scanner;

public class onibus {
    // vetores usando true e false
    private static boolean[] corredor = new boolean[24];
    private static boolean[] janela = new boolean[24];
    private static Scanner scan = new Scanner(System.in);
    private static int opcao;

    public static void main(String[] args) {

        // loop infinito com o menu, até que seja escolhida a opção sair
        while (true) {
            System.out.println("1. Vender Passagem");
            System.out.println("2. Mostrar mapa de ocupação do ônibus");
            System.out.println("3. Encerrar");

            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    venderPassagem();
                    break;
                case 2:
                    mapa();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    // mostra o mapa de ocupação
    private static void mapa() {
        System.out.println("Corredor\tjanela");
        for (int i = 0; i < janela.length; i++) {
            if (janela[i] == true) {
                System.out.print((i + 1) + " - Ocupada\t");
            } else {
                System.out.print((i + 1) + " - Livre\t");
            }

            if (corredor[i] == true) {
                System.out.print((i + 1) + " - Ocupada\t");
            } else {
                System.out.print((i + 1) + " - Livre\t");
            }

            System.out.println();
        }

    }

    // metodo vender passagem
    private static void venderPassagem() {
        // verifica se o onibus esta lotado
        if (lotado() == false) {
            String opcao;
            int numero;

            // limpa o buffer
            scan.nextLine();

            System.out.println("janela ou corredor");
            opcao = scan.nextLine();

            System.out.println("Número da poltrona (1 à 24) localização "
                    + opcao + ": ");
            numero = scan.nextInt();

            if (opcao.equals("j")) {
                if (janela[numero - 1] == false) {
                    janela[numero - 1] = true;// marca lugar como ocupado
                    System.out.println("Venda efetivada");
                } else {
                    System.out.println("Poltrona já ocupada");
                }
            } else if (opcao.equals("c")) {
                if (corredor[numero - 1] == false) {
                    corredor[numero - 1] = true;// marca lugar como ocupado
                    System.out.println("Venda efetivada");
                } else {
                    System.out.println("Poltrona já ocupada");
                }
            } else {
                System.out.println("Opção invalida");
            }
        } else {
            System.out.println("Ônibus lotado");
        }
    }

    // verifica se o onibus esta lotado
    private static boolean lotado() {

        for (int i = 0; i < corredor.length; i++) {
            if (corredor[i] == false || janela[i] == false) {
                return false;
            }
        }
        return true;
    }
}