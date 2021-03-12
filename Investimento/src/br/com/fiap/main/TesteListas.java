package br.com.fiap.main;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TesteListas {

    public static void main(String[] args) {
        List<ContaCorrente> lista = new ArrayList<>();

        lista.add(new ContaCorrente(2856, 318949, Calendar.getInstance(), 5000, TipoConta.COMUM));
        lista.add(new ContaCorrente(2856, 489213, new GregorianCalendar(2007, Calendar.MARCH, 15), 100000, TipoConta.PREMIUM));
        lista.add(new ContaCorrente(2856, 265947, Calendar.getInstance(), 9000, TipoConta.ESPECIAL));

        for (int i = 0; i < lista.size(); i++){
            JOptionPane.showMessageDialog(null,"Agência: " + lista.get(i).getAgencia()+ "\n" + "Número da Conta: " + lista.get(i).getNumero() + "\n" + "Saldo: " + lista.get(i).getSaldo() + "\n" + "Conta: " + lista.get(i).getTipo(), "Banco", 1 );
        }
    }
}
