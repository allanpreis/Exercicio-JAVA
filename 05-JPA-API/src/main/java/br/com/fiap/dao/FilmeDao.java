package br.com.fiap.dao;

import br.com.fiap.entity.Filme;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.FilmeNotFoundException;

//Interface -> diminuir o acoplamento (dependência) entre os objetos
//View - Controller (FilmeDao) - DAO - Banco

public interface FilmeDao {

    //Cruid
    void create(Filme filme);

    Filme findById(int id) throws FilmeNotFoundException;

    void update(Filme filme);

    void remove(int id) throws FilmeNotFoundException;

    void commit() throws CommitException;


}
