package br.com.fiap.exception;

import javax.swing.*;

public class SaldoInsuficienteException  extends Exception{
    public SaldoInsuficienteException(){
        JOptionPane.showMessageDialog(null,"Saldo insuficiente!", "Erro", 0);
    }

    public SaldoInsuficienteException(String msg){
        super(msg);
    }

    public SaldoInsuficienteException(double saldo){
        super("Saldo insuficente, limite máximo de " + saldo);
    }
}
