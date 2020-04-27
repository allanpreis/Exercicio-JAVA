package java_class.caixa_eletronico;

import java.time.LocalDate;

public class AplicacaoBancaria {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Allan");
        aluno.setCpf("318.455.278-01");
        LocalDate dataNascimento = LocalDate.of(2001,01,01);

        Conta conta = new Conta();
        conta.setSaldo(1000);
        conta.setNumeroConta("85619");
        conta.setSenha("57122426");
        conta.setTitular(aluno);

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.setContaAtiva(conta);

        caixa.sacar(1220);

        caixa.sacar(800);

        caixa.depositar(500);

        caixa.imprimirDadosConta();
    }
}
