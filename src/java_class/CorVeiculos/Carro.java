package java_class.CorVeiculos;

import javax.swing.*;
import java.io.Serializable;

public class Carro extends Veiculos implements Serializable {


    private int quantidadePortas;
    private String placa;
    private  float motor = 1.0F;

    public void detalhesveiculo(){
        JOptionPane.showMessageDialog(null,"Modelo: "+getModelo()+
                "\nQuantidade de lugares: "+getQuantidadeLugares()+
                "\nComprimento: "+getComprimento()+
                "\nAno de fabricação: "+getAnoFabricacao()+
                "\nCor: "+getCor().getNome()+
                "\nPlaca: "+getPlaca()+
                "\nMotor: "+getMotor(),"Detalhes do veiculo: ", 1);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
