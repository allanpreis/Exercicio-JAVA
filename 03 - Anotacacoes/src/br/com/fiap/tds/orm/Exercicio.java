package br.com.fiap.tds.orm;

import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Usuario;

import javax.swing.*;

public class Exercicio {

    public static void main(String[] args) {
        //Instanciar um Aluno e Usuario
        Aluno aluno = new Aluno();
        Usuario usuario = new Usuario();

        //Instanciar um Orm
        Orm orm = new Orm();

        //Chamar o método pesquisar e exibir o resultado
        JOptionPane.showMessageDialog(null, orm.gerarPesquisa(aluno));
        JOptionPane.showMessageDialog(null, orm.gerarPesquisa(usuario));

    }
}
