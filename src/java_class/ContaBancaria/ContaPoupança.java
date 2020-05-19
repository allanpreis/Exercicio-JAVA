package java_class.ContaBancaria;

import java.io.Serializable;

public class ContaPoupança extends ContaBancaria  implements Serializable {

    private double taxaJuros;

    public void atualizarSaldo(){
       double novoSaldo = getSaldo() + (getSaldo()*(taxaJuros/100));
       setSaldo(novoSaldo);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
