package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.excecoes.exception.Excecao;

public class TesteConexao4 {
	public static void main(String[] args) {
		Connection fiap = null;
		PreparedStatement estrutura = null;
		ResultSet resultado = null;
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85619", "010101");
			estrutura = fiap.prepareStatement("SELECT * FROM TB_CLIENTE WHERE ID=? AND NOME=?");
			
			String nome = JOptionPane.showInputDialog("Digite o nome: ");
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
			estrutura.setInt(1, id);
			estrutura.setString(2, nome);
			resultado = estrutura.executeQuery();
			if(resultado.next()) { 
				System.out.println(nome + " você está autorizado!" );
			} else {
				System.out.println(nome + " seus dados não conferem!!!");
			}
		}catch(Exception e) {
			System.out.println(Excecao.tratatExcecao(e));
			e.printStackTrace();
		}finally {
			try {
			fiap.close();
			}catch(Exception e) {
				System.out.println(Excecao.tratatExcecao(e));
		}
	  }
	}
}
