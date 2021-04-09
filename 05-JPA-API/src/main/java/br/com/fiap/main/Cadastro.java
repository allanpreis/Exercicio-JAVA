package br.com.fiap.main;

import br.com.fiap.entity.Filme;
import br.com.fiap.entity.GeneroFilme;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cadastro {

    public static void main(String[] args) {
        //Obter uma fábrica e um entity manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Instanciar um Filme sem o código (Estado novo - não gerenciado)
        Filme filme = new Filme("Back To The Future", new GregorianCalendar(1985, Calendar.JANUARY,7),
                                                GeneroFilme.FICCAO, "O cara que volta no tempo", false);

        //Cadastro -> passa o filme para o entity manager gerenciar
        em.persist(filme);

        //começar uma transação
        em.getTransaction().begin();
        //commit
        em.getTransaction().commit();

        JOptionPane.showMessageDialog(null, "Filme Cadastrado!");

        //Fechar
        em.close();
        fabrica.close();

    }
}
