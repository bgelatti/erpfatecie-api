package br.com.empresa.service;

import br.com.empresa.erpfatecie.domain.model.Materia;
import br.com.empresa.repository.MateriaRepository;
import gumga.framework.application.GumgaService;
import gumga.framework.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gelatti on 13/11/17.
 */
@Service
public class MateriaService extends GumgaService<Materia, Long> {

    private MateriaRepository repository;

    @Autowired
    public MateriaService(MateriaRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
