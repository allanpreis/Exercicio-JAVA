package br.com.fiap.main;

import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cadastro {

    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        Veiculo veiculo = new Veiculo("FTH-7342", "Prata", 2015);
        Motorista motorista = new Motorista("Paulo Reis", new GregorianCalendar(1965, Calendar.OCTOBER,7), Genero.MASCULINO);

        em.persist(veiculo);
        em.persist(motorista);

        em.getTransaction().begin();
        em.getTransaction().commit();

        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        em.close();
        fabrica.close();
    }
}
