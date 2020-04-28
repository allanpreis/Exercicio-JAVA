package java_class.caixa_eletronico;

import java.time.LocalDate;

public class CaixaEletronico {

    private Conta contaAtiva;

    public float sacar(float valor){

        if(valor > contaAtiva.getSaldo()){
            System.out.println("Saldo insuficiente.");
        } else{
            float saldoRestante = contaAtiva.getSaldo() - valor;
            contaAtiva.setSaldo(saldoRestante);
        }

        return contaAtiva.getSaldo();
    }

    public float depositar(float valor){

        if (valor <= 0) {
            System.out.println("Valor de deposito inválido.");
        } else {
            contaAtiva.setSaldo(valor + contaAtiva.getSaldo());
        }
        return contaAtiva.getSaldo();
    }

    public void imprimirDadosConta(){
        System.out.println("-----------------------");
        System.out.println("FIAP BANK");
        System.out.println("Nome: "+contaAtiva.getTitular().getNome());
        System.out.println("Conta: "+contaAtiva.getNumeroConta());
        System.out.println("Saldo: R$"+contaAtiva.getSaldo());
        System.out.println("-----------------------");
    }

    public Conta getContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(Conta contaAtiva) {
        this.contaAtiva = contaAtiva;
    }
    public boolean senhaCorreta(String senhaDigitada){
        if(!contaAtiva.getSenha().equals(senhaDigitada)){
            System.out.println("Senha inválida");
            return false;
        } else {
            System.out.println("Bem-vindo "+contaAtiva.getTitular().getNome());
            System.out.println("Entrando....");
            return true;
        }
    }

    public void sair(){
        System.out.println("Saindo...");
        contaAtiva = null;
    }

    public boolean ativo(){
        return contaAtiva != null;
    }


}
