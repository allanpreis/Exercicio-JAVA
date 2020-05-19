package java_classless;

import javax.swing.*;

public class ConverterTextoNumero {

    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        String booleano = JOptionPane.showInputDialog("Digite um booleano: ");

        int inteiro = Integer.parseInt(idade);
        short emShort = Short.parseShort(idade);
        long longo = Long.parseLong(idade);
        float emFloat = Float.parseFloat(idade);
        double emDouble = Double.parseDouble(idade);
        byte emByte = Byte.parseByte(idade);
        boolean emBoolean = Boolean.parseBoolean(booleano);

        JOptionPane.showMessageDialog(null,"Idade digitada em inteiro: "+inteiro+"\nshort: "+emShort+"\nlong: "+longo+"\nfloat: "+emFloat+"\ndouble: "+emDouble+"\nbyte: "+emByte);
        JOptionPane.showMessageDialog(null, "Em booleano: "+emBoolean);
    }
}
