package java_class.Funcionario;

public class aplicacaoFuncionario {

    public static void main(String[] args) {

        Profissao profissao = new Profissao();
        profissao.setNome("Análista de Sistemas Sênior");

        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(1);
        funcionario.setNome("Allan");
        funcionario.setProfissao(profissao);
        funcionario.setSalario(6689);

        funcionario.exibirDadosFuncionario();

        Funcionario funcionario1 = new Funcionario(2, "João", profissao);
        funcionario1.setSalario(5889);

        funcionario1.exibirDadosFuncionario();

    }
}
