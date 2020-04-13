package java_classless;

import java.util.Scanner;

public class TEMPERATURA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = scanner.next();

        System.out.print("Olá "+nome+".\nInsira a temperatura atual em graus Célsius para exibir quanto ela representa em Fahrenheit\n");

        System.out.print("Insira a tempertura atual: ");
        float celsius = scanner.nextFloat();

        float fahrenheit = ((9*celsius)/5)+32;

        System.out.printf("\nA temperatura atual em Fahrenheit é %.0f °F",(fahrenheit));
    }
}
