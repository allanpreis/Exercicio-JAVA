package br.com.fiap.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * SQ_TB_CLIENTE
 * TB_CLIENTE
 *
 * cd_cliente       NUMBER PK NOT NULL
 * nm_cliente       VARCHAR(50) NOT NULL
 * ds_email         VARCHAR(100)
 * dt_nascimento    DATE
 */
@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name= "cliente", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {

    @Id
    @Column(name = "cd_cliente")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    private int codigo;

    @Column(name = "nm_cliente", nullable = false, length = 50)
    private String nome;

    @Column(name = "ds_email", length = 100)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nascimento")
    private Calendar dataNascimento;

    public Cliente(int codigo, String nome, String email, Calendar dataNascimento) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
