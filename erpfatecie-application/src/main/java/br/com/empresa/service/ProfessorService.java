package br.com.empresa.service;

import br.com.empresa.erpfatecie.domain.model.Professor;
import br.com.empresa.repository.ProfessorRepository;
import gumga.framework.application.GumgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gelatti on 13/11/17.
 */
@Service
public class ProfessorService extends GumgaService<Professor, Long> {

    private ProfessorRepository repository;

    @Autowired
    public ProfessorService(ProfessorRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
