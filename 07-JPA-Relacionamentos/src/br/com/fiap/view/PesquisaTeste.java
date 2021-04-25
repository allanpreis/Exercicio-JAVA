package br.com.fiap.view;

import br.com.fiap.dao.PadariaDao;
import br.com.fiap.dao.impl.PadariaDaoImpl;
import br.com.fiap.entity.Padaria;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.swing.*;

public class PesquisaTeste {

    public static void main(String[] args) {

        //Pequisa uma padaria
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        //Obter uma padaria
        PadariaDao dao = new PadariaDaoImpl(em);
        try{
            //Pequisar uma padaria por código
            Padaria padoca = dao.findById(1);

            //Exibir o nome da padaria
            JOptionPane.showMessageDialog(null, padoca.getNome());

            //Exibir o bairro da padaria
            JOptionPane.showMessageDialog(null, padoca.getEndereco().getBairro());
        }catch (EntityNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Fechar
        em.close();
    }
}
