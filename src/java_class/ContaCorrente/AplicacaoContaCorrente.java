package java_class.ContaCorrente;

import javax.swing.*;

public class AplicacaoContaCorrente {

    private ContaCorrente contaCorrente;

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Essa será sua conta corrente.\nInsira seu nome: ", "Bem-Vindo!", 1);

        ContaCorrente contaativa = new ContaCorrente();
        contaativa.setTitular(nome);
        contaativa.setSaldo(0);

        String opcao = JOptionPane.showInputDialog(null, "[1] - Depositar\n[2] - Saque\n[3] - Saldo\n[4] - Sair", "Opções:", 1);
        int inteiro = Integer.parseInt(opcao);
        switch (inteiro){
            case 1:
                String deposito = JOptionPane.showInputDialog(null, "Quanto deseja depositar:", "Deposito", 3);
                float emFloatd = Float.parseFloat(deposito);
                contaativa.deposito(emFloatd);
                break;
            case 2:
                String sacar = JOptionPane.showInputDialog(null, "Quando deseja sacar:", "Saque", 3);
                float emFloats = Float.parseFloat(sacar);
                contaativa.saque(emFloats);
                break;
            case 3:
                contaativa.exibirSaldo();
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida. Tente novamente.", "Erro", 0);
        }
    }
}
