package br.com.empresa.erpfatecie.domain.model;

import gumga.framework.domain.GumgaModel;
import gumga.framework.domain.GumgaMultitenancy;
import org.hibernate.envers.Audited;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.util.Date;

/**
 * Created by gella on 11/09/16.
 */
@GumgaMultitenancy
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_PRODUCT")
@Indexed
@Audited
@Entity
public class Produto extends GumgaModel<Long> {

    private String nome;
    private String codigoBarra;
    private String descricao;
    private Double preco;
    private Date dt_cadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Date getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(Date dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }
}
