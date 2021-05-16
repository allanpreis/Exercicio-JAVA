package br.com.fiap.main;

import br.com.fiap.dao.EstabelecimentoDao;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.dao.impl.EstabelecimentoDaoImpl;
import br.com.fiap.dao.impl.UsuarioDaoImpl;
import br.com.fiap.entity.*;
import br.com.fiap.exception.EntityNotFoundException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CadastroDao {

    private static EstabelecimentoDao estabelecimentoDao;
    private static UsuarioDao usuarioDao;
    private Estabelecimento estabelecimento;
    private Usuario usuario;

    @BeforeAll
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
        EntityManager em = fabrica.createEntityManager();

        EstabelecimentoDao daoEst = new EstabelecimentoDaoImpl(em);

        Estabelecimento estabelecimento = new Estabelecimento(1,"Mercadinho do Feh", "Fernando Borgatto", 1234567890, Ramo.MERCADINHO, "Rua Clorinda Rinalde Mazzo", 123456789);
        try{
            daoEst.create(estabelecimento);
            daoEst.commit();
            JOptionPane.showMessageDialog(null,"Estabelecimento cadastrado com sucesso!", "Registro de Estabelecimento", 1);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Registro de Estabelecimento", 1);
        }

        UsuarioDao daoUser = new UsuarioDaoImpl(em);

        Usuario usuario = new Usuario("fernando@gmail.com", "fehborgato", "123456");
        try{
            daoUser.create(usuario);
            daoUser.commit();
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!", "Inscreva-se", 1);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Inscreva-se", 1);
        }

        Produto produto = new Produto(1, "Pepsi", Categoria.BEBIDAS, "Bebida a base de soda", 20, 5.99 ,new GregorianCalendar(2021, Calendar.MAY, 20),
                new GregorianCalendar(2021, Calendar.APRIL, 10), new GregorianCalendar(2021, Calendar.APRIL, 15));
        try{
            em.persist(produto);
            em.getTransaction().begin();
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!", "Estoque", 1);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Estoque", 1);
        }
        assertNotEquals(0, estabelecimento.getCodigo());
        assertNotEquals(0, usuario.getCodigo());

        estabelecimento.addProduto(produto);
        usuario.addEstabelecimento(estabelecimento);

        em.close();
        fabrica.close();

    }



}
