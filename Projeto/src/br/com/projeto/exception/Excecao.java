package br.com.projeto.exception;

import java.sql.SQLException;

public class Excecao extends Exception {

	public static String tratatExcecao(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		}else if (e instanceof NumberFormatException) {
			return "Número inválido";
		}else if (e instanceof SQLException) {
            return "Erro no banco de dados";
        }
        else {
            return "Exceção desconhecida!!!";
        }
	}
}
