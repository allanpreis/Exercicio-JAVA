package br.com.fiap.entity;

import oracle.sql.DATE;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista {

    @Id
    @Column(name = "nr_carteira")
    private int numeroCarteira;

    @Column(name = "nm_motorista", nullable = false, length = 150)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nascimento")
    private Calendar dataNascimento;

    @Lob
    @Column(name = "fl_carteira")
    private byte[] carteira;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_genero")
    private Genero genero;

    public Motorista(){}

    public Motorista(String nome, Calendar dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public byte[] getCarteira() {
        return carteira;
    }

    public void setCarteira(byte[] carteira) {
        this.carteira = carteira;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
