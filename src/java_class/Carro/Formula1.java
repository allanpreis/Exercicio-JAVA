package java_class.Carro;

import java.io.Serializable;

public class Formula1 extends Carro implements Serializable {

    private String equipe;

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
