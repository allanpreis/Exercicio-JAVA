package br.com.fiap.main;

import br.com.fiap.entity.Filme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Remocao {

    public static void main(String[] args) {
        //Obter um entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Pesquisar um filme
        Filme filme = em.find(Filme.class, 1);

        //Remover o filme
        em.remove(filme);

        //Commit
        em.getTransaction().begin();
        em.getTransaction().commit();

        //Fechar
        em.close();
        fabrica.close();
    }
}
