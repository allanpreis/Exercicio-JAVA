package br.com.projeto.beans;

public class Colaborador extends Pessoa {
	
	private String nome;
	private String nivel;
	private double salario;
	private int id;
	
	
	
		
	public Colaborador(String fone, String email, String nome, String nivel, double salario, int id) {
		super(fone, email);
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.id = id;
	}


	public Colaborador() {
		super();
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
