package java_class.PetShop;

import javax.swing.*;

public class ServicoPetShop {

    public static void main(String[] args) {
        int cadastroAnimal = JOptionPane.showConfirmDialog(null,"Cadastrar um animal?", "Cadastro Animal", JOptionPane.YES_NO_OPTION);
        if (cadastroAnimal == JOptionPane.YES_NO_OPTION){
            int cont = 0;
            while(cont<5){
                PetShop animal = new PetShop();
                String nome = JOptionPane.showInputDialog(null ,"Nome do animal:", "Fixa do Animal", 1);
                animal.setNome(nome);
                String porte = JOptionPane.showInputDialog(null ,"Porte do animal [PEQUENO | MEDIO | GRANDE]", "Fixa do Animal", 1);
                animal.setPorte(porte);
                String tipo = JOptionPane.showInputDialog(null ,"Tipo do animal [CACHORRO | GATO | OUTROS]", "Fixa do Animal", 1);
                animal.setTipo(tipo);
                animal.getExaminar();

                animal.detalhesAnimal();
                cont++;
            }
        }
    }
}
