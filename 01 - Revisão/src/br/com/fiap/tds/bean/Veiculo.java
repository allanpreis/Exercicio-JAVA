package br.com.fiap.tds.bean;

import javax.swing.*;

public class Veiculo {

    //Modificadores de acesso:
    //private -> somente a própria classe;
    //public -> todos;
    //protected -> própria classe, classes do mesmo pacote e filhas;
    //default (package) -> própria classe e classes do mesmo pacote;

    private int ano;

    private String modelo;

    private float peso;

    private String cor;

    private TipoVeiculo tipo;

    //Tipos primitivos: boolean, char, int, long, float, double, byte, short
    //Valores padrão: boolean = false, números = 0

    //Tipos de referencia (classes): String, Veiculo, Date, Carro...
    //Valores padrão: null;

    //Contrutores -> sem retorno e mesmo nome da classe
    public Veiculo(int ano,String modelo){
        super();
        this.ano = ano;
        this.modelo = modelo;
    }

    public Veiculo(){}

    //Sobrecarga -> mesmo metódo com parâmetros diferentes
    public void andar(){
        JOptionPane.showMessageDialog(null, "Veiculo andando...");
    }

    public void andar(float velocidade){
        JOptionPane.showMessageDialog(null,"Veiculo andando a " + velocidade + "km");
    }

    public void andar(float velocidade, boolean turbo){ JOptionPane.showMessageDialog(null,"Veiculo andando a " + velocidade + "km " + turbo); }

    //Getteres e Setteres
    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
}
