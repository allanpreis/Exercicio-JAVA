package java_class.PetShop;

import javax.swing.*;
import java.io.Serializable;

public class Animal implements Serializable {

    private String nome;
    private String tipo;
    private String porte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
