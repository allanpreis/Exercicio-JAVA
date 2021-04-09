package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(name = "filme", sequenceName = "SQ_T_VEICULO", allocationSize = 1)
public class Veiculo {

    @Id
    @Column(name = "cd_veiculo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo")
    private int codigo;

    @Column(name = "ds_placa", nullable = false, length = 9)
    private String placa;

    @Column(name = "ds_cor", nullable = false, length = 20)
    private String cor;

    @Column(name = "nr_ano")
    private int ano;

    public int getCodigo() {
        return codigo;
    }

    public Veiculo(){}

    public Veiculo(String placa, String cor, int ano) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
