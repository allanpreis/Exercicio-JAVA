package br.com.excecoes.teste;

import javax.swing.JOptionPane;

import br.com.excecoes.beans.Aluno;
import br.com.excecoes.exception.Excecao;
import br.com.excecoes.tela.Magica;

public class TesteExcecao {
		
	public static void main(String[] args) {
		
		try {
			int numero = Magica.i("Digite um número");
			JOptionPane.showMessageDialog(null, numero);
			
			Aluno objeto = new Aluno();
			objeto.setNome(Magica.s("Nome: "));
			objeto.setRm(Magica.i("Digite RM: "));
			JOptionPane.showMessageDialog(null, objeto.getNome().length());
			
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, Excecao.tratatExcecao(e));
		
		}finally {
			JOptionPane.showMessageDialog(null, "Até logo");
		}
		
		
	}//fechando o main
}//fechando a classe
