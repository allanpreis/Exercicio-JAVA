package exercicio.banco;

import exercicio.banco.exceptions.SaldoInsuficienteException;

import java.io.Serializable;

public class ContaBancaria implements Serializable {

    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}