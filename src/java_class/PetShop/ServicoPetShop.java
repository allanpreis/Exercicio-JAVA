package java_class.PetShop;

import javax.swing.*;

public class ServicoPetShop {

    public static void main(String[] args) {


        PetShop animal1 = new PetShop();
        String nome = JOptionPane.showInputDialog(null ,"Insira o nome de seu animal:", "Fixa do Animal", 1);
        animal1.setNome(nome);
        String porte = JOptionPane.showInputDialog(null ,"Porte do animal [PEQUENO | MEDIO | GRANDE]", "Fixa do Animal", 1);
        animal1.setPorte(porte);
        String tipo = JOptionPane.showInputDialog(null ,"Tipo do animal [CACHORRO | GATO | OUTROS]", "Fixa do Animal", 1);
        animal1.setTipo(tipo);
        animal1.getExaminar();

        animal1.detalhesAnimal(); // total R$210

        PetShop animal2 = new PetShop();
        String nome2 = JOptionPane.showInputDialog(null ,"Insira o nome de seu animal:", "Fixa do Animal", 1);
        animal2.setNome(nome2);
        String porte2 = JOptionPane.showInputDialog(null ,"Porte do animal [PEQUENO | MEDIO | GRANDE]", "Fixa do Animal", 1);
        animal2.setPorte(porte2);
        String tipo2 = JOptionPane.showInputDialog(null ,"Tipo do animal [CACHORRO | GATO | OUTROS]", "Fixa do Animal", 1);
        animal2.setTipo(tipo2);
        animal2.getExaminar();

        animal2.detalhesAnimal(); // total R$210

        PetShop animal3 = new PetShop();
        String nome3 = JOptionPane.showInputDialog(null ,"Insira o nome de seu animal:", "Fixa do Animal", 1);
        animal3.setNome(nome3);
        String porte3 = JOptionPane.showInputDialog(null ,"Porte do animal [PEQUENO | MEDIO | GRANDE]", "Fixa do Animal", 1);
        animal3.setPorte(porte3);
        String tipo3 = JOptionPane.showInputDialog(null ,"Tipo do animal [CACHORRO | GATO | OUTROS]", "Fixa do Animal", 1);
        animal3.setTipo(tipo3);
        animal3.getExaminar();

        animal3.detalhesAnimal(); // total R$220

        PetShop animal4 = new PetShop();
        String nome4 = JOptionPane.showInputDialog(null ,"Insira o nome de seu animal:", "Fixa do Animal", 1);
        animal4.setNome(nome4);
        String porte4 = JOptionPane.showInputDialog(null ,"Porte do animal [PEQUENO | MEDIO | GRANDE]", "Fixa do Animal", 1);
        animal4.setPorte(porte4);
        String tipo4 = JOptionPane.showInputDialog(null ,"Tipo do animal [CACHORRO | GATO | OUTROS]", "Fixa do Animal", 1);
        animal4.setTipo(tipo4);
        animal4.getExaminar();

        animal4.detalhesAnimal(); // total R$280

        PetShop animal5 = new PetShop();
        String nome5 = JOptionPane.showInputDialog(null ,"Insira o nome de seu animal:", "Fixa do Animal", 1);
        animal5.setNome(nome5);
        String porte5 = JOptionPane.showInputDialog(null ,"Porte do animal [PEQUENO | MEDIO | GRANDE]", "Fixa do Animal", 1);
        animal5.setPorte(porte5);
        String tipo5 = JOptionPane.showInputDialog(null ,"Tipo do animal [CACHORRO | GATO | OUTROS]", "Fixa do Animal", 1);
        animal5.setTipo(tipo5);
        animal5.getExaminar();

        animal5.detalhesAnimal(); // total R$210
    }
}
