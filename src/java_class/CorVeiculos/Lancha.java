package java_class.CorVeiculos;

import javax.swing.*;
import java.io.Serializable;

public class Lancha extends Veiculos implements Serializable {

    private int quantidadeMotores;

    public void detalhesveiculo(){
        JOptionPane.showMessageDialog(null,"Modelo: "+getModelo()+
                "\nQuantidade de lugares: "+getQuantidadeLugares()+
                "\nComprimento: "+getComprimento()+
                "\nAno de fabricação: "+getAnoFabricacao()+
                "\nCor: "+getCor().getNome()+
                "\nQuantidade de motores: "+getQuantidadeMotores(), "Detalhes do veiculo:", 1);
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }
}
