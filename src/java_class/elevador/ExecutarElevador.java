package java_class.elevador;

import java.util.Scanner;

public class ExecutarElevador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Elevador elevador = new Elevador();
        elevador.inicializar(4,3);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        elevador.descer();

        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.sair();
        elevador.sair();
        elevador.sair();
        elevador.sair();

    }
}
