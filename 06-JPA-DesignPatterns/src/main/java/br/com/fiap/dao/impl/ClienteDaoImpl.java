package br.com.fiap.dao.impl;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

import javax.persistence.EntityManager;

public class ClienteDaoImpl extends GenericDaoImpl<Cliente, Integer> implements ClienteDao {

    public ClienteDaoImpl(EntityManager em) {
        super(em);
    }
}
