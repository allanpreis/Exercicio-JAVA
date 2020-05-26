package exercicio.banco;

import exercicio.banco.ContaBancaria;

import java.io.Serializable;

public class ContaPoupanca extends ContaBancaria implements Serializable {

    private double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public void sacar(double valor){
        this.saldo = saldo - valor;
    }

    public void atualizarSaldo(double valor){
        this.saldo = saldo + (saldo*(0.6/100));
    }
}
