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
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Teste {

    private static EstabelecimentoDao estabelecimentoDao;
    private static UsuarioDao usuarioDao;
    private Estabelecimento estabelecimento;
    private Usuario usuario;

    @BeforeAll //executa antes todos os testes
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        estabelecimentoDao = new EstabelecimentoDaoImpl(em);
        usuarioDao = new UsuarioDaoImpl(em);
    }

    @BeforeEach
    void cadastrar(){
        estabelecimento = new Estabelecimento(2,"Mercadinho do Feh", "Fernando Borgatto", 1234567890, Ramo.MERCADINHO, "Rua Clorinda Rinalde Mazzo", 123456789);
        usuario = new Usuario("fernando@gmail.com", "fehborgato", "123456");
        Produto produto = new Produto(2, "Pepsi", Categoria.BEBIDAS, "Bebida a base de soda", 20, 5.99 ,new GregorianCalendar(2021, Calendar.MAY, 20),
                new GregorianCalendar(2021, Calendar.APRIL, 10), new GregorianCalendar(2021, Calendar.APRIL, 15));

        estabelecimento.addProduto(produto);
        usuario.addEstabelecimento(estabelecimento);

        try {
            // timeDao.create(time);
            usuarioDao.create(usuario);
            usuarioDao.commit();
        } catch (Exception e) {
            e.printStackTrace();
            fail(("Errou"));
        }
        assertNotEquals(0, estabelecimento.getCodigo());
        assertNotEquals(0, usuario.getCodigo());

    }

    @Test
    void readTest() {
        try {
            Usuario busca = usuarioDao.findById(usuario.getCodigo());
        } catch (Exception | EntityNotFoundException e) {
            e.printStackTrace();
            fail("Errou");
        }
    }
}
