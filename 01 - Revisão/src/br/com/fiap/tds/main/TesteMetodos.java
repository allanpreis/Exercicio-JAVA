package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Veiculo;

public class TesteMetodos {

    //psvm
    public static void main(String[] args){

        //Instanciar um veiculo
        Veiculo veiculo = new Veiculo();
        //Chamar o método andar() do "veiculo"
        veiculo.andar(90); // Veiculo

        //Intanciar um carro
        Carro carro = new Carro();
        //Chamar o método andar() do "carro"
        carro.andar(120, true); //Carro
        carro.abrirPorta();

        Veiculo v = new Carro();
        v.andar(); // Carro


    }
}
