package java_class.Livro;

public class Livro {

    private String isbn;
    private String tituloOriginal;
    private String tituloPt;
    private String autor;
    private int quantidadeDePaginas;
    private String edicao;
    private int anoPublicacao;

    public String pegarTitulos(){
        return "TÍTULO: "
                .concat(getTituloOriginal())
                .concat(", TÍTULO EM PORTGUÊS: ")
                .concat(getTituloPt());
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPt() {
        return tituloPt;
    }

    public void setTituloPt(String tituloPt) {
        this.tituloPt = tituloPt;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
