package br.com.fiap.main;

import br.com.fiap.entity.Filme;
import br.com.fiap.entity.GeneroFilme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static br.com.fiap.entity.GeneroFilme.FICCAO;

public class Atualizacao {

    public static void main(String[] args) {
        //Obter a fábrica e o entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Instanciar um filme com um código (Estado detached - não gerenciado)
        Filme filme = new Filme(1, "Back to The Future 2", new GregorianCalendar(1990, Calendar.JANUARY, 10),
                GeneroFilme.FICCAO, "Top", true);

        em.merge(filme);

        em.getTransaction().begin();
        em.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso!");

        //Fechar
        em.close();
        fabrica.close();

    }
}
