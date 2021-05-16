package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDao<U, E> {

    void create(U entidade);

    U findById(E id) throws EntityNotFoundException;

    void update(U entidade);

    void delete(E id) throws EntityNotFoundException;

    void commit() throws CommitException;
}
