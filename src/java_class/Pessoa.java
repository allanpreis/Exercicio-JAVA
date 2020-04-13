package java_class;

import java.time.LocalDate;

public class Pessoa {

    // Atributos INICIO

    private String nome;
    private LocalDate dataNascimento;
    private String nacionalidade;

    // Atributos FIM

    // Métodos INICIO

    public void trabalhar(){
        System.out.println(nome +" está trabalhando");
    }

    public void definirNome(String novoNome){
        nome = novoNome;
    }

    // Método FIM
}
