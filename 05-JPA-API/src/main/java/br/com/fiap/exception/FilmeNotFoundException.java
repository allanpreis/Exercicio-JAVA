package br.com.fiap.exception;

public class FilmeNotFoundException extends Throwable {
    public FilmeNotFoundException(){
        super("Filme não encontrado!");
    }

    public FilmeNotFoundException(String msg){
        super(msg);
    }
}
