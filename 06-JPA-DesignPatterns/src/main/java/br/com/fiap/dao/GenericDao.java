package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;

import javax.persistence.EntityNotFoundException;

//GenericDao<Cliente, Produto>

public interface GenericDao <E, K>{

    void create(E entidade);

    E findById(K id) throws EntityNotFoundException, br.com.fiap.exception.EntityNotFoundException;

    void update(E entidade);

    void delete(K id) throws EntityNotFoundException, br.com.fiap.exception.EntityNotFoundException;

    void commit() throws CommitException;
}
