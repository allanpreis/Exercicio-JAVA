package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EnderecoDao;
import br.com.fiap.dao.PadariaDao;
import br.com.fiap.dao.impl.EnderecoDaoImpl;
import br.com.fiap.dao.impl.PadariaDaoImpl;
import br.com.fiap.entity.Endereco;
import br.com.fiap.entity.Padaria;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class CadastroTeste {

	//Cadastrar um endereço e uma padaria relacionados
	public static void main(String[] args) {
		
		//Obter um entity manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Obter o EnderecoDao e PadariaDao
		PadariaDao padocaDao = new PadariaDaoImpl(em);
		EnderecoDao enderecoDao = new EnderecoDaoImpl(em);
		
		//Instanciar um endereco
		Endereco endereco = new Endereco("Av lins de vasconcelos", "1222", "Aclimação");
		
		//Instanciar um padaria com o endereco
		Padaria padoca = new Padaria("Bispo", 10000.0, "Seg. a Sex. 6h - 22h", endereco);
		
		//Cadastrar um endereco 
		//enderecoDao.create(endereco);
		
		//Cadastrar uma padaria
		padocaDao.create(padoca);
		
		//Commit
		try {
			padocaDao.commit();
			System.out.println("Padaria e endereço cadastrados!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		//Fechar
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
	
}
