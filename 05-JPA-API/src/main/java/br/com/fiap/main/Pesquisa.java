package br.com.fiap.main;

import br.com.fiap.entity.Filme;
import br.com.fiap.entity.GeneroFilme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pesquisa {

    public static void main(String[] args) {
        //Obter uma fábrica e um entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Pequisar o filme de código 1
        //Retornar o objeto gerenciado ou null, caso não encontre
        Filme filme = em.find(Filme.class,1);

        //Exibir o nome do filme
        if (filme != null)
            JOptionPane.showMessageDialog(null, filme.getNome(), "Pesquisa", 1);
        else
            JOptionPane.showMessageDialog(null,"Filme não encotrado");

//        filme.setPremiado(true);
//
//        em.getTransaction().begin();
//        em.getTransaction().commit();

        //Fechar
        em.close();
        fabrica.close();
    }
}
