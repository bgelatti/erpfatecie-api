package br.com.empresa.erpfatecie.domain.model;

import gumga.framework.domain.GumgaModel;
import gumga.framework.domain.GumgaMultitenancy;
import org.hibernate.envers.Audited;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;

/**
 * Created by gelatti on 13/11/17.
 */
@GumgaMultitenancy
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_MATERIA")
@Indexed
@Audited
@Entity
public class Materia extends GumgaModel<Long> {

    private String nome;
    private BigDecimal carga_horaria;
    private String professor;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(BigDecimal carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
