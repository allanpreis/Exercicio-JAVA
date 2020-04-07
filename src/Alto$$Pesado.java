import java.util.Scanner;

public class Alto$$Pesado {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Insira seu nome");
          String nome1 = scanner.next();

          System.out.println("Insira sua altura");
          float altura1 = scanner.nextFloat();

          System.out.println("Insira seu peso");
          float peso1 = scanner.nextFloat();

          System.out.println("Insira o nome da outra pessoa");
          String nome2 = scanner.next();

          System.out.println("Insira a altura");
          float altura2 = scanner.nextFloat();

          System.out.println("Insira seu peso");
          float peso2 = scanner.nextFloat();

          if (peso1 > peso2){
            System.out.println("O(A) mais pesado é o(a) "+nome1);
        }else if (peso1 < peso2){
            System.out.println("O(A) mais pesado é o(a) "+nome2);
        }else{
            System.out.println("O(A) dois tem o mesmo peso");
        }
        if (altura1 > altura2){
            System.out.println("O(A) mais alto é o(a) "+nome1);
        }else if (altura1 < altura2){
            System.out.println("O(A) mais alto é o(a) "+nome2);
        }else {
            System.out.println("O(A) dois possuem a mesma altura");
        }

    }
}
