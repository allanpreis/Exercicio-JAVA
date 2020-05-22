package java_class.Carro;

import java.io.Serializable;

public class CarroPasseio extends Carro implements Serializable {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
