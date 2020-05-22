package java_class.ContaCorrente;

import javax.swing.*;

public class ContaCorrente {

    private String titular;
    private int agenciaContaCorrente;
    private String numeroContaCorrente;
    private double saldo;

    public double deposito(double valor){
        if (valor <= 0){
            JOptionPane.showMessageDialog(null,"Valor de depósito inválido!","Erro", 0);
        } else {
            saldo = saldo + valor;
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        }
        return getSaldo();
    }

    public double saque(double valor){
        if (valor > saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente!", "Erro", 0);
        } else {
            saldo = saldo - valor;
            JOptionPane.showMessageDialog(null, "Saque realizado!");
        }
        return getSaldo();
    }

    public double getSaldo(){
        return saldo;
    }

    public void exibirSaldo(){
        JOptionPane.showMessageDialog(null, "Olá "+titular+", o seu saldo é: R$"+saldo,"saldo", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgenciaContaCorrente() {
        return agenciaContaCorrente;
    }

    public void setAgenciaContaCorrente(int agenciaContaCorrente) {
        this.agenciaContaCorrente = agenciaContaCorrente;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
