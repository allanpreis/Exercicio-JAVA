import java.util.Random;

public class Desafio {
    public static void main(String[] args) {

        //Gerar números aleáatórios INICIO
        Random random = new Random();
        Random ran = new Random();
        //Gerar números aleáatórios FIM

        int numero = ran.nextInt(100);
        int numero2 = ran.nextInt(100);
        int resultado = numero + numero2;
        int resultado2 = numero / numero2;
        int resultado3 = numero * numero2;
        int resultado4 = numero - numero2;

        //Dizer se é ímpar ou par INICIO
       int resto = resultado % 2;
        if (resto == 0) {
            System.out.println("A soma dos números "+numero+" + "+numero2+" deu: "+ resultado +" e é par");
        } else {
            System.out.println("A soma dos números "+numero+" + "+numero2+" deu: "+ resultado + " sendo ímpar");
        }
        //Dizer se é ímpar ou par FIM

        System.out.println("A subtração dos números "+numero+" + "+numero2+" deu: "+ resultado4);
        System.out.println("A multiplicação dos números "+numero+" + "+numero2+" deu: "+ resultado3);
        System.out.println("A divisão dos números "+numero+" + "+numero2+" deu: "+ resultado2);

    }
}
