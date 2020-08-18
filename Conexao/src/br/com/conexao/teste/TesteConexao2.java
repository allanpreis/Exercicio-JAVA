package br.com.conexao.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.excecoes.exception.Excecao;

public class TesteConexao2 {
	public static void main(String[] args) {
		Connection fiap = null;
		Statement estrutura = null;
		ResultSet resultado = null;
		try {
			fiap = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm85619", "010101");
			estrutura = fiap.createStatement();
			
			String nome = JOptionPane.showInputDialog("Digite o nome: ");
			
			resultado = estrutura.executeQuery("select * from tb_cliente where nome LIKE '"+nome+"%'");
			while(resultado.next()) {
			System.out.println("Nome: " + resultado.getString("nome"));
			System.out.println("Código: " + resultado.getString("id"));
			System.out.println("Estrelas: " + resultado.getString("estrelas"));
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
