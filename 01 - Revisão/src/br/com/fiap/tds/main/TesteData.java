package br.com.fiap.tds.main;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {

    public static void main(String[] args) {

        //Intanciar um objeto de data com a data atual
        Calendar hoje = Calendar.getInstance();

        //Recuperar o dia do mês (YEAR, MONTH)
        int dia = hoje.get(Calendar.DAY_OF_MONTH);

        //Intanciar um objeto de data com a data de entrega da challenge
        Calendar challenge = new GregorianCalendar(2021 ,Calendar.APRIL,4, 4,12,2);

        //Objeto que formata a data
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Exibir a data
        JOptionPane.showMessageDialog(null, formatador.format(hoje.getTime()));

        //Exibir a data de entrega da challenge
        JOptionPane.showMessageDialog(null, formatador.format(challenge.getTime()));

    }
}
