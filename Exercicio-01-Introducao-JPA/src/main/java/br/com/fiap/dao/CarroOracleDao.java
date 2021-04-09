package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Veiculo;

import javax.swing.*;
import java.util.List;

public class CarroOracleDao implements CarroDao{

    @Override
    public void cadastrarVeiculo(Veiculo veiculo){
        JOptionPane.showMessageDialog(null, "Cadastrando veiculo...", "Aguarde", 1);
    }

    @Override
    public void cadastrarMotorista(Motorista motorista){
        JOptionPane.showMessageDialog(null,"Cadastrando motorista...", "Aguarde", 1);
    }

    public List<Veiculo> listarVeiculo(){
        JOptionPane.showMessageDialog(null, "Listando veiculos...");
        return null;
    }

    public List<Motorista> listarMotorista(){
        JOptionPane.showMessageDialog(null, "Listando motoristas...");
        return null;
    }
}
