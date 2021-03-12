package br.com.fiap.tds.dao;

import br.com.fiap.tds.bean.Carro;

import javax.swing.*;
import java.util.List;

public class CarroMySqlDao implements CarroDao{

    @Override
    public void cadastrar(Carro carro) {
        JOptionPane.showMessageDialog(null, "Cadastrando no mysql");
    }

    @Override
    public List<Carro> listar() {
        JOptionPane.showMessageDialog(null, "Listando no mysql");
        return null;
    }
}
