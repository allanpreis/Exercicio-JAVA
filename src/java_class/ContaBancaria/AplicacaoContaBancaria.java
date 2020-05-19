package java_class.ContaBancaria;

public class AplicacaoContaBancaria {

    public static void main(String[] args) {

        ContaCorrente cliente1 = new ContaCorrente();
        cliente1.depositar(800);
        cliente1.sacar(1000);
        cliente1.sacar(100);
        cliente1.detalhesDaConta();


        ContaPoupança cliente2 = new ContaPoupança();
        cliente2.depositar(8000);
        cliente2.setTaxaJuros(10);
        cliente2.atualizarSaldo();
        cliente2.detalhesDaConta();

    }
}
