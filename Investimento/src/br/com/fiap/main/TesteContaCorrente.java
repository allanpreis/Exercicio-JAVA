package br.com.fiap.main;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

import java.util.Calendar;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.setAgencia(2856);
        cc.setNumero(318949);
        cc.setTipo(TipoConta.COMUM);
        cc.setDataAbertura(Calendar.getInstance());
        cc.setSaldo(5000);

        cc.depositar(10);

    }
}
