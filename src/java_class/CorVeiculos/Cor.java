package java_class.CorVeiculos;

import java.io.Serializable;

public class Cor implements Serializable {

    private String nome;
    private int r = 0;
    private int g = 0;
    private int b = 0;

    public Cor(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public Cor(String nome,int r, int g, int b ){
        this.nome = nome;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
