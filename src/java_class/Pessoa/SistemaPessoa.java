package java_class.Pessoa;

import java.time.LocalDate;

public class SistemaPessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa ();
        pessoa.setNome("Allan");
        pessoa.setAltura(1.71f);
        pessoa.setIdade(19);
        pessoa.setDataNascimento(LocalDate.of(2001, 01, 01));
        pessoa.statusPessoa();

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Letícia");
        segundaPessoa.setAltura(1.61f);
        segundaPessoa.setIdade(19);
        segundaPessoa.setDataNascimento(LocalDate.of(2001,01,18));
        segundaPessoa.statusPessoa();

        Pessoa terceiraPessoa = new Pessoa();
        terceiraPessoa.setNome("Paulo");
        terceiraPessoa.setAltura(1.83f);
        terceiraPessoa.setIdade(53);
        terceiraPessoa.setDataNascimento(LocalDate.of(1965, 10, 7));
        terceiraPessoa.statusPessoa();

    }
}
