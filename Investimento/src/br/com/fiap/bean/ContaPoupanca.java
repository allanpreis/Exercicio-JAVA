package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteException;

import javax.swing.*;
import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

    private float taxa;

    //final:
    //atributo -> não permite alterar o valor
    //método -> não permite a sobrescrita
    //classe -> não permite herança
    //static: define que o método/atributo é de classe e não de objeto
    public static final float RENDIMENTO = 0.04f;

    public static void teste(){}

    @Override
    public void depositar(double valor) {
        if (valor <= 0){
            JOptionPane.showMessageDialog(null,"Valor de depósito inválido!","Erro", 0);
        } else {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!", "Sucesso",1);
        }
    }

    @Override
    public void retirar(double valor) throws SaldoInsuficienteException {
        if(taxa + valor > saldo){
            throw new SaldoInsuficienteException(saldo - taxa);
        }
        saldo -= valor;
        JOptionPane.showMessageDialog(null, "Saque realizado!", "Sucesso", 1);
    }

    @Override
    public double calculaRetornoInvestimento() {
        return 0;
    }

    public ContaPoupanca(){}

    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}
