package br.com.fiap.main;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteInterface {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2856,318949, Calendar.getInstance(),5000, TipoConta.COMUM);

        ContaPoupanca cp = new ContaPoupanca(2856, 318949, new GregorianCalendar(2020, Calendar.JANUARY,20), 3000,1);

        try {
            cc.retirar(500);
        } catch (SaldoInsuficienteException e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Erro", 0);
        }
    }
}
