package java_class.CorVeiculos;

import javax.swing.*;
import java.io.Serializable;

public class Aviao extends Veiculos implements Serializable {


    private String prefixo;
    private int quantiadadeTurbinas;

    public void detalhesveiculo(){
        JOptionPane.showMessageDialog(null,"Modelo: "+getModelo()+
                "\nQuantidade de lugares: "+getQuantidadeLugares()+
                "\nComprimento: "+getComprimento()+
                "\nAno de fabricação: "+getAnoFabricacao()+
                "\nCor: "+getCor().getNome()+
                "\nPrefixo: "+getPrefixo()+
                "\nQuantidade de Turbinas: "+getQuantiadadeTurbinas(), "Detalhes do veiculo: ", 1);
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getQuantiadadeTurbinas() {
        return quantiadadeTurbinas;
    }

    public void setQuantiadadeTurbinas(int quantiadadeTurbinas) {
        this.quantiadadeTurbinas = quantiadadeTurbinas;
    }
}
