package br.com.empresa.erpfatecie.domain.model;

import gumga.framework.domain.GumgaModel;
import gumga.framework.domain.GumgaMultitenancy;
import org.hibernate.envers.Audited;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.util.Date;

/**
 * Created by gella on 19/09/16.
 */
@GumgaMultitenancy
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_PESSOA")
@Indexed
@Audited
@Entity
public class Pessoa extends GumgaModel<Long> {

    private String nome;
    private Date dt_nascimento;
    private String rg_ie;
    private String cpf_cnpj;
    private String apelido;
    private String telefone;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getRg_ie() {
        return rg_ie;
    }

    public void setRg_ie(String rg_ie) {
        this.rg_ie = rg_ie;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
