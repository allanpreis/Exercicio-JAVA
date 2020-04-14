package java_class;

import java.time.LocalDate;

public class Pessoa {

    // Atributos INICIO

    private String nome;
    private int idade;
    private float altura;
    private LocalDate dataNascimento;
    private String telefone;

    // Atributos FIM

    // Métodos INICIO
    public void statusPessoa(){
        System.out.println(getNome()+" tem "+getIdade()+" anos e tem "+getAltura()+"m de altura, que nasceu: "+getDataNascimento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // Método FIM
}
