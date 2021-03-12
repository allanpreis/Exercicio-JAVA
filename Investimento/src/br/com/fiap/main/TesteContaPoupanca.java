package br.com.fiap.main;

import br.com.fiap.bean.ContaPoupanca;

public class TesteContaPoupanca {

    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();

        cp.depositar(10);

        float x = ContaPoupanca.RENDIMENTO;
        ContaPoupanca.teste();
    }
}
