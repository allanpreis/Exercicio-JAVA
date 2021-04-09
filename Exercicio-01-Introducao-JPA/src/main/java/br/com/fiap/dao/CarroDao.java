package br.com.fiap.dao;

import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Veiculo;

import java.util.List;

public interface CarroDao {

    void cadastrarVeiculo(Veiculo veiculo);

    void cadastrarMotorista(Motorista motorista);

    List<Veiculo> listarVeiculo();

    List<Motorista> listarMotorista();
}
