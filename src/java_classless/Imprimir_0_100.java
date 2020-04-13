package java_classless;

public class Imprimir_0_100 {

    public static void main(String[] args) {

        //1 - Imprima todos os números de 0 a 100 utilizando for, while e do/while.

        //          USANDO O FOR
        for (int i = 0; i <= 100; i++) {
            System.out.println("Número: " + i);
        }

        //          USANDO O WHILE
        int n = 0;
        while( n <= 100 ){
            System.out.println(n);
            n++;
        }

        //          Usando o DO WHILE
        int n1 = 0;
        do{
            System.out.println(n1);
            n1++;
        } while (n1 <= 100);

    }
}