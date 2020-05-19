package java_class.Livro;

public class aplicacaoLivro {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTituloOriginal("The Lord of the Rings: The Fellowship of the Ring");
        livro.setTituloPt("Senhor dos Anéis: A Sociedade do Anel");
        livro.setAutor("J.R.R. Tolkien");
        livro.setAnoPublicacao(1954);
        livro.setQuantidadeDePaginas(576);
        livro.setIsbn("978-8595084759");
        livro.setEdicao("Edição: 1");

        Livro livro1 = new Livro();
        livro1.setTituloOriginal("Game of Thrones: A Song of Ice and Fire");
        livro1.setTituloPt("Guerra dos Tronos: A Crônica de Gelo e Fogo");
        livro1.setAutor("George R. R. Martin");
        livro1.setAnoPublicacao(2019);
        livro1.setQuantidadeDePaginas(600);
        livro1.setIsbn("978-8556510785");
        livro1.setEdicao("Edição: 1");

        System.out.println(livro.pegarTitulos());
        System.out.println(livro1.pegarTitulos());

    }
}
