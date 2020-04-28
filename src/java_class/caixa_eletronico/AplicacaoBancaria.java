package java_class.caixa_eletronico;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class AplicacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao FIAP BANk");
        System.out.println("Por favor faço o cadastro de sua conta abaixo");

        System.out.print("Insira seu nome: ");
        //nextLine para nome composto
        String nome = scanner.nextLine();

        //Receber a data de nascimento
        System.out.print("\nInsira o dia em que nasceu: ");
        int dia = scanner.nextInt();
        System.out.print("\nInsira o mês em que nasceu: ");
        int mes = scanner.nextInt();
        System.out.print("\nInsira o ano em que nasceu: ");
        int ano = scanner.nextInt();

        //Tratando a data de nascimento informada
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        if (Period.between(dataNascimento, LocalDate.now()).getYears() < 18) {
            System.out.println("As políticas do FIAP BANK impede que alunos menores de idade abram uma conta");
            return;
        }

        System.out.print("\nInsira seu CPF: ");
        String cpf = scanner.next();

        System.out.print("\nInsira sua senha: ");
        String senha = scanner.next();

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setDataNascimento(dataNascimento);

        Conta conta = new Conta();
        conta.setTitular(aluno);
        conta.setSaldo(0);
        conta.setSenha(senha);
        conta.getNumeroConta();

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.setContaAtiva(conta);

        System.out.println("Iniciando...");
        String senhaDigitada;
        do {
            System.out.print("Senha: ");
            senhaDigitada = scanner.next();
        } while (!caixa.senhaCorreta(senhaDigitada));

        do {
            System.out.println("Opções: ");
            System.out.println("1 - Consultar Extrato");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            switch (scanner.nextInt()){
                case 1:
                    caixa.imprimirDadosConta();
                    break;
                case 2:
                    System.out.print("Quanto deseja depositar: R$");
                    float deposito = scanner.nextFloat();
                    caixa.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Quando deseja sacar: R$");
                    float saque = scanner.nextFloat();
                    caixa.sacar(saque);
                    break;
                case 4:
                    caixa.sair();
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
            }
        } while (caixa.ativo());
    }
}
