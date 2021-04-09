package br.com.fiap.main;

import br.com.fiap.dao.FilmeDao;
import br.com.fiap.dao.impl.FilmeDaoImpl;
import br.com.fiap.entity.Filme;
import br.com.fiap.entity.GeneroFilme;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.FilmeNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FilmeDaoTeste {

    public static void main(String[] args) {
        //Obter o Entitu Maneger
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        //Obter o FilmeDao
        FilmeDao dao = new FilmeDaoImpl(em);

        //Cadastrar
        Filme filme = new Filme (2,"Justice League Synder Cut", new GregorianCalendar(2021, Calendar.MARCH,7),
                GeneroFilme.FICCAO, "Liga da justiça melhorada", true);
        try{
            dao.create(filme);
            dao.commit();
            JOptionPane.showMessageDialog(null,"Filme cadastrado com sucesso!", "Cadastro", 1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Cadastro", 1);
        }

        //Pesquisar e exibir os dados
        try{
            filme = dao.findById(1);
            JOptionPane.showMessageDialog(null, filme.getNome(), "Pesquisar", 1);
        }catch (FilmeNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Pesquisar", 1);
        }

        //Atualizar
        filme = new Filme(1,"Mulher Maravilha", Calendar.getInstance(), GeneroFilme.ACAO, "Super mulher", false);
        try{
            dao.update(filme);
            dao.commit();
            JOptionPane.showMessageDialog(null,"Filme atualizado com sucesso!", "Atualizar", 1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atualizar", 1);
        }

        //Remover
        try{
            dao.remove(2);
            dao.commit();
            JOptionPane.showMessageDialog(null,"Filme removido com sucesso!", "Remover", 1);
        }catch (FilmeNotFoundException | CommitException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Remover", 1);
        }


        //Fechar
        em.close();
        fabrica.close();
    }
}
