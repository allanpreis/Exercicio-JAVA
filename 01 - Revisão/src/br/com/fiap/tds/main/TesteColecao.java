package br.com.fiap.tds.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.tds.bean.Carro;

import javax.swing.*;

public class TesteColecao {

    public static void main (String[] args){
        //Instanciar uma lista de Carro
        List<Carro> lista = new ArrayList<>();

        //Adicionar dois carros na lista
        lista.add(new Carro(2015, "Fusion"));

        Carro carro = new Carro(2010,"c180");
        lista.add(carro);

        //Exibir os carros da lista
        for (int i = 0; i < lista.size(); i++){
            JOptionPane.showMessageDialog(null,lista.get(i).getAno() + " " + lista.get(i).getModelo());
        }

        //foreach
        for (Carro c : lista){
            JOptionPane.showMessageDialog(null, c.getAno() + " " + c.getModelo());
        }

        lista.forEach(c -> JOptionPane.showMessageDialog(null,c.getAno() + " " + c.getModelo()));

        //Mapa
        Map<String,Carro> mapa = new HashMap<String, Carro>();

        //Adicionar 2 carros no mapa
        mapa.put("v1", new Carro(2019, "Audi A5 S-line"));
        mapa.put("v2", new Carro(2021, "Porshe Panamera"));

        //Recuperar o carro com a chave "v1"
        carro = mapa.get("v1");

        JOptionPane.showMessageDialog(null, carro.getAno() + " " + carro.getModelo());

    }
}
