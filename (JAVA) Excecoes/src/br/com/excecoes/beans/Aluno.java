package br.com.excecoes.beans;

/*
 * Regras para um Beans/JavaBeans/DTO (Design Pattern Data Transfer Objetc)/TO/Model/Modelo
 * 
 * 1° TODOS os atributos devem ser privados
 * 2° Construtor com parametros e um construtor sem parametros
 * 3° Todo atributo deve ter um Getter e um Setter
 * 
 */

public class Aluno {
	private int rm;
	private String nome;
	
	public Aluno(int rm, String nome) {
		super();
		this.rm = rm;
		this.nome = nome;
	}
	public Aluno() {
		super();
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
