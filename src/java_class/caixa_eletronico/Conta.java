package java_class.caixa_eletronico;

import java.util.Random;

public class Conta {

    Random numero = new Random();
    private Aluno titular;
    private float saldo;
    private int numeroConta;
    private String senha;

    public Aluno getTitular() {
        return titular;
    }

    public void setTitular(Aluno titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Conta(){
        this.numeroConta = numero.nextInt(99999);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
