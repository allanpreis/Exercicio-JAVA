package java_class.ContaBancaria;

import javax.swing.*;
import java.io.Serializable;

public class ContaBancaria implements Serializable {

    private double saldo;
    private Titular titular;
    private int agencia;
    private String numeroConta;

    public double depositar(double valor){
        if (valor <= 0){
            JOptionPane.showMessageDialog(null,"Valor de depósito inválido!","Erro", 0);
        } else {
            saldo = saldo + valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        }
        return getSaldo();
    }

    public double sacar(double valor){
        if (valor > saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente!", "Erro", 0);
        } else {
            saldo = saldo - valor;
            JOptionPane.showMessageDialog(null, "Saque realizado!");
        }
        return getSaldo();
    }

    public void detalhesDaConta(){
        JOptionPane.showMessageDialog(null,"Saldo: "+saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
