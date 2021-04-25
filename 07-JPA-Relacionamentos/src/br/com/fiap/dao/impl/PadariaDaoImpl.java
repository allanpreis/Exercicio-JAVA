package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Padaria;
import br.com.fiap.dao.PadariaDao;

public class PadariaDaoImpl extends GenericDaoImpl<Padaria, Integer> implements PadariaDao{

	public PadariaDaoImpl(EntityManager em) {
		super(em);
	}

}
