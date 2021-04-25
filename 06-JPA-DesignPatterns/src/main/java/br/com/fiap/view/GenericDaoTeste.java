package br.com.fiap.view;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.dao.impl.GenericDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenericDaoTeste {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        //Instancia uma classe anônima
        //Definir uma classe e obter a instância
        GenericDao<Cliente, Integer> dao = new GenericDaoImpl<Cliente, Integer>(em){};

        //Cadastrar
        Cliente cliente = new Cliente(1,"Allan", "allan@gmail.com", new GregorianCalendar(2001, Calendar.JANUARY, 1));

        try{
            dao.create(cliente);
            dao.commit();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro", 1);
        } catch (CommitException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Pesquisar
        try{
            cliente = dao.findById(1);
            JOptionPane.showMessageDialog(null, cliente.getNome());
        }catch (EntityNotFoundException | br.com.fiap.exception.EntityNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Atualizar
        cliente = new Cliente(1, "João", "joao@fiap.com.br", new GregorianCalendar(2001, Calendar.APRIL, 14));

        try{
            dao.update(cliente);
            dao.commit();
        }catch (CommitException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Remover
        try{
            dao.delete(1);
            dao.commit();
            JOptionPane.showMessageDialog(null, "Cliente removido!");
        }catch (CommitException | EntityNotFoundException | br.com.fiap.exception.EntityNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Fechar
        em.close();
        EntityManagerFactorySingleton.getInstance().close();

    }
}
