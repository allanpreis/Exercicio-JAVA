package br.com.fiap.tds.dao;

import br.com.fiap.tds.bean.Carro;
import java.util.List;

public interface CarroDao {

    void cadastrar(Carro carro);

    List<Carro> listar();
    

}
