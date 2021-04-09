package br.com.fiap.main;

import br.com.fiap.entity.Filme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

public class Refresh {

    //Atualiza o objeto com os valores do banco
    public static void main(String[] args) {
        //Obter a fabrica e o entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Pequisar o filme de código 1
        Filme filme = em.find(Filme.class, 1);

        //Exibir o nome do filme
        JOptionPane.showMessageDialog(null, filme.getNome());

        //Alterar o nome do filme no objeto (setNome)
        filme.setNome("De volta para o Futuro 2");

        //Exibir o nome do filme
        JOptionPane.showMessageDialog(null, filme.getNome());

        //Refresh
        em.refresh(filme);

        //Exibir o nome do filme
        JOptionPane.showMessageDialog(null, filme.getNome());

        //Fechar
        em.close();
        fabrica.close();

    }
}
