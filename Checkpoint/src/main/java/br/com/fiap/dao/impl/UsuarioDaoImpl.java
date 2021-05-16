package br.com.fiap.dao.impl;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entity.Usuario;
import br.com.fiap.exception.EntityNotFoundException;

import javax.persistence.EntityManager;

public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Integer> implements UsuarioDao {
    public UsuarioDaoImpl(EntityManager em){
        super(em);
    }

    @Override
    public Usuario findById(Integer id) throws EntityNotFoundException {
        return null;
    }

    @Override
    public void update(Usuario entidade) {

    }
}
