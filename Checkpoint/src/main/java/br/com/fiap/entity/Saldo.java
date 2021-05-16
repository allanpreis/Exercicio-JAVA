package br.com.fiap.entity;

import javax.persistence.*;
import java.util.Calendar;

@Table(name = "SALDO")
public class Saldo {

    @Column(name = "SALDO", nullable = false)
    private double saldo;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_SALDO", nullable = false)
    private Calendar dataSaldo;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "cd_estabelecimento")
    private Estabelecimento estabelecimento;

    public Saldo(double saldo, Calendar dataSaldo, Estabelecimento estabelecimento) {
        this.saldo = saldo;
        this.dataSaldo = dataSaldo;
        this.estabelecimento = estabelecimento;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Calendar getDataSaldo() {
        return dataSaldo;
    }

    public void setDataSaldo(Calendar dataSaldo) {
        this.dataSaldo = dataSaldo;
    }
}
