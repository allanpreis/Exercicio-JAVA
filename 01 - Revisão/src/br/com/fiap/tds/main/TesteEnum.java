package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.TipoVeiculo;
import br.com.fiap.tds.bean.Veiculo;

import javax.swing.*;

public class TesteEnum {

    public static void main(String[] args) {

        //Instanciar um veiculo
        Veiculo veiculo = new Veiculo(2021, "Honda Civic");

        //Atribuir um tipo de veiculo
        veiculo.setTipo(TipoVeiculo.TERRESTRE);

        //Validar se o veiculo é do tipo terrestre
        if (veiculo.getTipo().equals(TipoVeiculo.TERRESTRE)){
            JOptionPane.showMessageDialog(null,"Veiculo do tipo Terrestre");
        }

        //Exibir o tipo de veiculo
        JOptionPane.showMessageDialog(null, "Tipo de veiculo: " + veiculo.getTipo());

    }
}
