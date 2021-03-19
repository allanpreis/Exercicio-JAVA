package br.com.fiap.tds.view;

import br.com.fiap.tds.annotation.Coluna;
import br.com.fiap.tds.bean.Usuario;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Teste {

    public static void main(String[] args) {
        //Instanciar um usuário
        Usuario user = new Usuario();

        //API de Reflection -> obtem a estrutura da classe
        //Obter o nome da classe
        String nome = user.getClass().getName();
        JOptionPane.showMessageDialog(null, nome, "Classes", 1);

        //Obter os métodos da classe
        Method[] metodos = user.getClass().getDeclaredMethods();
        for (Method m : metodos) {
            JOptionPane.showMessageDialog(null, m.getName(), "Métodos", 1);
        }

        //Obter os atributos da classe
        Field[] atributos = user.getClass().getDeclaredFields();
        for (Field f : atributos){
            JOptionPane.showMessageDialog(null, f.getName() + " " + f.getType(), "Atributos", 1);
            //Recuperar a anotação @Coluna
            Coluna anotacao = f.getAnnotation(Coluna.class);
            //Exibir os parâmetros da @Coluna
            JOptionPane.showMessageDialog(null, "Coluna: " + anotacao.nome() + "\nPk: " + anotacao.pk() + "\nTamanho: " + anotacao.tamanho(), "Anotação", 1);
        }



    }
}
