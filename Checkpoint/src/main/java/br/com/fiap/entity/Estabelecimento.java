package br.com.fiap.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CADASTRO_ESTABELECIMENTO")
public class Estabelecimento {

    @Id
    @Column(name = "COD_ESTABELECIMENTO", length = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
    private int codigo;

    @Column(name = "NOME_FANTASIA", nullable = false, length = 50)
    private String nomeFantasia;

    @Column(name = "RAZAO_SOCIAL", nullable = false, length = 50)
    private String razaoSocial;

    @Column(name = "CNPJ",nullable = false, length = 14)
    private int cnpj;

    @Enumerated(EnumType.STRING)
    @Column(name = "RAMO_ATUACAO")
    private Ramo ramo;

    @Column(name = "ENDERECO", nullable = false, length = 50)
    private String endereco;
    
    @Column(name = "TELEFONE", length = 12)
    private int telefone;

    @OneToMany(mappedBy = "produtos", cascade = CascadeType.PERSIST)
    private List<Produto> produtos = new ArrayList<Produto>();

    @ManyToOne
    @JoinColumn(name="cd_usuario")
    private Usuario usuario;

    @OneToOne(mappedBy = "saldo")
    private Saldo saldo;

    public Estabelecimento(){
    }


    public Estabelecimento(int codigo, String nomeFantasia, String razaoSocial, int cnpj, Ramo ramo, String endereco, int telefone) {
        this.codigo = codigo;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ramo = ramo;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
        produto.setEstabaelecimento(this);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Ramo getRamo() {
        return ramo;
    }

    public void setRamo(Ramo ramo) {
        this.ramo = ramo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
