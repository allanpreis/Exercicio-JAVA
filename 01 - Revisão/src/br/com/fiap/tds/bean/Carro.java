package br.com.fiap.tds.bean;

import javax.swing.*;

public class Carro  extends Veiculo{

    //Contrutor NÃO é herdado
    public Carro(int ano,String modelo){
        super(ano, modelo);
    }

    public Carro(){}

    //Sobrescrita -> o mesmo método da classe Pai na classe Filha
    @Override
    public void andar(){
        JOptionPane.showMessageDialog(null,"Carro andando...");
    }

    public void abrirPorta(){ JOptionPane.showMessageDialog(null,"Porta aberta");}
}
