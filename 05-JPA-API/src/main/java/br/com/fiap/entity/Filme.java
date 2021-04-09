package br.com.fiap.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="TB_FILME")
@SequenceGenerator(name="filme", sequenceName = "SQ_TB_FILME", allocationSize = 1)
public class Filme {

    @Id
    @Column(name = "cd_filme")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "filme")
    private int codigo;

    @Column(name = "nm_filme", nullable = false, length = 60)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_lancamento", nullable = false, updatable = false)
    private Calendar dataLancamento;

    @CreationTimestamp //Insere a data de cadastro automáticamente
    @Temporal(TemporalType.TIMESTAMP) //Grava data e hora
    @Column(name = "dt_cadastro", nullable = false, updatable = false)
    private Calendar dataCadastro;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_genero", nullable = false, length = 40)
    private GeneroFilme genero;

    @Column(name = "ds_sinopse")
    private String sinopse;

    @Column(name = "st_premiado")
    private boolean premiado;

    public Filme(){}

    public Filme(String nome, Calendar dataLancamento, GeneroFilme genero, String sinopse, boolean premiado) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.sinopse = sinopse;
        this.premiado = premiado;
    }

    public Filme(int codigo, String nome, Calendar dataLancamento, GeneroFilme genero, String sinopse, boolean premiado) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.sinopse = sinopse;
        this.premiado = premiado;
    }

    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public GeneroFilme getGenero() {
        return genero;
    }

    public void setGenero(GeneroFilme genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public boolean isPremiado() {
        return premiado;
    }

    public void setPremiado(boolean premiado) {
        this.premiado = premiado;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
