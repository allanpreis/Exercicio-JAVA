package br.com.fiap.bean;

import br.com.fiap.bean.Conta;
import br.com.fiap.exception.SaldoInsuficienteException;

import javax.swing.*;
import java.util.Calendar;

public class ContaCorrente extends Conta{

    private TipoConta tipo;

    @Override
    public void depositar(double valor) {
        if (valor <= 0){
            JOptionPane.showMessageDialog(null,"Valor de depósito inválido!","Erro", 0);
        } else {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!", "Sucesso", 1);
        }
    }

    @Override
    public void retirar(double valor) throws SaldoInsuficienteException{
        //Validar se a conta é comum e o saldo fica negativo depois do saque
        if (tipo == TipoConta.COMUM && valor > saldo) {
            throw new SaldoInsuficienteException(saldo);
        }
        saldo = saldo - valor;
        JOptionPane.showMessageDialog(null, "Saque realizado!", "Sucesso", 1);
    }

    //Contrutor de Conta
    public ContaCorrente(){}

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipo = tipo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }
}
